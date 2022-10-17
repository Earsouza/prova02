package ifsc;

public abstract class Veiculo {
	private String placa;
	private int ano;

	Veiculo() {

	}

	Veiculo(String placa, int ano) {

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void exibirDados() {

	}

}
