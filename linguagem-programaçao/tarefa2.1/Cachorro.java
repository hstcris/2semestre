
      
public class Cachorro{

    // atributos
    private String nome;
    private String raca;
    private int peso;



    // metodos

    public void estadoAtual(){
        System.out.println("RAÇA DO CACHORRO: " + this.getRaca());
        System.out.println("NOME DO CACHORRO: " + this.getNome());
        System.out.println("PESO DO CACHORRO EM KG: " + this.getPeso());

    }

    public void latir(){
        System.out.println(this.nome + " está latindo!");


    }
    public void correndo(){
        System.out.println(this.nome + " está correndo!");

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String cor) {
        this.raca = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
