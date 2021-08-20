package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Model.Entidades.Fornecedor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {

    private ConexaoJDBC conexao = new ConexaoJDBC();

    
    //Buscar fornecedors pela descrição
    public List<Fornecedor> findByNomeFornecedor(Fornecedor fornecedor) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM fornecedor WHERE nome = ?");
            ps.setString(1, fornecedor.getNome());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedorConsultado = new Fornecedor();
                fornecedorConsultado.setNome(rs.getString("nome"));
                fornecedorConsultado.setEndereco(rs.getString("endereco"));
                fornecedorConsultado.setFone(rs.getString("fone"));

                fornecedores.add(fornecedorConsultado);

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

        return fornecedores;
    }

    //Busca todos os fornecedors
    public List<Fornecedor> findAll() {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Fornecedor> fornecedors = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM fornecedor");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedorConsultado = new Fornecedor();
                fornecedorConsultado.setId(rs.getInt("id"));
                fornecedorConsultado.setNome(rs.getString("nome"));
                fornecedorConsultado.setEndereco(rs.getString("endereco"));
                fornecedorConsultado.setFone(rs.getString("fone"));

                fornecedors.add(fornecedorConsultado);

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

        return fornecedors;
    }

    public Fornecedor findById(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        Fornecedor fornecedorConsultado = new Fornecedor();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM fornecedor WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                fornecedorConsultado.setNome(rs.getString("nome"));
                fornecedorConsultado.setEndereco(rs.getString("endereco"));
                fornecedorConsultado.setFone(rs.getString("fone"));
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

        return fornecedorConsultado;
    }

//inseri fornecedor no banco 
    public void inserirFornecedor(Fornecedor fornecedor) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        try {
            String sql = "INSERT INTO fornecedor(nome,endereco,fone) VALUES(?,?,?)";
            con = conexao.getConexao();
            ps = con.prepareStatement(sql);
            ps.setString(1, fornecedor.getNome());
            ps.setString(2, fornecedor.getEndereco());
            ps.setString(3, fornecedor.getFone());
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

        String sql = "DELETE FROM fornecedor WHERE id = ?";

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

    public void update(Fornecedor fornecedor) {

        String sql = "UPDATE fornecedor SET nome = ?, endereco = ?, fone = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();

        try {
            //Cria uma conexão com o banco
            conn = conexao.getConexao();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, fornecedor.getNome());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, fornecedor.getEndereco());
            //Adiciona o valor do terceiro parâmetro da sql
            pstm.setString(3, fornecedor.getFone());
            pstm.setInt(4, fornecedor.getId());

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
