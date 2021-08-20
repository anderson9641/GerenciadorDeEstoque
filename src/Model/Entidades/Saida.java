package Model.Entidades;

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

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    
    
}
