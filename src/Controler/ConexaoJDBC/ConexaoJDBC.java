package Controler.ConexaoJDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJDBC {

    private Connection connection = null;

    public boolean conectar() {

        try {
            connection = DriverManager.getConnection("jdbc:sqlite:src/Banco/banco.db");
            if (connection != null) {
                System.out.println("Conexión exitosa!");
            }
        } catch (Exception ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
            System.out.println("Error en la conexión");
            return false;
        }
        return true;
    }

    public boolean desconectar() {

        try {

            if (this.connection.isClosed() == false) {
                this.connection.close();
            }
        } catch (Exception ex) {
            System.err.println(ex.getClass().getName() + ": " + ex.getMessage());
            System.out.println("Error en la conexión");
            return false;
        }
        return true;
    }
    
    public Statement criarStatement(){
        try{
            return this.connection.createStatement();
        }catch(Exception ex){
            return null;
        }
    }
    
    public Connection getConexao(){
        System.out.println("pegou conexao");
        return this.connection;
    }

}
