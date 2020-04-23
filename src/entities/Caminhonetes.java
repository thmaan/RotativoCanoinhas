package entities;

public class Caminhonetes extends Veiculo {

	public Caminhonetes(String placa, String marca, String modelo, int horaChegada, int minutosChegada) {
		super(placa, marca, modelo, horaChegada, minutosChegada);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int calcularValorPadrao() {
		return this.getValorPadrao() + 15;
	}

}
