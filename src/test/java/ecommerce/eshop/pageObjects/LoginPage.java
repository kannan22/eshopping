package ecommerce.eshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	@CacheLookup
	WebElement singin;
	
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="passwd")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	@CacheLookup
	WebElement btnLogin;
	
	
	
	
	public void singinclick (String txt)
	{
		singin.click();
		
	}
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	
	
}
