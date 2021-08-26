
package Model.Entidades;


public class ItemSaida {

    public ItemSaida() {
    }
    
    public ItemSaida(int produto,int saida, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

   private int saida;
   private int produto;
   private double quantidade;

    public int getint() {
        return produto;
    }

    public void setint(int produto) {
        this.produto = produto;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }    
   
    
}
