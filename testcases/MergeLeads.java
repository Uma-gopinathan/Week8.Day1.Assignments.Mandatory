package testCases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPageold;
import base.ProjectSpecificMethods;

public class MergeLeads extends ProjectSpecificMethods {
	@BeforeTest
	public void setUp() {
		excelFileName="MergeLead";
	}
	@Test(dataProvider="fetchData")
	public void MergeLeadsID(String uname,String pswd,String firstName) throws Exception, Throwable {
		LoginPageold lp=new LoginPageold();
		lp.enterUsername(uname).
		enterPassword(pswd).
		clickLoginButton().
		clickCRMSFALink().
		clickLeadsTabInMyHomePage().
		clickMergeLeadsLink().
		clickFromLeadLookUpBtn().
		enterFirstNameInFindLeadsLookupPage(firstName).
		clickFindLeadsBtnFromLeadsLookUpPage().
		clickLeadIDLinkFromLeadsLookupPage(1).
		verifyFromLeadIDIsPopulated().
		clickToLeadLookUpBtn().
		enterFirstNameInFindLeadsLookupPage(firstName).
		clickFindLeadsBtnFromLeadsLookUpPage().
		clickLeadIDLinkFromLeadsLookupPage(2).
		verifyToLeadIDIsPopulated().
		clickMergeBtnInMergeLeadsPage().
		verifyLeadIsCreated();
	}
}