package strategies;
import entities.Tempo;
import entities.Veiculo;
import interfaces.InterfaceCalculoPreco;

public class DoisReaisHoraStrategy implements InterfaceCalculoPreco {
	@Override
	public double calcular(Veiculo v, Tempo t) {
		int total = 0;
		int horas= t.getHora()- v.getHoraChegada();
		int minutos =  t.getMinutos() - v.getMinutosChegada() ;
		horas = horas * 2;
		if( minutos > 30) {
			total++;
		}
		total +=horas;
		return total;
	}

	@Override
	public boolean isNull() {
		return false;
	}
}