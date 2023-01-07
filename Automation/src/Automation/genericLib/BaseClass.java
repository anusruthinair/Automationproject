package Automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Automation.elementRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public DataUtility du=new DataUtility();
	public CommonUtility cu=new CommonUtility();
	public static WebDriver listenerDriver;
	@BeforeClass(alwaysRun=true)
public void launchBrowser()
{
System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
listenerDriver=driver;
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	@BeforeMethod(alwaysRun=true)
public void login() throws IOException
{
	
}
	@AfterMethod(alwaysRun=true)
public void logout()
{
		LoginPage lp=new LoginPage(driver);
		lp.logoutApp();
}
	@AfterClass(alwaysRun=true)
public void closeBrowser()
{
	driver.close();
}
}









