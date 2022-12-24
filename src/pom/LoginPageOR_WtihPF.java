package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageOR_WtihPF {
	
	WebDriver driver;
	
	@FindBy(id = "login1") 
	@CacheLookup 
	WebElement userName;
	
	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	WebElement password;
	
	@FindBy(className = "signinbtn")
	@CacheLookup
	WebElement submitButton;
	
	public LoginPageOR_WtihPF(WebDriver driver1)
	{
		driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickButton()
	{
		submitButton.click();
	}

}
