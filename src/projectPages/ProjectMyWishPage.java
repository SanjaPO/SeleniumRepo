package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectMyWishPage {
	WebDriver driver;
	WebElement nameNewWishList;
	WebElement saveButton;
	WebElement firstListAdd;
	WebElement deleteWishlist;

	public ProjectMyWishPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNameNewWishList() {
		return driver.findElement(By.id("name"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitWishlist"));
	}

	public WebElement getfirstListAdd() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35256\"]/td[1]"));
	}

	public WebElement getDeleteWishList() {
		return driver.findElement(By.className("icon-remove"));
	}
	public void enterNameWishList(String nameNewWishList) {
		this.getNameNewWishList().sendKeys(nameNewWishList);
		
	}
	public void saveButtonClick() {
		this.getSaveButton().click();
		
	}
	public String firstListAddText() {
		return this.getfirstListAdd().getText();
		
	}
	public void deliteWishList() {
		this.getDeleteWishList().click();
	}

}
