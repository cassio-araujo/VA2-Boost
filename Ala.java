class Ala {
  int id;
  String especialidade;
  Quarto quarto;

  Ala (int id_ala, String especil, Quarto quart){
    id = id_ala;
    especialidade = especil;
    quarto = quart;
    
  }
  
  void exibirRelatorio(){
    
    System.out.println("\nid:" + id + "\nespecialidade:" + especialidade + "\ntem vaga:");
    quarto.verificarQuartoVazio();
  }
}