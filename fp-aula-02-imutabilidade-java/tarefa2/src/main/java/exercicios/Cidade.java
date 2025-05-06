package exercicios;
/*
*Crie uma classe Cidade mutável, contendo os mesmos atributos de CidadeRecord, mas com getters e setters.*/


public class Cidade {
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}