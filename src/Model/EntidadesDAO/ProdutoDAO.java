package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Model.Entidades.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private ConexaoJDBC conexao = new ConexaoJDBC();

//    public void criarTabela() {
//        String sql = "CREATE TABLE IF NOT EXISTS tbl_produto"
//                + "("
//                + "id integer PRIMARY KEY,"
//                + "descricao text NOT NULL,"
//                + "medida text "
//                + ");";
//
//        boolean conectou = false;
//
//        try {
//            conectou = this.conexao.conectar();
//
//            Statement stmt = this.conexao.criarStatement();
//
//            stmt.execute(sql);
//
//        } catch (Exception e) {
//
//        } finally {
//            if (conectou) {
//                this.conexao.desconectar();
//            }
//        }
    //  }
    //Buscar produtos pela descrição
    public List<Produto> findByNomeProduto(Produto produto) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Produto> produtos = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM produto WHERE descricao = ?");
            ps.setString(1, produto.getDescricao());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Produto produtoConsultado = new Produto();
                produtoConsultado.setDescricao(rs.getString("descricao"));
                produtoConsultado.setMedida(rs.getString("medida"));

                produtos.add(produtoConsultado);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                    this.conexao.desconectar();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return produtos;
    }

    //Busca todos os produtos
    public List<Produto> findAll() {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Produto> produtos = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM produto");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Produto produtoConsultado = new Produto();
                produtoConsultado.setDescricao(rs.getString("descricao"));
                produtoConsultado.setMedida(rs.getString("medida"));

                produtos.add(produtoConsultado);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                    this.conexao.desconectar();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return produtos;
    }

    public Produto findById(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        Produto produtoConsultado = new Produto();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM produto WHERE descricao = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                produtoConsultado.setDescricao(rs.getString("descricao"));
                produtoConsultado.setMedida(rs.getString("medida"));
            }else{
                return null;
            }
        } catch (SQLException e) {

            e.printStackTrace();

        } finally {

            try {
                if (ps != null) {

                    ps.close();
                }

                if (con != null) {
                    con.close();
                    this.conexao.desconectar();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return produtoConsultado;
    }

//inseri produto no banco 
    public void inserirProduto(Produto produto) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        try {
            String sql = "INSERT INTO produto(descricao,medida) VALUES(?,?)";
            con = conexao.getConexao();
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getDescricao());
            ps.setString(2, produto.getMedida());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                    this.conexao.desconectar();
                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
        }
    }

    public void removeById(int id) {

        String sql = "DELETE FROM produto WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();

        try {
            conn = conexao.getConexao();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, id);

            pstm.execute();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                    this.conexao.desconectar();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public void update(Produto produto) {

        String sql = "UPDATE produto SET descricao = ?, medida = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();

        try {
            //Cria uma conexão com o banco
            conn = conexao.getConexao();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, produto.getDescricao());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, produto.getMedida());
            //Adiciona o valor do terceiro parâmetro da sql
            pstm.setLong(3, produto.getId());

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            //Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                    this.conexao.desconectar();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

}
