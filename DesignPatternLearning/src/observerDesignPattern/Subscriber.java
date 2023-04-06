package observerDesignPattern;

public class Subscriber implements Observer {

	private String name;
	private Channel ch;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void update(String title) {
		System.out.println("Hi "+name+ ", " + "video has been upload with title as "+title);
	}
	
	public void subscribeChannel(Channel ch) {
		this.ch = ch;
	}

}
