
public class Moto {
    // atributos
    private String modelo;
    private String cor;
    private int aro;



    // metodos

    public void estadoAtual(){
        System.out.println("COR DA MOTO: " + this.getCor());
        System.out.println("MODELO DA MOTO: " + this.getModelo());
        System.out.println("ARO DA RODA: " + this.getAro());

    }

    public void andar(){
        System.out.println(this.modelo + " está andando!");


    }
    public void buzinar(){
        System.out.println(this.modelo + " está buzinando!");

    }
    public void empinar(){
        System.out.println(this.modelo + " está empinando!");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }
}
