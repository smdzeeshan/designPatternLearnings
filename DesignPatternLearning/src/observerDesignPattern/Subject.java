package observerDesignPattern;

public interface Subject {

	void subsribe(Subscriber subscriber);

	void unsubsribe(Observer subscriber);

	void notifySubscribers(String title);

	void upload(String title);

}