package decoratorDesignPattern;

public class SportyDress extends DressDecorator {
	
	public SportyDress(Dress dress) {
		super(dress);
		
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
		System.out.println("Sporty Dress features added.");
	}
	

}
