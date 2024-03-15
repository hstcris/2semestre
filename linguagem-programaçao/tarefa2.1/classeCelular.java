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

 Celular a1 = new Celular();
        a1.setModelo("APPLE");
        a1.setCapacidade(4);
        a1.setCarga(90);
        a1.estadoAtual();


        System.out.println("\n");

        Celular a2 = new Celular();
        a2.setModelo("SAMSUNG");
        a2.setCapacidade(8);
        a2.setCarga(50);
        a2.estadoAtual();
        System.out.println("\n");

        Celular a3 = new Celular();
        a3.setModelo("XIAOMI");
        a3.setCapacidade(64);
        a3.setCarga(20);
        a3.estadoAtual();

    }
}
