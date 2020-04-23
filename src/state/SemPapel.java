package state;

import interfaces.ParquimetroState;

public class SemPapel implements ParquimetroState {

	ParquimetroMaquina maquina;
	
	public  SemPapel(ParquimetroMaquina newMaquina) {
		
		maquina = newMaquina;
		
	}
	@Override
	public void imprimirComprovante(int dinheiro) {
		System.out.println("Estou sem papel");
		
	}

	@Override
	public void inserirCartao() {
		System.out.println("Estou sem papel");
		
	}

	@Override
	public void ejetarCartao() {
		System.out.println("Estou sem papel e você nao inseriu um cartao");
		
	}

	@Override
	public void inserirSenha(int senha) {
		System.out.println("Estou sem papel");
		
	}

}
