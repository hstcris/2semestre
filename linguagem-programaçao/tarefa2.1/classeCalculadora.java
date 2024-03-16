public class Calculadora {
    private int numerador;
    private int denominador;

    // Construtor
    public Calculadora(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
    public int soma(int outroNumerador) {
        return this.numerador + outroNumerador;
    }

    
    public int subtracao(int outroNumerador) {
        return this.numerador - outroNumerador;
    }

    
    public int multiplicacao(int outroNumerador) {
        return this.numerador * outroNumerador;
    }

    
    public double divisao(int outroNumerador) {
        if (outroNumerador == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) this.numerador / outroNumerador;
    }

    
    public int getNumerador() {
        return numerador;
    }

    
    public int getDenominador() {
        return denominador;
    }
}
