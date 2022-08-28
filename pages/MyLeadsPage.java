package Pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyLeadsPage  extends ProjectSpecificMethods{
	public CreateLeadPage clickCreateLeadLink() {
		getDriver().findElement(By.linkText("Create Lead")).click(); //click the create link id
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLeadsLink() throws InterruptedException {
		getDriver().findElement(By.linkText("Find Leads")).click(); //click the find leads button
		Thread.sleep(2000);
		return new FindLeadsPage();
	}
	public MergeLeadsPage clickMergeLeadsLink() throws InterruptedException {
		getDriver().findElement(By.linkText("Merge Leads")).click(); //click the merge lead link
		Thread.sleep(2000);
		return new MergeLeadsPage();
	}
}