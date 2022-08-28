package Pages;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage verifyLeadIsCreated() {
		//verify if the lead is created-page verification
		String strTitle=getDriver().getTitle();
		System.out.println(strTitle);
		if(strTitle.equals("View Lead | opentaps CRM")) {
			System.out.println("Passed!Successfully opened lead page");
		}
		else{
			System.out.println("Failed!View Lead page is not opened");
		}	
		Assert.assertEquals(strTitle, "View Lead | opentaps CRM");		//Hard assert
		return this;
	}
	public MyLeadsPage clickDeleteLinkViewLeadsPage() {
		//Delete lead
		getDriver().findElement(By.xpath("//a[text()='Delete']")).click(); 	//click the delete link
		return new MyLeadsPage();
	}
	public EditLeadPage clickEditButtonInViewLeadsPage() {
		//Delete lead
		getDriver().findElement(By.xpath("//a[text()='Edit']")).click();  //Click the edit button
		return new EditLeadPage();
	}
	public ViewLeadPage verifyEditedLead(String newCompanyName) {
		//Confirm the changed name appears
		WebElement updatedCompany = getDriver().findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String strUpdatedCompanyName = updatedCompany.getText();
		System.out.println(strUpdatedCompanyName);
		if(strUpdatedCompanyName.contains(newCompanyName)) {
			System.out.println("Changed company name is updated in the lead");
		}
		else {
			System.out.println("Failed!!Changed company name is not updated in the lead");
		}
		return this;
	}
}