package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.ProjectSpecificMethods;

public class FindLeadsLookUpPage extends ProjectSpecificMethods{
	public FindLeadsLookUpPage enterFirstNameInFindLeadsLookupPage(String firstName) {
		getDriver().findElement(By.name("firstName")).sendKeys(firstName); //enter firstname
		return this;
	}
	public FindLeadsLookUpPage clickFindLeadsBtnFromLeadsLookUpPage() throws InterruptedException {
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click(); //click find leads
		Thread.sleep(1000);
		return this;
	}
	public MergeLeadsPage clickLeadIDLinkFromLeadsLookupPage(int linkNum) {
		String XPath = "(//td[contains(@class,'x-grid3-cell-first')]/div/a)["+linkNum+"]";
		WebElement linkLead = getDriver().findElement(By.xpath(XPath));
		strLinkText = linkLead.getText();	
		System.out.println("Clicked this lead from the find leads lookup window: "+ strLinkText);
		linkLead.click(); //clicks the first lead in the search
		//move control to first window
		getDriver().switchTo().window(lstWindowHandles.get(0));
		return new MergeLeadsPage();
	}
}