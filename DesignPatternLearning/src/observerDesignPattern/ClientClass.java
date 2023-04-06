package observerDesignPattern;

public class ClientClass {
	public static void main(String[] args) {
		
		Subject channel = new Channel();
		Subscriber s1 = new Subscriber("Zeeshan");
		Subscriber s2 = new Subscriber("Khanna");
		Subscriber s3 = new Subscriber("Ravi Raj");
		Subscriber s4 = new Subscriber("Nilesh");
		Subscriber s5 = new Subscriber("Vishwajeet");
		
		channel.subsribe(s1);
		channel.subsribe(s2);
		channel.subsribe(s3);
		channel.subsribe(s4);
		channel.subsribe(s5);
		
		channel.upload("Welcome to my house...");
		
		
		
		channel.unsubsribe(s4);
		
		channel.upload("Welcome to my house3...");
		
		
		
	}
}
