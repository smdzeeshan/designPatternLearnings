package decoratorDesignPattern;

public class FancyDress extends DressDecorator {

	
	
	
	public FancyDress(Dress dress) {
		super(dress);
		
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
		System.out.println("Fancy Dress features added.");
	}
	

}
