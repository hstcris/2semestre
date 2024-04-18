public class Celular {
    // atributos: tenho
    private String modelo;
    private int capacidade;
    private int carga;
    private boolean ligado;



    // metodos: faço

    public void estadoAtual(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Capacidade em GB: " + this.getCapacidade());
        System.out.println("Carga em %: " + this.getCarga());
        System.out.println("Estado: " + (this.ligado ? "Ligado" : "Desligado"));


        }



    void ligar() {
         this.ligado = true;
            System.out.println("Está ligado!");
        }
         void fotografar() {
            if (this.ligado) {
                System.out.println("Posso fotografar.");

            } else {
                System.out.println("Não posso fotografar.");
            }

        }
         void desligar() {
            this.ligado = false;
                System.out.println("Desligado");

            }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

}





