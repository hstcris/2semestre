package org.example.arqteturastres;

public class Humano {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int peso;
    private String sexo;

    // Construtor
    public Humano(String nome, String nacionalidade, int peso, String sexo) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.peso = peso;
        this.sexo = sexo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

