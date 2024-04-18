


public class Humano {
    // atributos
    private String nome;
    private String nacionalidade;
    private int peso;



    // metodos

    public void estadoAtual(){
        System.out.println("NOME: " + this.getNome());
        System.out.println("NACIONALIDADE: " + this.getNacionalidade());
        System.out.println("PESO EM KG: " + this.getPeso());

    }

    public void andar(){
        System.out.println(this.nome + " está andando!");


    }
    public void comendo(){
        System.out.println(this.nome + " está comendo!");

    }
    public void falando(){
        System.out.println(this.nome + " está falando!");
    }

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
}
