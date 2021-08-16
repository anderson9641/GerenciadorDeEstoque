package Model.Entidades;

import java.util.Date;
import java.util.List;

public class Saida {

    public Saida() {
    }

    public Saida(Long id, Escola escola, List<ItemProduto> produtos, Date dataEntrega) {
        this.id = id;
        this.escola = escola;
        this.produtos = produtos;
        this.dataEntrega = dataEntrega;
    }

       
    private Long id;
    private Escola escola;
    private List <ItemProduto> produtos;
    private Date dataEntrega; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public List<ItemProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemProduto> produtos) {
        this.produtos = produtos;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
    
    
    
}
