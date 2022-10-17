package ifsc;

public class Caminhao extends Veiculo {

	private int eixo;

	Caminhao(String placa, int ano, int eixo) {
		this.setPlaca(placa);
		this.setAno(ano);
		this.eixo = eixo;
	}

	Caminhao() {

	}

	public int getEixo() {
		return eixo;
	}

	public void setEixo(int eixo) {
		this.eixo = eixo;
	}

}
