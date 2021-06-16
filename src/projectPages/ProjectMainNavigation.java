package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectMainNavigation {
	WebDriver driver;
	WebElement myStore;
	WebElement woomenButton;
	WebElement dressButton;
	WebElement tShirtButton;
	WebElement cart;
	WebElement search;
	WebElement signInMain;

	public ProjectMainNavigation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getData() {
		return driver;
	}

	public WebElement getMyStore() {
		return myStore;
	}

	public WebElement getWoomenButton() {
		return driver.findElement(By.className("sf-with-ul"));
	}

	public WebElement getDressButton() {
		return driver.findElement(By.className("sf-with-ul"));
	}

	public WebElement gettShirtButton() {
		return driver.findElement(By.className("sfHoverForce"));
	}

	public WebElement getCart() {
		return driver.findElement(By.className("shopping_cart"));
	}

	public WebElement getSearch() {
		return driver.findElement(By.id("search_query_top"));
	}

	public WebElement getSignInMain() {
		return driver.findElement(By.className("login"));
	}

	public void signInMainClick() {
		this.getSignInMain().click();
	}

	public void cartButtonClik() {
		this.getCart().click();
	}

}
