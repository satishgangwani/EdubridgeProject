package eduTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eduSeleniumCode.ExplictlyWait;

public class NormalTest {
	WebDriver driver;
SoftAssert obj = new SoftAssert();



@Test 
public void  add() {
	ExplictlyWait obj1 = new ExplictlyWait();
	obj1.launchBrowse();
}
	
	@Test
	public void verifyTitle()
	{
		System.out.println("Open Browser");
		System.out.println("Launch Application");
		//Hard Assert: This will terminate the program once hard assert fail
		Assert.assertEquals(true, true);
		System.out.println("Enter User name");
		//Soft Assert: This will not terminate the program even if assert fail
		obj.assertEquals(true, false);
		System.out.println("Enter Password");
		obj.assertEquals(true, true);
		System.out.println("Verify Title");
		obj.assertAll();
	}

	@Test
	public void verify()
	{
		System.out.println("Open Title");
		System.out.println("Launch Title");
		//Hard Assert: This will terminate the program once hard assert fail
		Assert.assertEquals(true, true);
		System.out.println("Enter User name");
		//Soft Assert: This will not terminate the program even if assert fail
		obj.assertEquals(true, true);
		System.out.println("Enter Password");
		obj.assertEquals(true, true);
		System.out.println("Verify Title");
		
		
		
		
		obj.assertAll();
		
	}

	
	
}
