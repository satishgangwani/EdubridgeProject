package eduJavaCode;

public class Lamp {

	boolean isOn;
	
	void turnOn()
	{
		isOn = true;
	}
	
	void turnOff()
	{
		isOn = false;
	}

	void display()
	{
		System.out.println("Light on ? : " +isOn);
	}
}
