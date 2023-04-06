package decoratorDesignPattern;

abstract class DressDecorator implements Dress {
	public Dress dress;
	
	public DressDecorator (Dress dress) {
		this.dress = dress;
	}
	
	@Override
	public void assemble() {
		this.dress.assemble();
	}
	
	
}
