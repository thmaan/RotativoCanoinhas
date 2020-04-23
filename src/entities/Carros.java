package entities;

public class Carros extends Veiculo {

	public Carros(String placa, String marca, String modelo, int horaChegada, int minutosChegada) {
		super(placa, marca, modelo, horaChegada, minutosChegada);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int calcularValorPadrao() {
		return this.getValorPadrao() + 10;
	}
}
