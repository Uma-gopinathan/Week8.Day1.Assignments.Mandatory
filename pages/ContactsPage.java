package Pages;
import org.openqa.selenium.By;
import base.ProjectSpecificMethods;

public class ContactsPage extends ProjectSpecificMethods{
	public MergeContactsPage clickMergeContactsLinkFromContactsPage() throws InterruptedException {
		getDriver().findElement(By.xpath("//a[text()='Merge Contacts']")).click();  //click on Merge Contacts
		Thread.sleep(1000);
		return new MergeContactsPage();
	} 
}
