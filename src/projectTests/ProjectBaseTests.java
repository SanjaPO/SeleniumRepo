package projectTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import projectPages.ProjectSignInPage;
import projectPages.ProjectMainNavigation;
import projectPages.ProjectMyAccountPage;
import projectPages.ProjectMyAddressesPage;
import projectPages.ProjectMyPersonallInfo;
import projectPages.ProjectMyWishPage;

public class ProjectBaseTests {
	WebDriver driver;
	ProjectMainNavigation mainNavigation;
	ProjectSignInPage signInPage;
	ProjectMyAccountPage myAccountPage;
	ProjectExcelReader excelReader;
	ProjectMyAddressesPage myAddressesPage;
	ProjectMyPersonallInfo myPersonallInfo;
	ProjectMyWishPage myWishPage;

	@BeforeClass
	public void preSihTestova() throws Exception {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		excelReader = new ProjectExcelReader("data/TestPlan.xlsx");
		mainNavigation = new ProjectMainNavigation(driver);
		signInPage = new ProjectSignInPage(driver);
		myAccountPage = new ProjectMyAccountPage(driver);
		myAddressesPage = new ProjectMyAddressesPage(driver);
		myPersonallInfo = new ProjectMyPersonallInfo(driver);
		myWishPage= new ProjectMyWishPage(driver);

	}

	public void insertData(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public void signIn() {
		String emailaddress = excelReader.getStringData("SignIn&SignIn", 8, 2);
		String password = excelReader.getStringData("SignIn&SignIn", 9, 3);
		signInPage.insertEmailAddress(emailaddress);
		signInPage.insertPassword(password);
		signInPage.signInButtonClick();
	}

	@AfterClass
	public void posleSihTestova() {
		driver.close();
	}

}
