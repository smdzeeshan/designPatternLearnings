package facadeDesignPattern;

public class Samsung implements MobileShop {

	@Override
	public void modelNo() {
		System.out.println("Samsung Mobile..");
	}

	@Override
	public void price() {
		System.out.println("Samsung price = 15,0000" );
	}

}
