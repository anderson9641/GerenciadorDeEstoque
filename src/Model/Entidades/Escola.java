
package Model.Entidades;


public class Escola {
    
    
    public Escola(){
        
    }
    
    public Escola(int id, String nome,String endereco,String fone,String responsavel){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.responsavel = responsavel;
    }
    
    
    private int id;
    private String nome;
    private String endereco;
    private String fone;
    private String responsavel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public Object[] modeloTabela(){
        return new Object[]{
            this.getId(), 
            this.getNome(), 
            this.getEndereco(), 
            this.getFone(), 
            this.getResponsavel()
        };
    }


}
