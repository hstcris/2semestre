public class Gato {

    // atributos
    private String nome;
    private String cor;
    private int peso;

    

    // metodos

    public void estadoAtual(){
        System.out.println("COR DO GATO: " + this.getCor());
        System.out.println("NOME DO GATO: " + this.getNome());
        System.out.println("PESO DO GATO: " + this.getPeso());

    }

    public void miar(){
        System.out.println(this.nome + " está miando!");


    }
    public void pular(){
        System.out.println(this.nome + " está pulando!");

    }
    public void comer(){
        System.out.println(this.nome + " está comendo.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

