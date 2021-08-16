
package Model.Entidades;


public class Produto {
    
    public Produto(){}
    
    public Produto(String descricao, String medida){
        this.descricao = descricao;
        this.medida = medida;
    }
    
    private Long id;
    private String descricao;
    private String medida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    
}
