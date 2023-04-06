package singletonDesignPattern;

public class A {
	private static final A a = new A();
	
	private A() {
	}
	
	public static A getA() {
		return a;
	}
}
