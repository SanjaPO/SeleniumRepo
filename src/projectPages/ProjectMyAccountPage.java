package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectMyAccountPage {
	WebDriver driver;
	
	WebElement myAddresses;
	WebElement myPersonallInfo;
	WebElement myWishLists;
	public ProjectMyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
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
	
	public void myAddressesClick() {
		this.getMyAddresses().click();
	}
	
	public void myPersonalInformationClick() {
		this.getMyPersonalInformation().click();
	}
	
	public void myWishlistClick() {
		this.getMyWishlist().click();
	}
	
}
	


