package Pages;
import org.openqa.selenium.By;
import java.util.ArrayList;
import base.ProjectSpecificMethods;

public class ContactsLookUpPage extends ProjectSpecificMethods{
	public MergeContactsPage clickContactIDLink(int linkNum) {
		String XPath="(//td[contains(@class,'x-grid3-cell-first')]/div/a)["+linkNum+"]";
		allHandles = getDriver().getWindowHandles();		
		//Create a list to access by id, cant do this in set as it doesnt have get method
		lstWindowHandles = new ArrayList<String>(allHandles);
		String strSecondHandle=lstWindowHandles.get(1); //gets the 2nd handle		
		getDriver().switchTo().window(strSecondHandle);		//moving control to 2nd window
		getDriver().findElement(By.xpath(XPath)).click();  //click the first contact id link
		getDriver().switchTo().window(lstWindowHandles.get(0)); //Switch to 1st window
		return new MergeContactsPage();		
	}
}
