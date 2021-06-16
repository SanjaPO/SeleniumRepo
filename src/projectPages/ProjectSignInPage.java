package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectSignInPage {
	WebDriver driver;
	WebElement emailField;
	WebElement passwordField;
	WebElement signInButton;
	WebElement signOut;
	WebElement validCrentials;
	WebElement invalidEmail;
	WebElement invalidPassword;
	WebElement emptyCredentials;
	WebElement signIn;

	
	public ProjectSignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailAddressField() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSigninButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	
	public WebElement getSignOut() {
		return driver.findElement(By.className("logout"));
	}
	
	public WebElement getValidCrentials() {
		return driver.findElement(By.className("page-heading"));
	}

	public WebElement getInvalidEmail() {
		return driver.findElement(By.xpath("//li[text()='Invalid email address.']"));
	}

	public WebElement getInvalidPassword() {
		return driver.findElement(By.xpath("//li[text()='Authentication failed.']"));
	}

	public WebElement getEmptyCredentials() {
		return driver.findElement(By.xpath("//li[text()='An email address required.']"));
	}
	

	public WebElement getSignIn() {
		return driver.findElement(By.className("login"));
	}

	public void signInButtonClick() {
		this.getSigninButton().click();
	}
	
	public void signOutButtonClick() {
		this.getSignOut().click();
	}

	public void insertEmailAddress(String emailaddress) {
		this.getEmailAddressField().clear();
		this.getEmailAddressField().sendKeys(emailaddress);
	}
	
	public void insertPassword(String password) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
	
	public void signIn(String emailaddress, String password) {
		this.insertEmailAddress(emailaddress);
		this.insertPassword(password);
		this.signInButtonClick();
	}
	public String validCredentialsText() {
		return this.validCrentials.getText();	
	}
	public String invalidEmailText() {
		return this.invalidEmail.getText();
	}
	public String invalidPasswordText() {
		return this.invalidPassword.getText();
	}
	public String emptyCredentialsText() {
		return this.emptyCredentials.getText();	
	}
	public String signOutText() {
		return this.signOut.getText();
	}
	public String signInText() {
		return this.getSignIn().getText();
		
	}
	

}