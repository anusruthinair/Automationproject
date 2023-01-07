package com.section1;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerCreation {
	public static void main(String[] args) throws InterruptedException {
		Random r=new Random();
		int num=r.nextInt(10000);
		String actualCustomerName="Arun";
		actualCustomerName=actualCustomerName+num;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GANGA\\Documents\\seleniumbatch\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	//login
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	//click on task
	driver.findElement(By.id("container_tasks")).click();
	
	//click on addNew
	driver.findElement(By.cssSelector(".title.ellipsis")).click();
	//click on newCustomer
	driver.findElement(By.className("createNewCustomer")).click();
	
	//customer name
	driver.findElement(By.className("newNameField")).sendKeys(actualCustomerName);
	//description
	driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']"))
	                                            .sendKeys("customer creation done");
	//click on create customer
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElementLocated
			(By.cssSelector(".titleEditButtonContainer>.title"),actualCustomerName));
	//fetch the customername
	String expcustomername=driver.findElement(By.cssSelector
			                             (".titleEditButtonContainer>.title")).getText();
	System.out.println(expcustomername);
	if(actualCustomerName.equals(expcustomername))
	{
		System.out.println("Tc is passed");
	}
	else
	{
		System.out.println("Tc is failed");
	}
	}

}











