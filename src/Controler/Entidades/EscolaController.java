
package Controler.Entidades;

import Model.Entidades.Escola;
import Model.Entidades.Produto;
import Model.EntidadesDAO.EscolaDAO;
import Model.EntidadesDAO.ProdutoDAO;
import java.util.List;


public class EscolaController {
    
    EscolaDAO escola = new EscolaDAO();
    //Escola entityEscola = new Escola();

    public List<Escola> consultarEscolas(){
        return escola.findAll();
    }
    
    public void inserirEscola(Escola e){
        escola.inserirEscola(e);
    }
    
    public void deleteEscola(int id){
        escola.removeById(id);
    }
    
    public void atualizarEscola(Escola e){
        escola.update(e);
    }
    
    public Object[] modeloTabela(Escola entityEscola){
        return new Object[]{
            entityEscola.getId(), 
            entityEscola.getNome(), 
            entityEscola.getEndereco(), 
            entityEscola.getFone(), 
            entityEscola.getResponsavel()
        };
    }

}
