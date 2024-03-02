class NumeroEleitores {
  public static void main(String[]args){

  double votosTotais = 1000;
  double votosBrancos = 300;
  double votosNulos = 500;
  double votosValidos = 200;

  double porcentagemVotosTotal = votosValidos / votosTotal * 100;
  double porcentagemVotosValidos = votosBrancos / votosTotal * 100;
  double porcentagemVotosNulos = votosNulos / votosTotal * 100;

  System.out.println("Porcentagem de votos totais: " + porcentagemVotosTotal + "%");
  System.out.println("Porcentagem de votos válidos: " + porcentagemVotosValidos + "%");
  System.out.println("Porcentagem de votos nulos: " + porcentagemVotosNulos + "%");
}
}

  
