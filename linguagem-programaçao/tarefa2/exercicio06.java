import java.util.Scanner;

class TempCelcius{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Farhenheit: ");
        double Farhenheit = scanner.nextDouble();

        double Celcius = ((Farhenheit - 32) * 5/9);

        System.out.println("A temperatura em Celcius é de: " + Celcius);
        scanner.close();
        

    }
}
