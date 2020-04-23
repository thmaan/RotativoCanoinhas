package state;

import interfaces.ParquimetroState;

public class SenhaOk implements ParquimetroState {

	ParquimetroMaquina maquina;
	
	public  SenhaOk(ParquimetroMaquina newMaquina) {
		
		maquina = newMaquina;
		
	}
	@Override
	public void imprimirComprovante(int dinheiro) {
		
		if(maquina.valor > dinheiro) {
			System.out.println("dinheiro insuficiente");
			System.out.println("Cartao ejetado");
			maquina.setParquimetroEstado(maquina.getCartaoOutState());
		}else {
			System.out.println("Transação aprovada");
			maquina.setPapelDisponivel(maquina.papelDisponivel - 1);
			
			System.out.println("Cartao ejetado");
			maquina.setParquimetroEstado(maquina.getCartaoOutState());
			
			if(maquina.papelDisponivel <= 0) {
				maquina.setParquimetroEstado(maquina.getSemPapelState());
			}
		}
		
	}

	@Override
	public void inserirCartao() {
		System.out.println("Voce nao pode inserir outro cartao");
		
	}

	@Override
	public void ejetarCartao() {
		System.out.println("Cartao ejetado");
		maquina.setParquimetroEstado(maquina.getCartaoOutState());
		
	}

	@Override
	public void inserirSenha(int senha) {
		System.out.println("Voce ja digitou sua senha");
		
	}

}
