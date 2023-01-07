package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		int num=r.nextInt(10000);
		String actualCustomerName="Arun";
		actualCustomerName=actualCustomerName+num;
		CreateCustomer cc=new CreateCustomer();
		cc.launchBrowser();
		cc.login();
		Thread.sleep(2000);
		String expcustomername=cc.customerCreation(actualCustomerName);
		if(actualCustomerName.equals(expcustomername))
		{
			System.out.println("Tc is passed");
		}
		else
		{
			System.out.println("Tc is failed");
		}
		
		cc.closeBrowser();
	}
	public void launchBrowser()
	{
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

	}
	public String customerCreation(String actualCustomerName) throws InterruptedException
	{
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		//click on addNew
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		//click on newCustomer
		driver.findElement(By.className("createNewCustomer")).click();
		Thread.sleep(2000);
		//customer name
		driver.findElement(By.className("newNameField")).sendKeys(actualCustomerName);
		//description
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']"))
		                                            .sendKeys("customer creation done");
		//click on create customer
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(2000);
		//fetch the customername
		String expcustomername=driver.findElement(By.cssSelector
				                             (".titleEditButtonContainer>.title")).getText();
		return expcustomername;
	}
	public void closeBrowser()
	{
		driver.close();
	}

}











