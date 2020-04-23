package observer;

import java.util.ArrayList;

import interfaces.Observer;
import interfaces.Subject;

public class ChecaVagas implements Subject {

	private ArrayList<Observer> observers;
	private String vaga;
	private boolean status;
	
	public ChecaVagas() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Observer "+ (observerIndex +1)+ " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(vaga, status);
		}
		
	}
	public void setStatus(String vaga, boolean status) {
		this.vaga = vaga;
		this.status = status;
		notifyObserver();
	}

}
