
package Util;

import Controler.Entidades.EscolaController;
import Model.Entidades.Escola;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PreencherTabelas {
    EscolaController controler = new EscolaController();
    
    public void inserirDadosTabela(JTable tabela, Object[] modelo, List itens){
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        System.out.println(itens.get(0));
        for (int x = 0; x < itens.size(); x++) {
            
            model.addRow(modelo);
        }
    }
}
