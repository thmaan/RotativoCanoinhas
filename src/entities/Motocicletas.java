package entities;

public class Motocicletas extends Veiculo {

	public Motocicletas(String placa, String marca, String modelo, int horaChegada, int minutosChegada) {
		super(placa, marca, modelo, horaChegada, minutosChegada);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int calcularValorPadrao() {
		return this.getValorPadrao() + 5;
	}
	
}
