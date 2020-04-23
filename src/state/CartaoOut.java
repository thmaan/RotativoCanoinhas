package state;

import interfaces.ParquimetroState;

public class CartaoOut implements ParquimetroState {

	ParquimetroMaquina maquina;
	
	public  CartaoOut(ParquimetroMaquina newMaquina) {
		
		maquina = newMaquina;
		
	}

	@Override
	public void imprimirComprovante(int dinheiro) {
		System.out.println("imprimirei em breve");
		
	}

	@Override
	public void inserirCartao() {
		System.out.println("Insira seu cartao");
		maquina.setParquimetroEstado(maquina.getCartaoInState());
		
	}

	@Override
	public void ejetarCartao() {
		System.out.println("Retire seu cartao");
		maquina.setParquimetroEstado(maquina.getCartaoOutState());
		
	}

	@Override
	public void inserirSenha(int senha) {
		System.out.println("Insira seu senha");
	
	}

}
