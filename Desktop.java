package week3.day2.Assignments;

public class Desktop implements HardWare,Software{

	public void softwareResource() {
		System.out.println("this is hardware");
		
	}

	public void hardwareResources() {
		
		System.out.println("this is software");
		
	}

	
	public static void main(String[] args) {
		
		Desktop obj=new Desktop();
		
		obj.hardwareResources();
		
		obj.softwareResource();
		
		
	}
	
}
