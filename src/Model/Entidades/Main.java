
package Model.Entidades;

import Controler.ConexaoJDBC.ConexaoJDBC;
import Controler.Entidades.FornecedorController;
import Controler.Entidades.ProdutoController;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args){
        
//        ConexaoJDBC con = new ConexaoJDBC();
//        
//        con.conectar();
        
        ProdutoController controle = new ProdutoController();
        FornecedorController fControle = new FornecedorController();
        
//        Produto p = new Produto("Farinha", "kg");
          //Fornecedor f = new Fornecedor("techline", "joao dantas 12", "00000");
          
         // fControle.inserirFornecedor(f);
          
        
         
        
        
    }
    
}
