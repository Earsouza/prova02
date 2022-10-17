package ifsc;

public class Onibus extends Veiculo {

	private int assentos;

	Onibus() {

	}

	Onibus(String placa, int ano, int assentos) {
		this.setPlaca(placa);
		this.setAno(ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

}
