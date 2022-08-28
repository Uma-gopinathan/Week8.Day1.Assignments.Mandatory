package Pages;
import org.openqa.selenium.By;
import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyLeadsPage clickLeadsTabInMyHomePage() {
		getDriver().findElement(By.linkText("Leads")).click(); //Click the Leads tab link
		return new MyLeadsPage();
	}
	public ContactsPage clickContactsTab() throws InterruptedException {
		getDriver().findElement(By.xpath("//a[text()='Contacts']")).click();    //clicks the accounts link
		Thread.sleep(2000);
		return new ContactsPage();
	}
}
