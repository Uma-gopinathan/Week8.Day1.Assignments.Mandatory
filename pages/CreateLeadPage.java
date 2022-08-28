package Pages;
import org.openqa.selenium.By;
import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage enterCompanyNameInCreateLeadPage(String companyName) {		
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);//Enter company name
		return this;
	}
	public CreateLeadPage enterFirstNameInCreateLeadPage(String firstName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);//Enter the first name
		return this;
	}
	public CreateLeadPage enterLastNameInCreateLeadPage(String lastName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);//Enter the last name
		return this;
	}
	public ViewLeadPage clickCreateLeadBtnInCreateLeadPage() {
		getDriver().findElement(By.className("smallSubmit")).click();  //click the create lead button
		return new ViewLeadPage();
	}

}
