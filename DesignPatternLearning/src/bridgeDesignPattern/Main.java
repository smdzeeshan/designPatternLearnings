package bridgeDesignPattern;

public class Main {
	public static void main(String[] args) {
		System.out.println("Tests with basic remote.");
		Device device = new TV();
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();
        
        
        System.out.println("Tests with advanced remote.");
        Device device2 = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(device2);
        advancedRemote.power();
        advancedRemote.mute();
        device2.printStatus();
	}
}
