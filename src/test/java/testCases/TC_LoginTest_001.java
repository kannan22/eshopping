package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import testCases.BaseClass;

import ecommerce.eshop.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{


	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);

		LoginPage lp = new LoginPage(driver);

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[3]/a/span")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/a/span")).click();

		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.clear();
		firstname.sendKeys("Kannan");

		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.clear();
		lastname.sendKeys("A");


		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("IBM");

		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("Park Street");

		WebElement address2 = driver.findElement(By.id("address2"));
		address2.sendKeys("2nd Avenue");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");


		Select country = new Select(driver.findElement(By.id("id_state")));
		country.selectByVisibleText("Alaska");




		WebElement zipcode = driver.findElement(By.id("postcode"));
		zipcode.sendKeys("99501");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("9176132694");

		WebElement mobilephone = driver.findElement(By.id("phone_mobile"));
		mobilephone.sendKeys("6369566606");

		WebElement aliasname = driver.findElement(By.name("alias"));
		aliasname.clear();
		aliasname.sendKeys("Home Address2");

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p[2]/button/span")).click();

		//Selecting First Dress      
		Actions actions = new Actions(driver);

		WebElement category = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		actions.moveToElement(category).perform();


		WebElement subcategory = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a"));
		subcategory.click();

		//List view
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/ul/li[3]/a/i")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div/div[3]/div/div[2]/a[2]/span")).click();


		WebElement qty = driver.findElement(By.id("quantity_wanted"));
		qty.clear();
		qty.sendKeys("5");

		Select size = new Select(driver.findElement(By.id("group_1")));
		size.selectByVisibleText("L");

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[2]/div/ul/li[3]/a")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button/span")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")).click();
		//end of first dress


		//Selecting second Dress      
		Actions actions2 = new Actions(driver);

		WebElement category2 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		actions2.moveToElement(category2).perform();


		WebElement subcategory2 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a"));
		subcategory2.click();

		

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div/div[3]/div/div[2]/a[2]/span")).click();


		WebElement qty2 = driver.findElement(By.id("quantity_wanted"));
		qty2.clear();
		qty2.sendKeys("5");

		Select size2 = new Select(driver.findElement(By.id("group_1")));
		size2.selectByVisibleText("L");

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[2]/div/ul/li[1]/a")).click();

		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button/span")).click();

		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")).click();
		//end of second dress

		
		//Selecting third Dress      
				Actions actions3 = new Actions(driver);

				WebElement category3 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
				actions3.moveToElement(category3).perform();


				WebElement subcategory3 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a"));
				subcategory3.click();

				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[3]/div/div/div[3]/div/div[2]/a[2]/span")).click();

			


				WebElement qty3 = driver.findElement(By.id("quantity_wanted"));
				qty3.clear();
				qty3.sendKeys("5");

				Select size3 = new Select(driver.findElement(By.id("group_1")));
				size3.selectByVisibleText("L");

				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[2]/div/ul/li[1]/a")).click();

				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button/span")).click();

				driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
				//end of third dress

				//checkout
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
				
				
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
				
				WebElement checkbox = driver.findElement(By.id("cgv"));							
		        checkbox.click();
		        
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")).click();
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span")).click();
		        
		        
		        //Move to profile and screenshot order history
		        
		        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span")).click();
		        
		        
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[1]/a/span")).click();
		        
		        
		        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr/td[1]/a")).click();
		        
		        
		        captureScreen(driver,"loginTest");


	}



}
