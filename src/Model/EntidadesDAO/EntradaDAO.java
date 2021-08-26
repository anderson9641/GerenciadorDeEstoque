package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Controler.Entidades.FornecedorController;
import Controler.Entidades.ItemEntradaController;
import Model.Entidades.Entrada;
import Model.Entidades.Fornecedor;
import Model.Entidades.ItemEntrada;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EntradaDAO {

    private ConexaoJDBC conexao = new ConexaoJDBC();


    //Buscar entradas pela descrição
    public List<Entrada> findByIdEntrada(Entrada entrada) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Entrada> entradas = new ArrayList<>();
        ItemEntradaController itemControlle = new ItemEntradaController();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM entrada WHERE id = ?");
            ps.setInt(1, entrada.getId());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Entrada entradaConsultado = new Entrada();
                
                entradaConsultado.setId(rs.getInt("id"));
                entradaConsultado.setNotaFiscal(rs.getString("notaFiscal"));
                entradaConsultado.setData(rs.getDate("data"));
                
                Fornecedor fornecedor = new Fornecedor();
                FornecedorController fornecedorControle = new FornecedorController();
                fornecedor = fornecedorControle.consultarId(rs.getInt("idFornecedor"));
                entradaConsultado.setFornecedor(fornecedor);
                
                List<ItemEntrada> itens = new ArrayList<>();
                itens = itemControlle.consultaItensEntrada(rs.getInt("id"));
                
                entradaConsultado.setProdutos(itens);           
                

                entradas.add(entradaConsultado);

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

        return entradas;
    }

    //Busca todos os entradas
    public List<Entrada> findAll() {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        List<Entrada> entradas = new ArrayList<>();
        ItemEntradaController itemControlle = new ItemEntradaController();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM entrada");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Entrada entradaConsultado = new Entrada();
                
                entradaConsultado.setId(rs.getInt("id"));
                entradaConsultado.setNotaFiscal(rs.getString("notaFiscal"));
                entradaConsultado.setData(rs.getDate("data"));
                
                Fornecedor fornecedor = new Fornecedor();
                FornecedorController fornecedorControle = new FornecedorController();
                fornecedor = fornecedorControle.consultarId(rs.getInt("idFornecedor"));
                entradaConsultado.setFornecedor(fornecedor);
                
                List<ItemEntrada> itens = new ArrayList<>();
                itens = itemControlle.consultaItensEntrada(rs.getInt("id"));
                
                entradaConsultado.setProdutos(itens);           
                

                entradas.add(entradaConsultado);

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

        return entradas;
    }

    public Entrada findId(String nota, String data, int idfornecedor) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        Entrada entradaConsultado = new Entrada();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM entrada WHERE notaFiscal = ? And data = ? And idFornecedor = ?");
            ps.setString(1, nota);
            ps.setString(2, data);
            ps.setInt(3, idfornecedor);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                entradaConsultado.setId(rs.getInt("id"));                
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

        return entradaConsultado;
    }

//inseri entrada no banco 
    public void inserirEntrada(Entrada entrada) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();
        
        Entrada itens = new Entrada();
        ItemEntradaController itemControle = new ItemEntradaController();

        try {
            String sql = "INSERT INTO entrada(notaFiscal,data,idFornecedor) VALUES(?,?,?)";
            con = conexao.getConexao();
            ps = con.prepareStatement(sql);
            ps.setString(1, entrada.getNotaFiscal());
            ps.setString(2, entrada.getData());
            ps.setInt(3, entrada.getFornecedor().getId());
            ps.executeUpdate();
            
            for(ItemEntrada e : entrada.getProdutos()){
                itens = findId(entrada.getNotaFiscal(),  entrada.getData(), entrada.getFornecedor().getId());
                e.setEntrada(itens.getId());
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
//        String sql = "DELETE FROM entrada WHERE id = ?";
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

    public void update(Entrada entrada) {

        String sql = "UPDATE entrada SET notaFiscal = ?, data = ?, idFornecedor = ? WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();
        
        ItemEntradaController itemControle = new ItemEntradaController();

        try {
            //Cria uma conexão com o banco
            conn = conexao.getConexao();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, entrada.getNotaFiscal());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, entrada.getData());
            //Adiciona o valor do terceiro parâmetro da sql
            pstm.setInt(3, entrada.getFornecedor().getId());            
            pstm.setInt(4, entrada.getId());
            //Executa a sql para inserção dos dados
            pstm.execute();
            
            itemControle.deleteItemEntrada(entrada.getId());
            
            for(ItemEntrada i: entrada.getProdutos()){
                i.setEntrada(entrada.getId());
                itemControle.inserirItem(i);
            }
                       

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
