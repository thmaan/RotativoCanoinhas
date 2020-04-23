package strategies;
import entities.Tempo;
import entities.Veiculo;
import interfaces.InterfaceCalculoPreco;

public class NullStrategy implements InterfaceCalculoPreco {

	@Override
	public double calcular(Veiculo v, Tempo t) {
		System.out.println("Null object nao tem valor");
		return 0;
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
