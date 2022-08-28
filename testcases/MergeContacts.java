package testCases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPageold;
import base.ProjectSpecificMethods;

public class MergeContacts extends ProjectSpecificMethods{
	@BeforeTest
	public void setUp() {
		excelFileName="Login";
	}
	@Test(dataProvider="fetchData")
	public void MergeTwoContacts(String uname,String pswd) throws Exception, Throwable {
		LoginPageold lp=new LoginPageold();
		lp.enterUsername(uname).
		enterPassword(pswd).
		clickLoginButton().
		clickCRMSFALink().
		clickContactsTab().
		clickMergeContactsLinkFromContactsPage().
		clickFromContactLookupBtnInMergeContactsPage().
		clickContactIDLink(1).
		clickToContactLookupBtnInMergeContactsPage().
		clickContactIDLink(2).
		clickMergeBtnInMergeContactsPage().
		veifyMergedContacts();
	}
}
;