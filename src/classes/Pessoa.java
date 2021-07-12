package classes; 

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String telefone;
    
    public Pessoa(){

    };

    public Pessoa(String nome, String sobrenome, String telefone){
       this.setNome(nome);
       this. setSobrenome(sobrenome);
       this. setTelefone(telefone);
    }

    public String getNome() {//recuperar um valor da classe instanciada
        return nome;
    }

    public void setNome(String nome) { 
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }; 
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    };

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
