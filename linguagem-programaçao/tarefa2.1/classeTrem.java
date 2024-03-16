public class Main {
    public static void main(String[] args) {

Trem trem = new Trem("Modelo X", 120, 200);

       
        trem.acelerar();
        trem.frear();
        trem.exibirInformacoes();
    }
}


public class Trem {
    // Atributos da classe Trem
    private String modelo;
    private int velocidadeMaxima;
    private int capacidade;

    
    public Trem(String modelo, int velocidadeMaxima, int capacidade) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidade = capacidade;
    }

    
    public void acelerar() {
        System.out.println("O trem está acelerando.");
    }

    
    public void frear() {
        System.out.println("O trem está freando.");
    }

  
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Velocidade Máxima: " + velocidadeMaxima + ", Capacidade: " + capacidade);
    }
}
