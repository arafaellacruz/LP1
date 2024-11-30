package lp1.tarefa4.dao;

import lp1.tarefa4.model.Celular;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CelularDAO extends ConexaoDAO {

    // POST
    public int cadastrar(Celular celular) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "INSERT INTO celular (modelo, marca, cor) VALUES (?, ?, ?)";
            con.setAutoCommit(false);

            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, celular.getModelo());
            stmt.setString(2, celular.getMarca());
            stmt.setString(3, celular.getCor());

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
            throw new RuntimeException("Erro ao cadastrar o celular!");
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
    public List<Celular> getCelulares() {
        List<Celular> celulares = new ArrayList<>();
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM celular";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Celular celular = new Celular(
                        rs.getString("modelo"),
                        rs.getString("marca"),
                        rs.getString("cor")
                );
                celulares.add(celular);
            }

            return celulares;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar celulares!");
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
    public Celular getCelularById(int id) {
        Celular celular = null;
        Connection con = null;

        try {
            con = getConnection();
            String sql = "SELECT * FROM celular WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                celular = new Celular(
                        rs.getString("modelo"),
                        rs.getString("marca"),
                        rs.getString("cor")
                );
            }

            return celular;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar celular por ID!");
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
    public boolean update(int id, Celular celular) {
        Connection con = null;

        try {
            con = getConnection();
            String sql = "UPDATE celular SET modelo = ?, marca = ?, cor = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, celular.getModelo());
            stmt.setString(2, celular.getMarca());
            stmt.setString(3, celular.getCor());
            stmt.setInt(4, id);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar celular!");
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
            String sql = "DELETE FROM celular WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao excluir celular!");
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
