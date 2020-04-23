package state;

import interfaces.ParquimetroState;

public class ParquimetroMaquina {

	private ParquimetroState cartaoIn;
	private ParquimetroState cartaoOut;
	private ParquimetroState senhaOk;
	private ParquimetroState semPapel;
	
	ParquimetroState parquimetroEstado;
	
	int papelDisponivel = 2000;
	boolean senhaCorreta;
	int valor;
	public ParquimetroState getCartaoIn() {
		return cartaoIn;
	}

	public ParquimetroState getCartaoOut() {
		return cartaoOut;
	}

	public ParquimetroState getSenhaOk() {
		return senhaOk;
	}

	public ParquimetroState getSemPapel() {
		return semPapel;
	}

	public ParquimetroState getParquimetroEstado() {
		return parquimetroEstado;
	}

	public int getPapelDisponivel() {
		return papelDisponivel;
	}

	public boolean isSenhaCorreta() {
		return senhaCorreta;
	}

	public int getValor() {
		return valor;
	}

	public ParquimetroMaquina() {
		super();

		 cartaoIn = new CartaoIn(this);
		 cartaoOut = new CartaoOut(this);
		 senhaOk = new SenhaOk(this);
		 semPapel = new SemPapel(this);
		 
		 parquimetroEstado = new CartaoOut(this);
		 
		 if(papelDisponivel < 0) {
			 parquimetroEstado = semPapel;
		 }
		 
	}
	 
	void setParquimetroEstado(ParquimetroState novoEstado) {
		parquimetroEstado = novoEstado;
	}
	public void setValor(int novoValor) {
		valor = novoValor;
	}
	public void setPapelDisponivel(int papelDisponivel) {
		this.papelDisponivel = papelDisponivel;
	}
	public void cartaoIn() {
		parquimetroEstado.inserirCartao();
	}
	public void cartaoOut() {
		parquimetroEstado.ejetarCartao();
	}
	public void senhaOk(int senha) {
		parquimetroEstado.inserirSenha(senha);
	}
	public void imprimirComprovante() {
		parquimetroEstado.imprimirComprovante(50);
	}
	
	public ParquimetroState getCartaoInState() {
		return cartaoIn;
	}
	public ParquimetroState getCartaoOutState() {
		return cartaoOut;
	}
	public ParquimetroState getSenhaOkState() {
		return senhaOk;
	}
	public ParquimetroState getSemPapelState() {
		return semPapel;
	}
}
