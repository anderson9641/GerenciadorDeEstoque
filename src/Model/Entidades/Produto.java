
package Model.Entidades;


public class Produto {
    
    public Produto(){}
    
    public Produto(int id,String descricao, String medida){
        this.id = id;
        this.descricao = descricao;
        this.medida = medida;
    }
    
    private int id;
    private String descricao;
    private String medida;

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

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", medida=" + medida + '}';
    }
    
    
    
    
}
