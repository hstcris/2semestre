import java.util.Scanner;

 class SalarioFinal{

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total de suas vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: ");
        double valorCarroVendido = scanner.nextDouble();

        double salarioFinal = salarioFixo + (valorCarroVendido * numCarrosVendidos) + (valorTotalVendas * 0.05);

        System.out.println("O salário final do vendedor será de: " + salarioFinal);

        scanner.close();

    }
    }
