package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectMyAccountPage {
	WebDriver driver;
	
	WebElement myAddresses;
	WebElement myPersonallInfo;
	WebElement myWishLists;
	WebElement signOutButton;
	WebDriverWait wait;
	
	public ProjectMyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}
	public WebElement getMyAddresses() {
		return driver.findElement(By.xpath("//a[@title='Addresses']"));
	}

	public WebElement getMyPersonalInformation() {
		return driver.findElement(By.xpath("//a[@title='Information']"));
	}

	public WebElement getMyWishlist() {
		return driver.findElement(By.xpath("//a[@title='My wishlists']"));
	}
	
	public WebElement getSignOutButton() {
		return driver.findElement(By.className("logout"));
	}
	
	public void myAddressesClick() {
		this.getMyAddresses().click();
	}
	
	public void myPersonalInformationClick() {
		this.getMyPersonalInformation().click();
	}
	
	public void myWishlistClick() {
		this.getMyWishlist().click();
	}
	
	public void waitForSignOutButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("logout")));
	}
	
}
	


