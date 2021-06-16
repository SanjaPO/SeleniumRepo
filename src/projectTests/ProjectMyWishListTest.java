package projectTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectMyWishListTest extends ProjectBaseTests {
	
	@BeforeMethod
	public void startTest(){
		mainNavigation.signInMainClick();
		signIn();
		myAccountPage.myWishlistClick();
	}
	    @Test (priority = 0)
		public void addNewWishList() throws InterruptedException {
			myWishPage.enterNameWishList(excelReader.getStringData("WishList", 3, 4));
			myWishPage.saveButtonClick();		
			Thread.sleep(1000);
			String textForAssertion= excelReader.getStringData("WishList", 3, 4);
			String actualText= myWishPage.firstListAddText();
			assertEquals(actualText, textForAssertion);
		}	
		@Test (priority = 5)
		public void removeWishList() throws InterruptedException {
			this.addNewWishList();
			myWishPage.getDeleteWishList();
			Thread.sleep(2000);
			String textForAssertion= excelReader.getStringData("WishList",32 ,3 );
			String actualText=myWishPage.
			assertEquals(actualText, textForAssertion);	
	
		
	}@AfterMethod
	public void theEndTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

}
