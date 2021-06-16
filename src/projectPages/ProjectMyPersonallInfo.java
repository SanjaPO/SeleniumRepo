package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import projectTests.ProjectBaseTests;

public class ProjectMyPersonallInfo extends ProjectBaseTests{
	WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement email;
	WebElement currentPassword;
	WebElement newPassword;
	WebElement saveButton;
	WebElement assertText;

	public ProjectMyPersonallInfo(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("lastname"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getCurrentPassword() {
		return driver.findElement(By.id("old_passwd"));
	}

	public WebElement getNewPassword() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitIdentity"));
	}

	public WebElement getAssertText() {
		return driver.findElement(By.className("box"));
	}

	public void saveButtonClick() {
		this.getSaveButton().click();
	}
	public void enterFirstName(String firstName) {
		this.getFirstName().clear();
		this.getFirstName().sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		this.getLastName().clear();
		this.getLastName().sendKeys(lastName);
	}
	public void enterEmailAddress(String email) {
		this.getEmail().clear();
		this.getEmail().sendKeys(email);
	}
	public void enterCurrentPasseord(String currentPassword) {
		this.getCurrentPassword().clear();
		this.getCurrentPassword().sendKeys(currentPassword);
		}
	public void enterNewPassword(String newPassword) {
		this.getNewPassword().clear();
		this.getNewPassword().sendKeys(newPassword);
	}
	public String assertText() {
		return this.getAssertText().getText();
		
	}

	}
	
