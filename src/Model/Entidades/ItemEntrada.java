
package Model.Entidades;


public class ItemEntrada {

    public ItemEntrada() {
    }
    
    public ItemEntrada(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

   private Produto produto;
   private double quantidade;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
   
   

    
   
    
}