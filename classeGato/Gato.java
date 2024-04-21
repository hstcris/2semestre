package org.example.arqteturasgato;



// CLASSE
public class Gato {
    private String nome;
    private double peso;
    private String cor;

    // Construtor
    public Gato(String nome, double peso, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
