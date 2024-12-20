package lp1.tarefa4.dao;

import lp1.tarefa4.model.Cachorro;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CachorroDAO extends ConexaoDAO {

    // POST
    public int cadastrar(Cachorro cachorro) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "INSERT INTO cachorro (nome, raca, cor) VALUES (?, ?, ?)";
            con.setAutoCommit(false);

            // Usando RETURN_GENERATED_KEYS para obter o ID gerado automaticamente pelo banco de dados.
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cachorro.getNome());
            stmt.setString(2, cachorro.getRaca());
            stmt.setString(3, cachorro.getCor());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int idGerado = generatedKeys.getInt(1); // Obtém o primeiro ID gerado.
                    con.commit();
                    return idGerado;
                }
            }

            con.commit();
            return -1; // Retorna -1 caso não seja gerado um ID (deve ser raro).
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException("Erro ao adicionar o cachorro!");
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
    public List<Cachorro> getCachorros() {
        List<Cachorro> cachorros = new ArrayList<>();
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM cachorro";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Cachorro cachorro = new Cachorro();
                cachorro.setId(rs.getInt("id"));
                cachorro.setNome(rs.getString("nome"));
                cachorro.setRaca(rs.getString("raca"));
                cachorro.setCor(rs.getString("cor"));
                cachorros.add(cachorro);
            }

            return cachorros;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar cachorros!");
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
    public Cachorro getCachorroById(int id) {
        Cachorro cachorro = null;
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM cachorro WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cachorro = new Cachorro();
                cachorro.setId(rs.getInt("id"));
                cachorro.setNome(rs.getString("nome"));
                cachorro.setRaca(rs.getString("raca"));
                cachorro.setCor(rs.getString("cor"));
            }

            return cachorro;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar cachorro por ID!");
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

    // UPDATE
    public boolean update(Cachorro cachorro) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "UPDATE cachorro SET nome = ?, raca = ?, cor = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, cachorro.getNome());
            stmt.setString(2, cachorro.getRaca());
            stmt.setString(3, cachorro.getCor());
            stmt.setInt(4, cachorro.getId());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar cachorro!");
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
    public boolean delete(int id) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "DELETE FROM cachorro WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao excluir cachorro!");
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

