import entities.RedeEstacionamentos;
import observer.AtualizaVagas;
import observer.ChecaVagas;
import state.ParquimetroMaquina;
import strategies.CeltaStrategy;
import strategies.DoisReaisHoraStrategy;
import strategies.NullStrategy;

public class main {

	public static void main(String[] args) {
		
		RedeEstacionamentos rotativoMafra = new RedeEstacionamentos("Rotativo Mafra", new NullStrategy());
		
		rotativoMafra.naVaga("null","null","null","null", 0, 0, 0, 0);
		System.out.println(rotativoMafra.getValor() + " reais");
		
		rotativoMafra.setStrategy(new CeltaStrategy());
		rotativoMafra.naVaga("Carro","AIQ5020", "GM", "Celta", 10, 0, 17, 0);
		System.out.println(rotativoMafra.getValor() + " reais");
		
		rotativoMafra.naVaga("Carro","AIQ5020", "GM", "Onix", 10, 0, 17, 0);
		rotativoMafra.setStrategy(new DoisReaisHoraStrategy());
		System.out.println(rotativoMafra.getValor() + " reais");
		
	
		rotativoMafra.naVaga("Moto","AIQ5020", "GM", "Bis", 10, 0, 17, 0);
		System.out.println(rotativoMafra.getValor() + " reais");
	
		rotativoMafra.naVaga("Caminhonete","AIQ5020", "GM", "Celta", 10, 0, 17, 0);
		System.out.println(rotativoMafra.getValor() + " reais");
	
		
		ChecaVagas checar = new ChecaVagas();
		AtualizaVagas atualizar = new AtualizaVagas(checar);
		
		checar.setStatus("1", true);
		checar.setStatus("3", true);
		checar.setStatus("2", false);
		
		AtualizaVagas atualizar2 = new AtualizaVagas(checar);
		checar.setStatus("1", true);
		checar.setStatus("3", true);
		checar.setStatus("2", false);
		
		ParquimetroMaquina maquina = new ParquimetroMaquina();
		maquina.setValor((int)rotativoMafra.getValor());
		System.out.println(maquina.getValor());
		maquina.cartaoIn();
		maquina.cartaoOut();
		maquina.cartaoIn();
		maquina.senhaOk(1234);
		maquina.imprimirComprovante();
	}
}
