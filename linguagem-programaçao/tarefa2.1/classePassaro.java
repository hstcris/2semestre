public class Main {
    public static void main(String[] args) {
        Passaro a1 = new Passaro();
        a1.setCor("Azul");
        a1.setEspecie("Andorinha");
        a1.setTamanho(4);
        a1.cantar();
        a1.comer();
        a1.estadoAtual();
        System.out.println("\n");

        Passaro a2 = new Passaro();
        a2.setTamanho(6);
        a2.setCor("Vermelho");
        a2.setEspecie("PicaPau");
        a2.voar();
        a2.bicar();
        a2.estadoAtual();
        System.out.println("\n");

        Passaro a3 = new Passaro();
        a3.setEspecie("Pardal");
        a3.setCor("Marron");
        a3.setTamanho(3);
        a3.voar();
        a3.cantar();
        a3.estadoAtual();
        System.out.println("\n");

public class Passaro{
    // atributos
    private String especie;
    private String cor;
    private int tamanho;



    // metodos

    public void estadoAtual(){
        System.out.println("ESPECIE DO PASSARO: " + this.getEspecie());
        System.out.println("COR DO PASSARO: " + this.getCor());
        System.out.println("TAMANHO DO PASSARO EM CM: " + this.getTamanho());

    }

    public void voar(){
        System.out.println(this.especie + " está voando!");


    }
    public void cantar(){
        System.out.println(this.especie + " está cantando!");

    }
    public void comer(){
        System.out.println(this.especie + " está comendo!");
    }
    public void bicar(){
        System.out.println(this.especie + " está bicando!");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
