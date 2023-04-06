package facadeDesignPattern;

public class Iphone implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Iphone");
	}

	@Override
	public void price() {
		System.out.println("Iphone price = 1,29,000 rupees");
	}

}
