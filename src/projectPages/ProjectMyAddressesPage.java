package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ProjectMyAddressesPage {

	WebDriver driver;
	WebElement updateButton;
	WebElement deleteButton;
	WebElement addNewAddressButton;
	WebElement address;
	WebElement city;
	WebElement zipCode;
	WebElement homePhone;
	WebElement myAddress;
	WebElement saveButton;
	
	
	
	
	public ProjectMyAddressesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUpdateButton() {
		return driver.findElement(By.xpath("//a[@title='Update']"));
	}
	
	public WebElement getStreet2() {
		return driver.findElement(By.xpath("//h3[text()='STREET 2']"));
	}

	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[2]/ul/li[9]/a[2]"));
	}

	public WebElement getAddNewAddressButton() {
		return driver.findElement(By.xpath("//a[@title='Add an address']"));
	}
	
	public WebElement getAddress() {
		return driver.findElement(By.id("address1"));
	}

	public WebElement getCity() {
		return driver.findElement(By.id("city"));
	}

	public WebElement getState() {
		return driver.findElement(By.id("id_state"));
	}

	public WebElement getZipCode() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getHomePhone() {
		return driver.findElement(By.id("phone"));
	}

	public WebElement getMyAddress() {
		return driver.findElement(By.id("alias"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitAddress"));
	}

	public WebElement getAddressForCompare() {
		return driver.findElement(By.xpath("//span[@class='address_address1']"));
	}

	public void updateButtonClick() {
		this.getUpdateButton().click();
	}
	
	public void deleteButtonClick() {
		this.getDeleteButton().click();
	}
	
	public void addNewAddressButtonClick() {
		this.getAddNewAddressButton().click();
	}
	public void saveButtonClick() {
		this.getSaveButton().click();
	}
	
}
