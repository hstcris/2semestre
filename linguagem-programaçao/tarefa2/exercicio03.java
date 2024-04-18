class SalarioMensal {
  public static void main(String[]args){

  double salarioMensal = 1000;
    int aumento = 10;
    double salarioNovo = ((salarioMensal * aumento)/100 + salarioMensal);

  System.out.println("O novo salário é de " + salarioNovo);
  }
}
