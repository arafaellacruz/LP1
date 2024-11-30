package lp1.tarefa4.dao;

import lp1.tarefa4.model.Gato;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GatoDAO extends ConexaoDAO {

    // POST
    public int cadastrar(Gato gato) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "INSERT INTO gato (nome, raca, idade) VALUES (?, ?, ?)";
            con.setAutoCommit(false);

            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, gato.getNome());
            stmt.setString(2, gato.getRaca());
            stmt.setInt(3, gato.getIdade());

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
            throw new RuntimeException("Erro ao cadastrar o gato!");
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
    public List<Gato> getGatos() {
        List<Gato> gatos = new ArrayList<>();
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM gato";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Gato gato = new Gato(
                        rs.getString("nome"),
                        rs.getString("raca"),
                        rs.getInt("idade")
                );
                gatos.add(gato);
            }

            return gatos;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar gatos!");
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
    public Gato getGatoById(int id) {
        Gato gato = null;
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM gato WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                gato = new Gato(
                        rs.getString("nome"),
                        rs.getString("raca"),
                        rs.getInt("idade")
                );
            }

            return gato;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar gato por ID!");
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
    public boolean update(int id, Gato gato) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "UPDATE gato SET nome = ?, raca = ?, idade = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, gato.getNome());
            stmt.setString(2, gato.getRaca());
            stmt.setInt(3, gato.getIdade());
            stmt.setInt(4, id);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar gato!");
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
            String sql = "DELETE FROM gato WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao excluir gato!");
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
