package Automation.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Automation.genericLib.BaseClass;
import Automation.genericLib.CommonUtility;
import Automation.genericLib.DataUtility;

public class AlertHandling extends BaseClass {
	@Test
	public void handleAlert() throws EncryptedDocumentException, IOException
	{
		
driver.findElement(By.className("popup_menu_button_settings")).click();
driver.findElement(By.linkText("Types of Work")).click();
driver.findElement(By.className("i")).click();
driver.findElement(By.id("name")).sendKeys(du.getDataFromExcelsheet("Sheet1", 2, 1));
driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
String msg=cu.getAlertmsg(driver);
System.out.println(msg);
cu.alertOk(driver);

}
}












