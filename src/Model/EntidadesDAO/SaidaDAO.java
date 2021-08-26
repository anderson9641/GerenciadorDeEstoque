package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Controler.Entidades.EscolaController;
import Controler.Entidades.ItemSaidaController;
import Model.Entidades.Escola;
import Model.Entidades.Saida;
import Model.Entidades.Fornecedor;
import Model.Entidades.ItemSaida;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class SaidaDAO {

    private ConexaoJDBC conexao = new ConexaoJDBC();


    //Buscar saidas pela descrição
    public List<Saida> findByIdSaida(Saida saida) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Saida> saidas = new ArrayList<>();
        ItemSaidaController itemControlle = new ItemSaidaController();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM saida WHERE id = ?");
            ps.setInt(1, saida.getId());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Saida saidaConsultado = new Saida();
                
                saidaConsultado.setId(rs.getInt("id"));
                saidaConsultado.setDataEntrega(rs.getDate("data"));
                
                Escola escola = new Escola();
                EscolaController escolaControle = new EscolaController();
               // escola = escolaControle.consultarId(rs.getInt("idFornecedor"));
                saidaConsultado.setEscola(escola);
                
                List<ItemSaida> itens = new ArrayList<>();
                itens = itemControlle.consultaItensSaida(rs.getInt("id"));
                
                saidaConsultado.setProdutos(itens);           
                

                saidas.add(saidaConsultado);

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

        return saidas;
    }

    //Busca todos os saidas
    public List<Saida> findAll() throws ParseException {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Saida> saidas = new ArrayList<>();
        ItemSaidaController itemControlle = new ItemSaidaController();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM saida");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Saida saidaConsultado = new Saida();
                
                saidaConsultado.setId(rs.getInt("id"));
                saidaConsultado.setDataEntrega(rs.getString("data"));
                
                
                Escola escola = new Escola();
                EscolaController fornecedorControle = new EscolaController();
                //escola = fornecedorControle.consultarId(rs.getInt("idEscola"));
                saidaConsultado.setEscola(escola);
                
                List<ItemSaida> itens = new ArrayList<>();
                itens = itemControlle.consultaItensSaida(rs.getInt("id"));
                
                saidaConsultado.setProdutos(itens);           
                

                saidas.add(saidaConsultado);

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

        return saidas;
    }

    public Saida findId(String data, int idescola) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        Saida saidaConsultado = new Saida();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM saida WHERE data = ? And idEscola = ?");
            ps.setString(1, data);
            ps.setInt(2, idescola);
            
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                saidaConsultado.setId(rs.getInt("id"));                
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

        return saidaConsultado;
    }

//inseri saida no banco 
    public void inserirSaida(Saida saida) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();
        
        Saida itens = new Saida();
        ItemSaidaController itemControle = new ItemSaidaController();

        try {
            String sql = "INSERT INTO saida(data,idEscola) VALUES(?,?)";
            con = conexao.getConexao();
            ps = con.prepareStatement(sql);
            ps.setString(1, saida.getDataEntrega());
            ps.setInt(2, saida.getEscola().getId());
            ps.executeUpdate();
            
            for(ItemSaida e : saida.getProdutos()){
                itens = findId(saida.getDataEntrega(), saida.getEscola().getId());
                e.setSaida(itens.getId());
                itemControle.inserirItem(e);
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
    }

//    public void removeById(int id) {
//
//        String sql = "DELETE FROM saida WHERE id = ?";
//
//        Connection conn = null;
//        PreparedStatement pstm = null;
//        this.conexao.conectar();
//
//        try {
//            conn = conexao.getConexao();
//
//            pstm = conn.prepareStatement(sql);
//
//            pstm.setInt(1, id);
//
//            pstm.execute();
//
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//
//            try {
//                if (pstm != null) {
//
//                    pstm.close();
//                }
//
//                if (conn != null) {
//                    conn.close();
//                    this.conexao.desconectar();
//                }
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//            }
//        }
//    }

//    public void update(Saida saida) {
//
//        String sql = "UPDATE saida SET notaFiscal = ?, data = ?, idFornecedor = ? WHERE id = ?";
//
//        Connection conn = null;
//        PreparedStatement pstm = null;
//        this.conexao.conectar();
//        
//        ItemSaidaController itemControle = new ItemSaidaController();
//
//        try {
//            //Cria uma conexão com o banco
//            conn = conexao.getConexao();
//
//            //Cria um PreparedStatment, classe usada para executar a query
//            pstm = conn.prepareStatement(sql);
//
//            //Adiciona o valor do primeiro parâmetro da sql
//            pstm.setString(1, saida.getNotaFiscal());
//            //Adicionar o valor do segundo parâmetro da sql
//            pstm.setString(2, saida.getData());
//            //Adiciona o valor do terceiro parâmetro da sql
//            pstm.setInt(3, saida.getFornecedor().getId());            
//            pstm.setInt(4, saida.getId());
//            //Executa a sql para inserção dos dados
//            pstm.execute();
//            
//            itemControle.deleteItemSaida(saida.getId());
//            
//            for(ItemSaida i: saida.getProdutos()){
//                i.setSaida(saida.getId());
//                itemControle.inserirItem(i);
//            }
//                       
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//        } finally {
//
//            //Fecha as conexões
//            try {
//                if (pstm != null) {
//
//                    pstm.close();
//                }
//
//                if (conn != null) {
//                    conn.close();
//                    this.conexao.desconectar();
//                }
//
//            } catch (Exception e) {
//
//                e.printStackTrace();
//            }
//        }
//    }

}
