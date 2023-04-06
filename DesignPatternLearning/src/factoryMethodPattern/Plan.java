package factoryMethodPattern;

abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int units){  
        System.out.println(units*rate);  
    }

	@Override
	public String toString() {
		return "Plan [rate=" + rate + "]";
	}  
	
	
}
