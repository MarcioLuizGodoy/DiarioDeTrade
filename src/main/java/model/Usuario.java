package model;

public class Usuario {
    private String nome ;
    private String senha;

    public Usuario() {}

    public String getNome() {
        return this.nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getSenha() { 
        return this.senha; 
    }
    public void setSenha(String senha) { 
        this.senha = senha; 
    }
}
