package observer;

import interfaces.Observer;
import interfaces.Subject;

public class AtualizaVagas implements Observer {
	private String vaga;
	private boolean status;
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject atualizaVagas;
	

	public AtualizaVagas( Subject atualizaVagas) {
		super();
		this.atualizaVagas = atualizaVagas;
		this.observerID = ++observerIDTracker;
		System.out.println("new Observer "+this.observerID);
		
		atualizaVagas.register(this);
	}

	@Override
	public void update(String vaga, boolean status) {
		this.vaga = vaga;
		this.status = status;
		
		mostrarVagas();
	}

	public void mostrarVagas() {
		System.out.println("Observer: " +observerID +"\nNa vaga: " + vaga +" "+ status);
	}
}
