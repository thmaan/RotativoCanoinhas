package strategies;
import entities.Tempo;
import entities.Veiculo;
import interfaces.InterfaceCalculoPreco;

public class TresReaisHoraStrategy implements InterfaceCalculoPreco {
	@Override
	public double calcular(Veiculo v, Tempo t) {
		int total = 0;
		int horas= v.getHoraChegada() - t.getHora();
		int minutos = v.getMinutosChegada() - t.getMinutos();
		horas = horas *  3;
		if( minutos > 50) {
			total++;
		}
		total +=horas;
		if(v.getMarca().equals("Tesla")) {
			total =1000000000;
		}
		return total;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}
