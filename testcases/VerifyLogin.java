package testCases;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPageold;
import base.ProjectSpecificMethods;

public class VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setUp() {
		excelFileName="Login";
		//testName="verify Login to LeafTaps";
		//testDescription="Verify Postive Login";
		//testAuthor="Uma";
		//testCategory="Smoke";
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uname,String password) throws IOException, Exception {
		LoginPageold lp=new LoginPageold();
		lp.enterUsername(uname).enterPassword(password).clickLoginButton();	
	}
}
