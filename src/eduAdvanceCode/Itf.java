package eduAdvanceCode;

public interface Itf {
	
	int a = 100;
	
	void show();
	
	default void add()
	{
	System.out.println("I am a add method");	
	}


}
