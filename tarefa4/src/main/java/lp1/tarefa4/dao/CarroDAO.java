package lp1.tarefa4.dao;

import lp1.tarefa4.model.Carro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO extends ConexaoDAO {

    // POST
    public int cadastrar(Carro carro) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "INSERT INTO carro (modelo, marca, cor) VALUES (?, ?, ?)";
            con.setAutoCommit(false);

            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, carro.getModelo());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getCor());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idGerado = generatedKeys.getInt(1);
                    con.commit();
                    return idGerado;
                }
            }

            con.commit();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException("Erro ao cadastrar o carro!");
        } finally {
            try {
                if (con != null) {
                    con.setAutoCommit(true);
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
            }
        }
    }

    // GET ALL
    public List<Carro> getCarros() {
        List<Carro> carros = new ArrayList<>();
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM carro";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Carro carro = new Carro(
                        rs.getString("modelo"),
                        rs.getString("marca"),
                        rs.getString("cor")
                );
                carros.add(carro);
            }

            return carros;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar carros!");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
            }
        }
    }

    // GET BY ID
    public Carro getCarroById(int id) {
        Carro carro = null;
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM carro WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                carro = new Carro(
                        rs.getString("modelo"),
                        rs.getString("marca"),
                        rs.getString("cor")
                );
            }

            return carro;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar carro por ID!");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
            }
        }
    }

    public Carro getCarroPorModeloMarcaCor(String modelo, String marca, String cor) {
        // Consultar o banco de dados para verificar se já existe um carro com os mesmos dados
        String query = "SELECT * FROM carro WHERE modelo = ? AND marca = ? AND cor = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, modelo);
            stmt.setString(2, marca);
            stmt.setString(3, cor);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Se encontrar um carro, retornar o objeto Carro correspondente
                return new Carro(rs.getString("modelo"), rs.getString("marca"), rs.getString("cor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retorna null se não encontrar nenhum carro
    }


    // UPDATE
    public boolean update(Carro carro) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "UPDATE carro SET modelo = ?, marca = ?, cor = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, carro.getModelo());
            stmt.setString(2, carro.getMarca());
            stmt.setString(3, carro.getCor());
            stmt.setInt(4, carro.getId());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar carro!");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
            }
        }
    }

    // DELETE
    public boolean delete(Carro id) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "DELETE FROM carro WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id.getId());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao excluir carro!");
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
            }
        }
    }
}
