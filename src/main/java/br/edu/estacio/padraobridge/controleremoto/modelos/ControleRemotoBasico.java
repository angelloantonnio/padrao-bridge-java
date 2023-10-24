package main.java.br.edu.estacio.padraobridge.controleremoto.modelos;

import main.java.br.edu.estacio.padraobridge.controleremoto.ControleRemoto;
import main.java.br.edu.estacio.padraobridge.dispositivo.Dispositivo;

//Classe concreta da abstração
public class ControleRemotoBasico implements ControleRemoto {
	private Dispositivo dispositivo;

	//Ponte que conecta a abstração à implementação
	public ControleRemotoBasico(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public void ligar() {
		System.out.print("Ligando...");
		dispositivo.ligarDispositivo();
	}

	@Override
	public void desligar() {
		System.out.print("Desligando...");
		dispositivo.desligarDispositivo();
	}
}
