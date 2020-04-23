package strategies;
import entities.Tempo;
import entities.Veiculo;
import interfaces.InterfaceCalculoPreco;

public class CeltaStrategy implements InterfaceCalculoPreco {
	@Override
	public double calcular(Veiculo v, Tempo t) {
		int total = 0;
		if(v.getModelo().equals("Celta")) {
			total = 0;
		}else
			total = 50;
		return total;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}
