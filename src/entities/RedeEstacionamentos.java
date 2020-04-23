package entities;
import interfaces.InterfaceCalculoPreco;

public class RedeEstacionamentos {
	private String nome;
	private InterfaceCalculoPreco strategy;
	private Veiculo v;
	private Tempo t;
	private int valorPadrao;
	
	public RedeEstacionamentos(String nome, InterfaceCalculoPreco strategy) {
		super();
		this.nome = nome;
		this.strategy = strategy;
	}
	public double getValor() {
		return strategy.calcular(v, t) + valorPadrao;
	}
	public void naVaga(String tipo, String placa, String marca, String nome, int horaChegada, int minutosChegada, int horaSaida, int minutosSaida) {
		if(tipo == "null") {
			System.out.println("Null object");
			this.valorPadrao = 0;
		}else {
			if(tipo == "Carro") {
				this.v = new Carros(placa, marca, nome, horaChegada, minutosChegada);
			}
			if(tipo == "Moto") {
				this.v = new Motocicletas(placa, marca, nome, horaChegada, minutosChegada);
			}
			if(tipo == "Caminhonete") {
				this.v = new Caminhonetes(placa, marca, nome, horaChegada, minutosChegada);
			}
			if(tipo == "null") {
				System.out.println("Null object");
				this.valorPadrao = 0;
			}
			this.valorPadrao = v.retornaValorPadrao();
			this.t = new Tempo(horaSaida,minutosSaida);
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public InterfaceCalculoPreco getStrategy() {
		return strategy;
	}
	public void setStrategy(InterfaceCalculoPreco strategy) {
		this.strategy = strategy;
	}
	public Veiculo getV() {
		return v;
	}

	public void setV(Veiculo v) {
		this.v = v;
	}
	public Tempo getT() {
		return t;
	}
	public void setT(Tempo t) {
		this.t = t;
	}
}
