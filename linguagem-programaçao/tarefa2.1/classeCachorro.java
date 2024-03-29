public class Main {
    public static void main(String[] args) {

        Cachorro a1 = new Cachorro();
        a1.setNome("Luca");
        a1.setRaca("Bulldog");
        a1.setPeso(20);
        a1.comer();
        a1.correndo();
        a1.estadoAtual();
        System.out.println("\n");

        Cachorro a2 =  new Cachorro();
        a2.setPeso(30);
        a2.setRaca("Poodle");
        a2.setNome("Duca");
        a2.latir();
        a2.comer();
        a2.estadoAtual();
        System.out.println("\n");

        Cachorro a3 = new Cachorro();
        a3.setNome("José");
        a3.setRaca("Pintcher");
        a3.setPeso(11);
        a3.latir();
        a3.correndo();
        a3.estadoAtual();
      
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
