package builderDesignPattern3;
// Refer https://youtu.be/LiqJS3X_lHc

public class Main {
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile.MobileBuilder().setColor("white").build();
		System.out.println(mobile);
	}
}
