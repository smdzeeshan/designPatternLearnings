package singletonDesignPattern;

public class A2 {
	private static A2 a2;
	
	private A2() {
		
	}
	
	public static synchronized A2 getA2() {
		if (a2==null) {
			a2 = new A2();
		}
		return a2;
	}
}
