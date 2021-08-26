
package Controler.Entidades;

import Model.Entidades.Entrada;
import Model.EntidadesDAO.EntradaDAO;
import java.util.List;


public class EntradaController {
    
    EntradaDAO entrada = new EntradaDAO();

    public List<Entrada> consultarEntradaes(){
        return entrada.findAll();
    }
    
    public void inserirEntrada(Entrada f){
        entrada.inserirEntrada(f);
    }
    
    
    public void atualizarEntrada(Entrada f){
        entrada.update(f);
    }
    

}
