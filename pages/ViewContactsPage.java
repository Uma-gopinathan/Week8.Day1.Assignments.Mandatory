package Pages;
import org.testng.Assert;
import base.ProjectSpecificMethods;

public class ViewContactsPage extends ProjectSpecificMethods {
	public ViewContactsPage veifyMergedContacts() {
		String title = getDriver().getTitle();
		System.out.println("The title after merging the contacts is: " + title);
		Assert.assertEquals(title, "View Contact | opentaps CRM");
		return this;
	}
}
