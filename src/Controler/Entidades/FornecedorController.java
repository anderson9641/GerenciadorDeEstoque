
package Controler.Entidades;

import Model.Entidades.Fornecedor;
import Model.EntidadesDAO.FornecedorDAO;
import java.util.List;


public class FornecedorController {
    
    FornecedorDAO fornecedor = new FornecedorDAO();

    public List<Fornecedor> consultarFornecedores(){
        return fornecedor.findAll();
    }
    
    public void inserirFornecedor(Fornecedor f){
        fornecedor.inserirFornecedor(f);
    }
    
    public void deleteFornecedor(int id){
        fornecedor.removeById(id);
    }
    
    public void atualizarFornecedor(Fornecedor f){
        fornecedor.update(f);
    }

}
