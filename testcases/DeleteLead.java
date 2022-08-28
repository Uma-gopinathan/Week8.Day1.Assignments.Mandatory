package testCases;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPageold;
import base.ProjectSpecificMethods;

public class DeleteLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setUp() {
		excelFileName="DeleteLead";
	}
	@Test(dataProvider="fetchData")
	public void DeleteLeadID(String uname,String pswd,String countryCode,String areaCode,String phoneNum) throws IOException, Exception {
		LoginPageold lp=new LoginPageold();
		try {
			lp.enterUsername(uname).enterPassword(pswd).clickLoginButton().clickCRMSFALink().clickLeadsTabInMyHomePage().clickFindLeadsLink().clickPhoneTab().enterCountryCode(countryCode).enterAreaCode(areaCode).enterPhoneNumber(phoneNum).clickFindLeadsBtnInFindLeadsPage().clickLeadIDLinkFromSearchResults().clickDeleteLinkViewLeadsPage().clickFindLeadsLink().enterLeadIDInFindLeadsPageForDeletedLead().clickFindLeadsBtnInFindLeadsPage().verifyNoRecordsMessage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
