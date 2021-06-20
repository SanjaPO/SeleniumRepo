package projectTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectMyAddressTests extends ProjectBaseTests{
	@BeforeMethod
	public void startTest(){
		mainNavigation.signInMainClick();
		signIn();
		myAccountPage.myAddressesClick();
	}
	@Test(priority=0)
	public void addAddress() throws InterruptedException {
		myAddressesPage.addNewAddressButtonClick();
		String address=excelReader.getStringData("MyAddress", 8, 2);
		
		
	}
	

}
