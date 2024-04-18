
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
