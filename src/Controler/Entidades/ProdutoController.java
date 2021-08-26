
package Controler.Entidades;

import Model.Entidades.Produto;
import Model.EntidadesDAO.ProdutoDAO;
import java.util.List;


public class ProdutoController {
    
    ProdutoDAO produto = new ProdutoDAO();

    public List<Produto> consultarProdutos(){
        return produto.findAll();
    }
    
    public Produto consultarProdutoId(int id){
        return produto.ById(id);
    }
    
    public void inserirProduto(Produto p){
        produto.inserirProduto(p);
    }
    
    public void deleteProduto(int id){
        produto.removeById(id);
    }
    
    public void atualizarProduto(Produto p){
        produto.update(p);
    }

}
