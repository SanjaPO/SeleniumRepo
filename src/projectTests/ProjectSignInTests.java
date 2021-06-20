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
		myAccountPage.waitForSignOutButton();
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 8, 3);
		String actualText=myAccountPage.getSignOutButton().getText();
		assertEquals(actualText,textForAssertion);
		
	}	
	@Test (priority = 5)
	public void signInWithInvalidEmail() throws InterruptedException{
		String emailaddress = excelReader.getStringData("SignIn&SignOut", 19, 2);
		String password = excelReader.getStringData("SignIn&SignOut", 20, 2);
		signInPage.signIn(emailaddress, password);
		
//		signInPage.waitForAlert();
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 23, 1);
		String actualText=signInPage.invalidEmailText();
		assertEquals(actualText,textForAssertion);
	}	
	@Test (priority = 10)
	public void signInWithInvalidPassword() throws InterruptedException{
		String emailaddress = excelReader.getStringData("SignIn&SignOut", 32, 2);
		String password = excelReader.getStringData("SignIn&SignOut", 33, 2);
		signInPage.signIn(emailaddress, password);
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 36, 1);
		String actualText=signInPage.invalidPasswordText();
		assertEquals(actualText,textForAssertion);
	}
	@Test (priority = 15)
	public void signInWithEmptyCredentials() throws InterruptedException{
		String emailaddress = "";
		String password = "";
		signInPage.signIn(emailaddress, password);
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 49, 1);
		String actualText=signInPage.emptyCredentialsText();
		assertEquals(actualText,textForAssertion);  
	}
	@Test (priority = 20)
	public void signOut() throws InterruptedException{
		this.signInWithInvalidEmail();
		signInPage.signOutButtonClick();
		Thread.sleep(1000);
		String textForAssertion=excelReader.getStringData("SignIn&SignOut", 59, 1);
		String actualText=signInPage.signInText();
		assertEquals(actualText,textForAssertion);
		
	}	
	@AfterMethod
	public void theEndTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
}


