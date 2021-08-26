
package Controler.Entidades;

import Model.Entidades.Saida;
import Model.EntidadesDAO.SaidaDAO;
import java.text.ParseException;
import java.util.List;


public class SaidaController {
    
    SaidaDAO saida = new SaidaDAO();

    public List<Saida> consultarSaidaes() throws ParseException{
        return saida.findAll();
    }
    
    public void inserirSaida(Saida f){
        saida.inserirSaida(f);
    }
    
    
    public void atualizarSaida(Saida f){
        //saida.update(f);
    }
    

}
