
package Model.Entidades;


public class Produto {
    
    public Produto(){}
    
    public Produto(int id,String descricao, String medida, Double quantidade){
        this.id = id;
        this.descricao = descricao;
        this.medida = medida;
        this.quantidade = quantidade;
    }
    
    private int id;
    private String descricao;
    private String medida;
    private Double quantidade;
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", medida=" + medida + ", quantidade=" + quantidade + '}';
    }

    
    
    public void addProduto(double qtd){
        this.quantidade += qtd;
    }
    
    public void outProduto(double qtd){
        this.quantidade -= qtd;
    }
    
    
    
    
}
