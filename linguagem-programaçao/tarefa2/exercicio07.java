import java.util.Scanner;

class MedidorNum{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int num = scanner.nextInt();

        if (num > 10){
            System.out.println("É maior que 10!");
        } else {
            System.out.println("Não é maior que 10.");
        }
        scanner.close();


    }
}
