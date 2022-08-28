package Pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class LoginPageold extends ProjectSpecificMethods{
	public LoginPageold enterUsername(String username) throws Exception {
		getDriver().findElement(By.id("username")).sendKeys(username);	//enter the username in the username field
		return this;
	}
	public LoginPageold enterPassword(String password) throws IOException {
		getDriver().findElement(By.id("password")).sendKeys(password);		//enter the password in the password field
		return this;
	}
	public HomePage clickLoginButton() throws Exception {
		getDriver().findElement(By.className("decorativeSubmit")).click();//Click the login button

		//verify if login is successful
		WebElement logout= getDriver().findElement(By.className("decorativeSubmit")); //Check if we are in the right page
		String attribute=logout.getAttribute("value"); //Get the attribute and print
		System.out.println(attribute);		
		if(attribute.equals("Logout")){
			System.out.println("Successfully logged in to leaftaps as demosalesmanager");
		}
		return new HomePage();
	}
}
