package Pages;
import java.util.ArrayList;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import base.ProjectSpecificMethods;

public class MergeLeadsPage extends ProjectSpecificMethods{
	public FindLeadsLookUpPage clickFromLeadLookUpBtn() {
		//Click the lookup leads image
		getDriver().findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		allHandles = getDriver().getWindowHandles(); 		//declared in projectspecific methods to use across classes
		lstWindowHandles = new ArrayList<String>(allHandles);
		String strSecondHandle=lstWindowHandles.get(1); //gets the 2nd handle
		getDriver().switchTo().window(strSecondHandle);
		return new FindLeadsLookUpPage();
	}
	public FindLeadsLookUpPage clickToLeadLookUpBtn() {
		//Click the lookup leads image
		getDriver().findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		allHandles = getDriver().getWindowHandles(); 		//declared in projectspecific methods to use across classes
		lstWindowHandles = new ArrayList<String>(allHandles);
		String strSecondHandle=lstWindowHandles.get(1); //gets the 2nd handle
		getDriver().switchTo().window(strSecondHandle);
		return new FindLeadsLookUpPage();
	}
	public MergeLeadsPage verifyFromLeadIDIsPopulated() {
		String strLinkText2 = getDriver().findElement(By.id("ComboBox_partyIdFrom")).getAttribute("value");
		//comparing if the link text is populated in the field
		Assert.assertEquals(strLinkText, strLinkText2);		//Hard assert
		return this;
	}
	public MergeLeadsPage verifyToLeadIDIsPopulated() {
		String strLinkText2 = getDriver().findElement(By.id("ComboBox_partyIdTo")).getAttribute("value");
		//comparing if the link text is populated in the field
		Assert.assertEquals(strLinkText, strLinkText2);		//Hard assert
		return this;
	}
	public ViewLeadPage clickMergeBtnInMergeLeadsPage() {		
		getDriver().findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert=getDriver().switchTo().alert();
		alert.accept(); //clicks ok on the prompt box
		return new ViewLeadPage();
	}
}


