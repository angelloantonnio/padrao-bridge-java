package main.java.br.edu.estacio.padraobridge;
import main.java.br.edu.estacio.padraobridge.controleremoto.ControleRemoto;
import main.java.br.edu.estacio.padraobridge.controleremoto.modelos.ControleRemotoBasico;
import main.java.br.edu.estacio.padraobridge.controleremoto.modelos.ControleRemotoVoz;
import main.java.br.edu.estacio.padraobridge.dispositivo.Dispositivo;
import main.java.br.edu.estacio.padraobridge.dispositivo.caixadesom.Jbl;
import main.java.br.edu.estacio.padraobridge.dispositivo.smarttv.SmartTvLg;
import main.java.br.edu.estacio.padraobridge.dispositivo.smarttv.SmartTvSamsung;

public class Main {
	public static void main(String[] args) {
		Dispositivo tvSamsung = new SmartTvSamsung();
		Dispositivo tvLg = new SmartTvLg();

		Dispositivo caixaJbl = new Jbl();
		ControleRemoto controleJbl = new ControleRemotoBasico(caixaJbl);

		controleJbl.ligar();
		System.out.println("-----------------------------");

		ControleRemoto controleTvSamsung = new ControleRemotoBasico(tvSamsung);
		ControleRemoto controleTvLg = new ControleRemotoBasico(tvLg);

		ControleRemoto controleVozSamsung = new ControleRemotoVoz(tvSamsung);
		ControleRemoto controleVozLg = new ControleRemotoVoz(tvLg);

		controleTvSamsung.ligar();
		controleTvSamsung.desligar();

		controleTvLg.ligar();
		controleTvLg.desligar();

		System.out.println("------------------------------------------------");

		controleVozSamsung.ligar();
		controleVozSamsung.desligar();

		controleVozLg.ligar();
		controleVozLg.desligar();
	}
}