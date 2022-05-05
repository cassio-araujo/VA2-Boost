class Main {
  public static void main(String[] args) {   
   
    
    Paciente paciente1 = new Paciente("Claudinho", 10);
    Paciente paciente2 = new Paciente("Flavinho",7);
    Paciente paciente3 = new Paciente("Cleiton",20);
    Paciente paciente4 = new Paciente("Lucao",9);

    Quarto quarto1 = new Quarto(2);
    quarto1.paciente01 = paciente1;
    quarto1.paciente02 = paciente2;
    quarto1.paciente03 = paciente3;
    
    Quarto quarto2 = new Quarto(3);
    quarto2.paciente01 = paciente4;

    Ala ala1 = new Ala(1, "Enfermagem", quarto1);
    Ala ala2 = new Ala(2, "Pediatria", quarto2);

   System.out.println("Maximo Dias internado: " + quarto1.retornarMaxDiasInter());
    System.out.println("Minimo Dias internado: "+ quarto1.retornarMinDiasInter());
    
  paciente1.exibirRelatorioPac();

  quarto1.verificarQuartoVazio();  

  System.out.println("Paciente:" + quarto1.diasPorPaciente(paciente1.retornarDiasInternado()));

 ala1.exibirRelatorio();   

 ala2.exibirRelatorio();      
    
  }

  

}