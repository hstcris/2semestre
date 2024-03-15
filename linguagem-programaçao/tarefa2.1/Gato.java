public class Main {
    public static void main(String[] args) {

        Gato a1 = new Gato ();
        a1.setCor("Branco");
        a1.setNome("Maria");
        a1.setPeso(3);
        a1.comer();
        a1.miar();
        a1.estadoAtual();
        System.out.println("\n");

        Gato a2 = new Gato();
        a2.setCor("Rajada");
        a2.setNome("Sulli");
        a2.setPeso(4);
        a2.comer();
        a2.miar();
        a2.estadoAtual();
        System.out.println("\n");

        Gato a3 = new Gato();
        a3.setCor("Preto");
        a3.setNome("Bento");
        a3.setPeso(2);
        a3.pular();
        a3.comer();
        a3.estadoAtual();
        System.out.println("\n");



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

