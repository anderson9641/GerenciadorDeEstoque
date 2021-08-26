package Model.Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Saida {

    public Saida() {
    }

    public Saida(int id, Escola escola, List<ItemSaida> produtos, Date dataEntrega) {
        this.id = id;
        this.escola = escola;
        this.produtos = produtos;
        this.dataEntrega = dataEntrega;
    }

       
    private int id;
    private Escola escola;
    private List <ItemSaida> produtos;
    private Date dataEntrega; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public List<ItemSaida> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemSaida> produtos) {
        this.produtos = produtos;
    }
    
    public String getDataEntrega() {
        
        SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatado.format(dataEntrega);
        return dataFormat;
    }

   public void setDataEntrega(Date data) {
        this.dataEntrega = data;
    }
    public void setDataEntrega(String data) throws ParseException {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dataEntrega = formatter.parse(data);;
    }
    public void addItemSaida(ItemSaida i){
        produtos.add(i);
    }
    
    
    
}
