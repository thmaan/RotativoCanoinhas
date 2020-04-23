package interfaces;
import entities.Tempo;
import entities.Veiculo;

public interface InterfaceCalculoPreco {
	public double calcular(Veiculo v, Tempo t);
	public boolean isNull();
}