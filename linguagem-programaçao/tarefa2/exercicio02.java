class NumeroEleitores {
  public static void main(String[]args){

  double votosTotais = 1000;
  double votosBrancos = 300;
  double votosNulos = 500;
  double votosValidos = 200;

  double porcentagemVotosTotais = votosValidos / votosTotais * 100;
  double porcentagemVotosValidos = votosBrancos / votosTotais * 100;
  double porcentagemVotosNulos = votosNulos / votosTotais * 100;

  System.out.println("Porcentagem de votos totais: " + porcentagemVotosTotais + "%");
  System.out.println("Porcentagem de votos válidos: " + porcentagemVotosValidos + "%");
  System.out.println("Porcentagem de votos nulos: " + porcentagemVotosNulos + "%");
}
}
