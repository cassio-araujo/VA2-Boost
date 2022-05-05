class Quarto {
  int numero;
  Paciente paciente01;
  Paciente paciente02;
  Paciente paciente03;

  Quarto(int num) {
    this.numero = num;
  }

  int retornarMaxDiasInter(){
    if (paciente01.diasInternado>paciente02.diasInternado &&   paciente01.diasInternado>paciente03.diasInternado){
      return paciente01.diasInternado;
    }
    else if (paciente02.diasInternado>paciente03.diasInternado && paciente02.diasInternado>paciente03.diasInternado){
      return paciente02.diasInternado;
    }
    else{
      return paciente03.diasInternado;
    }   
    }

  int retornarMinDiasInter() {
    if (paciente01.diasInternado<paciente02.diasInternado &&   paciente01.diasInternado<paciente03.diasInternado){
      return paciente01.diasInternado;
    }
    else if (paciente02.diasInternado<paciente03.diasInternado && paciente02.diasInternado<paciente03.diasInternado){
      return paciente02.diasInternado;
    }
    else {
      return paciente03.diasInternado;
    } 
  }

  int diasPorPaciente(int nun) {
    if (nun == paciente01.diasInternado){
      return paciente01.diasInternado;
    }
    else if (nun == paciente02.diasInternado){
      return paciente02.diasInternado;
    }
    else  {
      return paciente03.diasInternado;
    }
  }

  void verificarQuartoVazio() {
    if (paciente01 == null || paciente02 == null || paciente03 == null){
    System.out.println("Existem quartos vaszios");
      }
    else{
      System.out.println("\nQuarto está cheio");
    }  
    }
    
  }


