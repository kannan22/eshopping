package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;


public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL= readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;


@Parameters("browser")
@BeforeClass
public void setup(String br)
{	


if(br.equals("chrome"))
{
System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());	
driver = new ChromeDriver();
}

else if(br.equals("firefox"))
{
	System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());	
	driver = new FirefoxDriver();	
}

else if(br.equals("ie"))
{
	System.setProperty("webdriver.ie.driver",readconfig.getIEpath());	
	driver = new InternetExplorerDriver();	
}


driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get(baseURL);
}





//@AfterClass
//public void tearDown()
//{
//	driver.quit();
//}

public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
	
}
}
