package projectTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectSignInTests extends ProjectBaseTests{
	
	@BeforeMethod
	public void startTest(){
		mainNavigation.signInMainClick();
	}	
	@Test (priority = 0)
	public void signinWithValidCredentials() throws InterruptedException{
		signIn();
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 12, 1);
		String actualText=signInPage.validCredentialsText();
		assertEquals(actualText,textForAssertion);
		
	}	
	@Test (priority = 5)
	public void signInWithInvalidEmail() throws InterruptedException{
		String emailaddress = excelReader.getStringData("SignIn&SignOut", 21, 2);
		String password = excelReader.getStringData("SignIn&SignOut", 22, 2);
		signInPage.signIn(emailaddress, password);
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 25, 1);
		String actualText=signInPage.invalidEmailText();
		assertEquals(actualText,textForAssertion);
	}	
	@Test (priority = 10)
	public void signInWithInvalidPassword() throws InterruptedException{
		String emailaddress = excelReader.getStringData("SignIn&SignOut", 34, 2);
		String password = excelReader.getStringData("SignIn&SignOut", 35, 2);
		signInPage.signIn(emailaddress, password);
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 38, 1);
		String actualText=signInPage.invalidPasswordText();
		assertEquals(actualText,textForAssertion);
	}
	@Test (priority = 15)
	public void signInWithEmptyCredentials() throws InterruptedException{
		String emailaddress = "";
		String password = "";
		signInPage.signIn(emailaddress, password);
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 51, 1);
		String actualText=signInPage.emptyCredentialsText();
		assertEquals(actualText,textForAssertion);  
	}
	@Test (priority = 20)
	public void signOut() throws InterruptedException{
		this.signInWithInvalidEmail();
		signInPage.signOutButtonClick();
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 61, 1);
		String actualText=signInPage.signInText();
		assertEquals(actualText,textForAssertion);
		
	}	
	@AfterMethod
	public void theEndTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
}


