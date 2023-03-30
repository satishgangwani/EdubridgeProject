package eduJavaCode;

public class CLassObject {
	
	boolean isOn;
	
	void turnOn()
	{
		isOn = true;
	}
	
	void turnOff()
	{
		isOn = false;
	}
	
	void displayLightStatus()
	{
		System.out.println(isOn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CLassObject obj = new CLassObject();
		CLassObject obj1 = new CLassObject();
		//obj.turnOff();
		obj1.turnOn();
		
		obj.displayLightStatus();
		//obj1.displayLightStatus();
		
	}

}
