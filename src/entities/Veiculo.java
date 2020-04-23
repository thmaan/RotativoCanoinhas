package entities;

public abstract class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int horaChegada;
	private int minutosChegada;
	private int valorPadrao;
	
	public Veiculo(String placa, String marca, String modelo, int horaChegada, int minutosChegada) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.horaChegada = horaChegada;
		this.minutosChegada = minutosChegada;
	}
	public int retornaValorPadrao() {
		return calcularValorPadrao();
		
	}
	protected abstract int calcularValorPadrao();
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(int horaChegada) {
		this.horaChegada = horaChegada;
	}

	public int getMinutosChegada() {
		return minutosChegada;
	}

	public void setMinutosChegada(int minutosChegada) {
		this.minutosChegada = minutosChegada;
	}

	public int getValorPadrao() {
		return valorPadrao;
	}
	
}

