package projectTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectMyPersonallInfo extends ProjectBaseTests {
	@BeforeMethod
	public void startTest() {
		mainNavigation.signInMainClick();
		signIn();
		myAccountPage.myPersonalInformationClick();
	}

	@Test(priority = 5)
	public void updatePersonallInfo() {
		myPersonallInfo.insertData(myPersonallInfo.getFirstName(), excelReader.getStringData("MyPersonalInfo", 8, 3));
		myPersonallInfo.insertData(myPersonallInfo.getLastName(), excelReader.getStringData("MyPersonalInfo", 9, 3));
		myPersonallInfo.insertData(myPersonallInfo.getEmail(), excelReader.getStringData("MyPersonalInfo", 10, 3));
		myPersonallInfo.insertData(myPersonallInfo.getCurrentPassword(),
				excelReader.getStringData("MyPersonalInfo", 11, 3));
		myPersonallInfo.insertData(myPersonallInfo.getNewPassword(),
				excelReader.getStringData("MyPersonalInfo", 12, 3));
		myPersonallInfo.insertData(myPersonallInfo.getCurrentPassword(),
				excelReader.getStringData("MyPersonalInfo", 13, 3));

		myPersonallInfo.saveButtonClick();

		assertEquals(myPersonallInfo.assertText(), excelReader.getStringData("PersonalInformation", 7, 4));

	}

	@AfterMethod
	public void theEndTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

}
