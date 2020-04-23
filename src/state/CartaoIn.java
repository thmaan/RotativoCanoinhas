package state;

import interfaces.ParquimetroState;

public class CartaoIn implements ParquimetroState {

	ParquimetroMaquina maquina;
	
	public  CartaoIn(ParquimetroMaquina newMaquina) {
		
		maquina = newMaquina;
		
	}
	@Override
	public void imprimirComprovante(int dinheiro) {
		System.out.println("imprimirei em breve");
		
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
		if(senha == 1234) {
			System.out.println("Senha certa, em frente");
			maquina.senhaCorreta = true;
			maquina.setParquimetroEstado(maquina.getSenhaOkState());
		}else {
			System.out.println("Senha invalida");
			maquina.senhaCorreta = false;
			ejetarCartao();
		}
		
	}

}
