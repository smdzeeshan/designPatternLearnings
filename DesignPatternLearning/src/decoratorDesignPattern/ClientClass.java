package decoratorDesignPattern;

public class ClientClass {
	public static void main(String[] args) {
		Dress dress = new FancyDress(new EthnicDress(new BasicDress()));
		dress.assemble();
	}
}
