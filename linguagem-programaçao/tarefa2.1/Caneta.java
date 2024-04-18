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





