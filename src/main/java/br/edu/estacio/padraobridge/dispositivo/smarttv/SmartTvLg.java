package main.java.br.edu.estacio.padraobridge.dispositivo.smarttv;

import main.java.br.edu.estacio.padraobridge.dispositivo.Dispositivo;;

//Classe concreta da implementação
public class SmartTvLg implements Dispositivo {

  @Override
  public void ligarDispositivo() {
    System.out.println(" SmartTV LG");
  }

  @Override
  public void desligarDispositivo() {
    System.out.println(" SmartTV LG");
  }

}
