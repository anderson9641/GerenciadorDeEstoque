package Model.EntidadesDAO;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Model.Entidades.Entrada;
import Model.Entidades.Fornecedor;
import Model.Entidades.ItemEntrada;
import Model.Entidades.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemEntradaDAO {

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

                Fornecedor itemConsultado = new Fornecedor();
                itemConsultado.setNome(rs.getString("nome"));
                itemConsultado.setEndereco(rs.getString("endereco"));
                itemConsultado.setFone(rs.getString("fone"));

                fornecedores.add(itemConsultado);

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

                Fornecedor itemConsultado = new Fornecedor();
                itemConsultado.setId(rs.getInt("id"));
                itemConsultado.setNome(rs.getString("nome"));
                itemConsultado.setEndereco(rs.getString("endereco"));
                itemConsultado.setFone(rs.getString("fone"));

                fornecedors.add(itemConsultado);

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

    public ItemEntrada findById(int idE, int idP) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        ItemEntrada itemConsultado = new ItemEntrada();
        Entrada entrada = new Entrada();
        Produto produto = new Produto();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM itemEntrada WHERE idEntrada = ? AND idProduto = ?");
            ps.setInt(1, idE);
            ps.setInt(2, idP);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                itemConsultado.setEntrada(rs.getInt("idEntrada"));
                itemConsultado.setProduto(rs.getInt("idProduto"));
            } else {
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

        return itemConsultado;
    }

    public List<ItemEntrada> findByIdEntrada(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        ItemEntrada itemConsultado = new ItemEntrada();
        List<ItemEntrada> itens = new ArrayList<>();

        try {
            con = conexao.getConexao();
            ps = con.prepareStatement("SELECT * FROM itemEntrada WHERE idEntrada = ? ");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                itemConsultado.setEntrada(rs.getInt("idEntrada"));
                itemConsultado.setProduto(rs.getInt("idProduto"));
                
                itens.add(itemConsultado);
            } else {
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

        return itens;
    }

//inseri fornecedor no banco 
    public void inserirItem(ItemEntrada item) {
        Connection con = null;
        PreparedStatement ps = null;
        this.conexao.conectar();

        try {
            String sql = "INSERT INTO itemEntrada(idEntrada,idProduto,quantidade) VALUES(?,?,?)";
            con = conexao.getConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, item.getEntrada());
            ps.setInt(2, item.getProduto());
            ps.setDouble(3, item.getQuantidade());
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

    public void removeById(int idE, int idP) {

        String sql = "DELETE FROM itemEntrada WHERE idEntrada = ? AND idProduto = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();

        try {
            conn = conexao.getConexao();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, idE);
            pstm.setInt(2, idP);

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
    
    public void removeByIdEntrada(int idE) {

        String sql = "DELETE FROM itemEntrada WHERE idEntrada = ?";

        Connection conn = null;
        PreparedStatement pstm = null;
        this.conexao.conectar();

        try {
            conn = conexao.getConexao();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, idE);
            

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
