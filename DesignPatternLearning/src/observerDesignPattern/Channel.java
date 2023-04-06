package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private String title;
	private List<Subscriber> subs = new ArrayList<>(); 
	
	public Channel() {
		
	}
	
	@Override
	public void subsribe(Subscriber subscriber) {
		this.subs.add(subscriber);
	}
	
	@Override
	public void unsubsribe(Observer subscriber) {
		this.subs.remove(subscriber);
	}
	
	@Override
	public void notifySubscribers(String title) {
		for (Observer sub : subs) {
			sub.update(title);
		}
	}
	
	@Override
	public void upload(String title) {
		notifySubscribers(title);
	}
}
