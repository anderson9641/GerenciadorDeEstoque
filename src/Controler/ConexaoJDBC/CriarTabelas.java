package Controler.ConexaoJDBC;

import java.sql.Statement;

public class CriarTabelas {

    private ConexaoJDBC conexao = new ConexaoJDBC();

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_fornecedor"
                + "("
                + "id integer PRIMARY KEY,"
                + "descricao text NOT NULL,"
                + "medida text "
                + ");";

        String sql1 = "CREATE TABLE fornecedor ("
                + "    id       INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "    nome     STRING  NOT NULL,"
                + "    endereco STRING,"
                + "    fone     STRING"
                + ");";

        String sql2 = "CREATE TABLE entrada ("
                + "    id           INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "    notaFiscal   STRING,"
                + "    data         DATE,"
                + "    idFornecedor INTEGER"
                + ");";

        String sql3 = "CREATE TABLE saida ("
                + "    id       INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "    data     DATE,"
                + "    idEscola INTEGER NOT NULL"
                + ");";
        String sql4 = "CREATE TABLE escola ("
                + "    id          INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "    nome        STRING,"
                + "    endereco    STRING,"
                + "    fone        STRING,"
                + "    responsavel STRING"
                + ");";

        String sql5 = "CREATE TABLE itemEntrada ("
                + "    idEntrada  INTEGER,"
                + "    idProduto  INTEGER,"
                + "    quantidade DOUBLE  NOT NULL"
                + ");";
        String sql6 = "CREATE TABLE itemSaida ("
                + "    idEntrada  INTEGER,"
                + "    idProduto  INTEGER,"
                + "    quantidade DOUBLE  NOT NULL"
                + ");";
        String sql7 = "CREATE TABLE estoque ("
                + "    idProduto            INTEGER,"
                + "    quantidadeDisponivel DOUBLE"
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

}
