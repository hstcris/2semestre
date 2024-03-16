public class Main {
    public static void main(String[] args) {
       Humano a1 = new Humano();
       a1.setNome("Cris");
       a1.setNacionalidade("Brasileira");
       a1.setPeso(59);
       a1.andar();
       a1.falando();
       a1.estadoAtual();
        System.out.println("\n");

        Humano a2 = new Humano();
        a2.setPeso(50);
        a2.setNome("Duda");
        a2.setNacionalidade("Japonesa");
        a2.falando();
        a2.comendo();
        a2.estadoAtual();
        System.out.println("\n");

        Humano a3 = new Humano();
        a3.setNacionalidade("Porto-riquenha");
        a3.setNome("Marta");
        a3.setPeso(68);
        a3.comendo();
        a3.andar();
        a3.estadoAtual();


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
