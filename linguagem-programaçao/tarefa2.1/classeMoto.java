public class Main {
    public static void main(String[] args) {
        Moto a1 = new Moto();
        a1.setAro(14);
        a1.setCor("Preto");
        a1.setModelo("Scooter");
        a1.andar();
        a1.buzinar();
        a1.estadoAtual();
        System.out.println("\n");

        Moto a2 = new Moto();
        a2.setModelo("Custom");
        a2.setCor("Azul");
        a2.setAro(29);
        a2.empinar();
        a2.buzinar();
        a2.estadoAtual();
        System.out.println("\n");

        Moto a3 = new Moto();
        a3.setAro(11);
        a3.setCor("Vermelha");
        a3.setModelo("Naked");
        a3.andar();
        a3.empinar();
        a3.estadoAtual();

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
