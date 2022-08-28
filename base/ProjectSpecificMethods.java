package base;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadData;

public class ProjectSpecificMethods extends AbstractTestNGCucumberTests {
	//public static ChromeDriver driver;    //static as it is used by multiple classes
	public String excelFileName="";
	public static String strLeadID="";		//Lead id retrieved from the find leads search result table during run time;
	public static Set<String> allHandles;
	public static String strLinkText;
	public static List<String> lstWindowHandles;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest node;
	public String testName,testDescription,testAuthor,testCategory;

	private static final ThreadLocal<RemoteWebDriver> remoteWebDriver= new ThreadLocal<RemoteWebDriver>();
	//setter method for driver - encapsulation implementation
	public void setDriver() {
		remoteWebDriver.set(new ChromeDriver());
	}
	//getDriver to get value set above - encapsulation implementation
	public RemoteWebDriver getDriver() {
		return remoteWebDriver.get();
	}
	@BeforeMethod
	public void init() {
		//node = test.createNode(testName);		//Added this line to create a seperate report for each data row of a testcase
		WebDriverManager.chromedriver().setup();
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException{
		String[][] tData=ReadData.readData(excelFileName);
		return tData;
	}
	@AfterMethod
	public void closeBrowser() {
		getDriver().close();
	}
}