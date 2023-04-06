package facadeDesignPattern;

public class Shopkeeper {
	
	private MobileShop iphone;  
    private MobileShop samsung;  
    
    public Shopkeeper() {
    	
    }
    
    public void iphoneSale() {
    	new Iphone().modelNo();
    	new Iphone().price();
    }
    
    public void samsungSale() {
    	new Samsung().modelNo();
    	new Samsung().price();
    }
}
