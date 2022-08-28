package Pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public MyHomePage clickCRMSFALink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click(); //click CRM/SFA button
		return new MyHomePage();
	}
}
