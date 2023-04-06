package decoratorDesignPattern;

public class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "veg food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}

}
