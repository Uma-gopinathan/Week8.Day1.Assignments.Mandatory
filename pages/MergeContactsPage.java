package Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import base.ProjectSpecificMethods;

public class MergeContactsPage extends ProjectSpecificMethods {
	public ContactsLookUpPage clickFromContactLookupBtnInMergeContactsPage() {
		getDriver().findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		return new ContactsLookUpPage();
	}

	public ContactsLookUpPage clickToContactLookupBtnInMergeContactsPage() {
		getDriver().findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click(); //click the lookup next to 'to contact'
		return new ContactsLookUpPage();
	}
	public ViewContactsPage clickMergeBtnInMergeContactsPage() {
		getDriver().findElement(By.xpath("//a[text()='Merge']")).click(); //Click the merge button
		//Handle the alert
		Alert alert=getDriver().switchTo().alert();
		alert.accept(); //clicks ok on the prompt box
		return new ViewContactsPage();
	}
}