package entities;

public class Tempo {
	private int hora;
	private int minutos;
	
	public Tempo(int hora, int minutos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
	}
	public int getHora() {
		return hora;
	}
	public int getMinutos() {
		return minutos;
	}
}
