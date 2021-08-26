
package Controler.Entidades;

import Model.Entidades.ItemSaida;
import Model.EntidadesDAO.ItemSaidaDAO;
import java.util.List;


public class ItemSaidaController {

    ItemSaidaDAO item = new ItemSaidaDAO();
    
    public void inserirItem(ItemSaida i){
        item.inserirItem(i);
    }
    
    public void deleteItem(int idE, int idP){
        item.removeById(idE, idP);
    }
    
    public void deleteItemSaida(int idE){
        item.removeByIdSaida(idE);
    }
    
    public List<ItemSaida> consultaItensSaida(int id){
        return item.findByIdSaida(id);
    }
    
}
