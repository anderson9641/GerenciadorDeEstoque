
package Controler.Entidades;

import Model.Entidades.ItemEntrada;
import Model.EntidadesDAO.ItemEntradaDAO;
import java.util.List;


public class ItemEntradaController {

    ItemEntradaDAO item = new ItemEntradaDAO();
    
    public void inserirItem(ItemEntrada i){
        item.inserirItem(i);
    }
    
    public void deleteItem(int idE, int idP){
        item.removeById(idE, idP);
    }
    
    public void deleteItemEntrada(int idE){
        item.removeByIdEntrada(idE);
    }
    
    public List<ItemEntrada> consultaItensEntrada(int id){
        return item.findByIdEntrada(id);
    }
    
}
