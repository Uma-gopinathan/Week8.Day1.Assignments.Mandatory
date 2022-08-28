package testCases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPageold;
import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
	@BeforeTest
	public void setUp() {
		excelFileName="EditLead";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLeadID(String uname,String pswd,String firstName,String newCompanyName) throws Exception, Throwable {
		LoginPageold lp=new LoginPageold();
		lp.enterUsername(uname).
		enterPassword(pswd).
		clickLoginButton().
		clickCRMSFALink().
		clickLeadsTabInMyHomePage().
		clickFindLeadsLink().
		enterFirstNameInFindLeadsPage(firstName).
		clickFindLeadsBtnInFindLeadsPage().
		clickLeadIDLinkFromSearchResults().
		clickEditButtonInViewLeadsPage().
		enterCompanyName(newCompanyName).
		clickUpdateBtnInEditLeadPage().
		verifyEditedLead(newCompanyName);
	}
}
