package Automation.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Automation.genericLib.BaseClass;
import Automation.genericLib.CommonUtility;
import Automation.genericLib.DataUtility;
@Listeners(Automation.genericLib.ListenerImplemetation.class)
public class CreateCust extends BaseClass{
	@Test
	public void customercreation() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		int num=cu.getRandom(10000);
		String actualcustomer=du.getDataFromExcelsheet("Sheet1",0,0);
		actualcustomer=actualcustomer+num;
		//click on task
	driver.findElement(By.id("container_tasks")).click();
	
	//click on addNew
	driver.findElement(By.cssSelector(".title.ellipsi")).click();
	//click on newCustomer
	driver.findElement(By.className("createNewCustomer")).click();
	driver.findElement(By.className("newNameField")).sendKeys(actualcustomer);
	driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	Thread.sleep(2000);
	System.out.println("customer created successfully");
	
	
	
	}

}












