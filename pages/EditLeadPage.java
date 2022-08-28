package Pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	public EditLeadPage enterCompanyName(String strNewCompany) throws InterruptedException {
		getDriver().findElement(By.xpath("//span[text()='Company Name']/following::input[@name='companyName']")).clear(); //clear the company name
		getDriver().findElement(By.xpath("//span[text()='Company Name']/following::input[@name='companyName']")).sendKeys(strNewCompany) ; //enter new company name
		return this;
	}
	
	public ViewLeadPage clickUpdateBtnInEditLeadPage() throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@value='Update']")).click();  //click updatebutton
		return new ViewLeadPage();
	}
}
