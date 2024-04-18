

public class Carro {
    // atributos
    private String marca;
    private String cor;
    private int kilometragem;



    // metodos

    public void estadoAtual(){
        System.out.println("COR DO CARRO: " + this.getCor());
        System.out.println("MARCA DO CARRO: " + this.getMarca());
        System.out.println("KILOMETRAGEM DO CARRO: " + this.getKilometragem());

    }

    public void andar(){
        System.out.println(this.marca + " está andando!");


    }
    public void parado(){
        System.out.println(this.marca + " está parado!");

    }
    public void buzinar(){
        System.out.println(this.marca + " está buzinando.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }
}
