
public class Desktop implements Hardware,Software{

	@Override
	public void softwareResources() {
		System.out.println("OS");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Harddisk");
		
	}
	public void desktopModel1() {
		System.out.println("Model");
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
	    d.softwareResources();
		
	}
	

}
