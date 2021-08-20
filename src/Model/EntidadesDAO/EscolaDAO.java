package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Model.Entidades.Escola;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EscolaDAO {

    private ConexaoJDBC conexao = new ConexaoJDBC();


    //Buscar escolas pela descrição
    public List<Escola> findByNomeEscola(Escola escola) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Escola> escolas = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM escola WHERE nome = ?");
            ps.setString(1, escola.getNome());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Escola escolaConsultado = new Escola();
                escolaConsultado.setNome(rs.getString("nome"));
                escolaConsultado.setEndereco(rs.getString("endereco"));
                escolaConsultado.setFone(rs.getString("fone"));
                escolaConsultado.setResponsavel(rs.getString("responsavel"));

                escolas.add(escolaConsultado);

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

        return escolas;
    }

    //Busca todos os escolas
    public List<Escola> findAll() {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Escola> escolas = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM escola");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Escola escolaConsultado = new Escola();
                escolaConsultado.setId(rs.getInt("id"));
                escolaConsultado.setNome(rs.getString("nome"));
                escolaConsultado.setEndereco(rs.getString("endereco"));
                escolaConsultado.setFone(rs.getString("fone"));
                escolaConsultado.setResponsavel(rs.getString("responsavel"));

                escolas.add(escolaConsultado);

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

        return escolas;
    }

    public Escola findById(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        Escola escolaConsultado = new Escola();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM escola WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                escolaConsultado.setNome(rs.getString("nome"));
                escolaConsultado.setEndereco(rs.getString("endereco"));
                escolaConsultado.setFone(rs.getString("fone"));
                escolaConsultado.setResponsavel(rs.getString("responsavel"));
                
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

        return escolaConsultado;
    }

//inseri escola no banco 
    public void inserirEscola(Escola escola) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        try {
            String sql = "INSERT INTO escola(nome,endereco,fone,responsavel) VALUES(?,?,?,?)";
            con = conexao.getConexao();
            ps = con.prepareStatement(sql);
            ps.setString(1, escola.getNome());
            ps.setString(2, escola.getEndereco());
            ps.setString(3, escola.getFone());
            ps.setString(4, escola.getResponsavel());
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

        String sql = "DELETE FROM escola WHERE id = ?";

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

    public void update(Escola escola) {

        String sql = "UPDATE escola SET nome = ?, endereco = ?, fone = ?, responsavel = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();

        try {
            //Cria uma conexão com o banco
            conn = conexao.getConexao();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, escola.getNome());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, escola.getEndereco());
            //Adiciona o valor do terceiro parâmetro da sql
            pstm.setString(3, escola.getFone());
            pstm.setString(4, escola.getResponsavel());
            pstm.setInt(5, escola.getId());

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
