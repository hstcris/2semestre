public class Main {
    public static void main(String[] args) {

        Gato a1 = new Gato();
        a1.setCor("Branco");
        a1.setNome("Maria");
        a1.setPeso(3);
        a1.comer();
        a1.miar();
        a1.estadoAtual();
        System.out.println("\n");

        Passaro b1 = new Passaro();
        b1.setCor("Azul");
        b1.setEspecie("Andorinha");
        b1.setTamanho(4);
        b1.cantar();
        b1.comer();
        b1.estadoAtual();
        System.out.println("\n");

        Moto c1 = new Moto();
        c1.setAro(14);
        c1.setCor("Preto");
        c1.setModelo("Scooter");
        c1.andar();
        c1.buzinar();
        c1.estadoAtual();
        System.out.println("\n");

        Humano d1 = new Humano();
        d1.setNome("Cris");
        d1.setNacionalidade("Brasileira");
        d1.setPeso(59);
        d1.andar();
        d1.falando();
        d1.estadoAtual();
        System.out.println("\n");

        Celular e1 = new Celular();
        e1.setModelo("APPLE");
        e1.setCapacidade(4);
        e1.setCarga(90);
        e1.ligar();
        e1.fotografar();
        e1.estadoAtual();

        Carro f1 = new Carro();
        f1.setCor("Preto");
        f1.setMarca("Audi");
        f1.setKilometragem(30000);
        f1.andar();
        f1.buzinar();
        f1.estadoAtual();
        System.out.println("\n");

        Cachorro g1 = new Cachorro();
        g1.setNome("Luca");
        g1.setRaca("Bulldog");
        g1.setPeso(20);
        g1.comer();
        g1.correndo();
        g1.estadoAtual();
        System.out.println("\n");


    }
}