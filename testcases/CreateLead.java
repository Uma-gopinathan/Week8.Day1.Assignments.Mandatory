package testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPageold;
import base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	@BeforeTest
	public void setUp() {
		excelFileName="CreateLead";
		//testName="Create Lead";
		//testDescription="Create a lead in Leaftaps application";
		//testAuthor="Uma";
		//testCategory="Regression";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uname,String pswd,String compName,String fName, String lName) throws IOException, Exception {
		LoginPageold lp = new LoginPageold();
		//power of return statement in all these classes
		lp.enterUsername(uname)
		.enterPassword(pswd)
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsTabInMyHomePage()
		.clickCreateLeadLink()
		.enterCompanyNameInCreateLeadPage(compName)
		.enterFirstNameInCreateLeadPage(fName)
		.enterLastNameInCreateLeadPage(lName)
		.clickCreateLeadBtnInCreateLeadPage()
		.verifyLeadIsCreated();	
	}
}
