package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Model.Entidades.Produto;
import java.sql.*;

public class ProdutoDAO {

    private ConexaoJDBC conexao = new ConexaoJDBC();

    

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_produto"
                + "("
                + "id integer PRIMARY KEY,"
                + "descricao text NOT NULL,"
                + "medida text "
                + ");";

        boolean conectou = false;

        try {
            conectou = this.conexao.conectar();

            Statement stmt = this.conexao.criarStatement();

            stmt.execute(sql);

        } catch (Exception e) {

        } finally {
            if (conectou) {
                this.conexao.desconectar();
            }
        }

    }

    public Produto findByNomeUsuario(String string) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("select * from usuario where nome_usuario = ?");
            ps.setString(1, string);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
//                Usuario usuario = new Usuario();
//                usuario.setId(rs.getInt("id"));
//                usuario.setNomeUsuario(rs.getString("nome_usuario"));
//                usuario.setSenha(rs.getString("senha"));
//                usuario.setNome(rs.getString("nome"));
//                usuario.setUltimoAcesso(rs.getTimestamp("ultimo_acesso"));
                return null;
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void atualizarUltimoAcesso(Integer id, Date data) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("update usuario set ultimo_acesso = ? where id = ?");
            ps.setTimestamp(1, new java.sql.Timestamp(data.getTime()));
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


