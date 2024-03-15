public class Caneta {
    // ATRIBUTOS
    private String cor;
    private String modelo;
    private boolean tampada;

    // METODOS ESPECIAS

    public void estadoAtual(){
        System.out.println("Cor: " + this.getCor());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tampada? " + this.getTampada());
    }

    void rabiscar(){
        if (this.tampada) {
            System.out.println("Erro! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando...");
        }

    }
    void tampada(){
        this.tampada = true;
        System.out.println("Caneta tampada.");

    }
    void destampada(){
        this.tampada = false;
        System.out.println("Caneta destampada.");

    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.setCor("AZUL");
        c1.setModelo("BIC");
        c1.setTampada(true);
        c1.estadoAtual();
        System.out.println("\n");

        Caneta c2 = new Caneta();
        c2.setCor("PRETO");
        c2.setModelo("FABERCASTELL");
        c2.setTampada(true);
        c2.estadoAtual();
        System.out.println("\n");

        Caneta c3 = new Caneta();
        c3.setCor("VERMELHA");
        c3.setModelo("CIS");
        c3.setTampada(false);
        c3.estadoAtual();



    }
}
