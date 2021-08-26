
package Model.Entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Entrada {

    public Entrada(){
        
    }

    public Entrada(int id, Fornecedor fornecedor, String notaFiscal, Date data) {
        this.id = id;
        this.fornecedor = fornecedor;
        this.notaFiscal = notaFiscal;
        this.data = data;
    }
    
    private int id;
    private Fornecedor fornecedor;
    private String notaFiscal;
    private Date data;
    private List <ItemEntrada> produtos;
    
    public List<ItemEntrada> getProdutos() {
        return produtos;
    }

    

    public int getId() {
        return id;
    }

    public void setProdutos(List<ItemEntrada> produtos) {
        this.produtos = produtos;
    }

    public void setId(int id) {
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

    public String getData() {
        
        SimpleDateFormat formatado = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormat = formatado.format(data);
        return dataFormat;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public void setData(String data) throws ParseException {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formatter.parse(data);;
    }
    public void addItemEntrada(ItemEntrada i){
        produtos.add(i);
    }
    
    
}
