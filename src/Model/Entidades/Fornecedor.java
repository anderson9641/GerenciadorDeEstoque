
package Model.Entidades;


public class Fornecedor {
    
    public Fornecedor(){
        
    }
    
    public Fornecedor(String nome, String endereco, String fone){
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
    }
    
    
    private Long id;
    private String nome;
    private String endereco;
    private String fone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
    
    
}
