package adapterDesignPattern;

public class Main {
	public static void main(String[] args) {
		Sparrow sparrow = new Sparrow();
	    ToyDuck toyDuck = new PlasticToyDuck();
	    ToyDuck birdAdapter = new AdapterBird(sparrow);
	    sparrow.makeSound();
	    toyDuck.squeak();
	    birdAdapter.squeak();
	}
	
	
    
    
}
