package ifsc;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Caminhao> listaCaminhoes = new ArrayList<>();
		ArrayList<Onibus> listaOnibus = new ArrayList<>();

		Caminhao caminhao1 = new Caminhao("MHA6885", 2022, 5);
		listaCaminhoes.add(caminhao1);
		Caminhao caminhao2 = new Caminhao("L32FH4", 1993, 7);
		listaCaminhoes.add(caminhao2);
		Caminhao caminhao3 = new Caminhao("NDO9003", 2001, 2);
		listaCaminhoes.add(caminhao3);

		Onibus onibus1 = new Onibus("LGA1231", 1998, 40);
		listaOnibus.add(onibus1);
		Onibus onibus2 = new Onibus("GPO3123", 2003, 20);
		listaOnibus.add(onibus2);
		Onibus onibus3 = new Onibus("RLX1212", 2016, 80);
		listaOnibus.add(onibus3);

		System.out.println("---Lista de Onibus---");

		for (Onibus o1 : listaOnibus) {
			System.out.println("Placa: " + o1.getPlaca());
			System.out.println("Ano: " + o1.getAno());
			System.out.println("Eixos: " + o1.getAssentos());
			System.out.println("");

		}

		System.out.println("---Lista de Caminhões---");

		for (Caminhao c1 : listaCaminhoes) {
			System.out.println("Placa: " + c1.getPlaca());
			System.out.println("Ano: " + c1.getAno());
			System.out.println("Eixos: " + c1.getEixo());
			System.out.println("");
		}

	}

}
