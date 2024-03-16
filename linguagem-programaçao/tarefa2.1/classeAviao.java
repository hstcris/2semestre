public class Main {
    public static void main(String[] args) {
       Aviao aviao = new Aviao("Modelo Y", 30000, 150);

        aviao.subir();
        aviao.descer();
        aviao.exibirInformacoes();
    }
}
public class Aviao {
  
    private String modelo;
    private int altitudeMaxima;
    private int capacidade;

   
    public Aviao(String modelo, int altitudeMaxima, int capacidade) {
        this.modelo = modelo;
        this.altitudeMaxima = altitudeMaxima;
        this.capacidade = capacidade;
    }

    public void subir() {
        System.out.println("O avião está subindo.");
    }

  
    public void descer() {
        System.out.println("O avião está descendo.");
    }

    
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Altitude Máxima: " + altitudeMaxima + ", Capacidade: " + capacidade);
    }
}
