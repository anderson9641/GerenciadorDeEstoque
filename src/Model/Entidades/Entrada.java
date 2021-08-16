
package Model.Entidades;

import java.util.Date;
import java.util.List;

public class Entrada {

    public Entrada(){
        
    }

    public Entrada(Fornecedor fornecedor, String notaFiscal, Date data) {
        this.fornecedor = fornecedor;
        this.notaFiscal = notaFiscal;
        this.data = data;
    }
    
    private Long id;
    private Fornecedor fornecedor;

    public List<ItemProduto> getProdutos() {
        return produtos;
    }

    private String notaFiscal;
    private Date data;
    private List <ItemProduto> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
