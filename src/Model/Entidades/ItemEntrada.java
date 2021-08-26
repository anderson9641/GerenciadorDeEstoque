
package Model.Entidades;


public class ItemEntrada {

    public ItemEntrada() {
    }

    
    
    public ItemEntrada(int produto, int entrada, Double quantidade) {
        this.produto = produto;
        this.entrada = entrada;
        this.quantidade = quantidade;
        
    }

   private int produto;
   private int entrada;
   private Double quantidade;

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
   
   
    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }   
    
}
