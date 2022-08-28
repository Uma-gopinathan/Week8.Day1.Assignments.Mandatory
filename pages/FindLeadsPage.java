package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	public FindLeadsPage clickPhoneTab() {
		getDriver().findElement(By.linkText("Phone")).click();   //click the Phone tab
		return this;
	}
	public FindLeadsPage enterFirstNameInFindLeadsPage(String firstName) {
		getDriver().findElement(By.xpath("(//label[text()='First name:'])[3]/following::input[@name='firstName']")).sendKeys(firstName); //enter the first name
		return this;
	}
	public FindLeadsPage enterCountryCode(String strPhoneCountryCode) {
		getDriver().findElement(By.name("phoneCountryCode")).clear();
		getDriver().findElement(By.name("phoneCountryCode")).sendKeys(strPhoneCountryCode);//enter the phone country code
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String strPhoneNumber) {
		getDriver().findElement(By.name("phoneNumber")).sendKeys(strPhoneNumber); //enter phone number
		return this;
	}
	public FindLeadsPage enterAreaCode(String strPhoneAreaCode) {
		getDriver().findElement(By.name("phoneAreaCode")).sendKeys(strPhoneAreaCode); //Enter area code
		return this;
	}
	public FindLeadsPage clickFindLeadsBtnInFindLeadsPage() throws InterruptedException {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click(); //click the find leads button
		Thread.sleep(2000);
		return this;
	}
	public ViewLeadPage clickLeadIDLinkFromSearchResults() {
		WebElement leadID = getDriver().findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)"));
		strLeadID = leadID.getText(); //capture the lead id from results - first link
		leadID.click(); //click the lead id link
		return new ViewLeadPage();
	}
	public FindLeadsPage enterLeadIDInFindLeadsPageForDeletedLead() {		//search by lead id
		System.out.println("Lead id to delete is :" +strLeadID);
		getDriver().findElement(By.name("id")).sendKeys(strLeadID);  
		return this;
	}
	public FindLeadsPage verifyNoRecordsMessage() {		
		WebElement strNoRecords=getDriver().findElement(By.xpath("//div[@class='x-paging-info']"));  //text at the end of the search results table
		String strMessage=strNoRecords.getText();
		if(strMessage.equals("No records to display")){  //table displays no records
			System.out.println("Passed!No records are displayed for the deleted lead");
		}
		else if(strMessage.contains("displaying")) { //table displays one or more records
			System.out.println("Failed!lead was not deleted");
		}
		Assert.assertEquals(strMessage, "No records to display");		//Hard assert
		return this;
	}
}