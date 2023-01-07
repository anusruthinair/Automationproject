package Automation.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Automation.genericLib.BaseClass;

public class DropdownHandling extends BaseClass{
	@Test
	public void handleDropdown()
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
		WebElement dropdown=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		cu.getselectByVisibleText(dropdown,"Product");
		String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);
	
	}

}
