package decoratorDesignPattern;

public class EthnicDress extends DressDecorator {

	
	
	public EthnicDress(Dress dress) {
		super(dress);
		
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
		System.out.println("Ethinic Dress features added.");
	}
	

}
