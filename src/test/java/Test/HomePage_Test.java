package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseCLass;
import com.pages.homepage;

class HomePage_Test extends BaseCLass {

	homepage hp = null;

	@BeforeTest
	public void setup() {
		initialization();
		hp = new homepage(driver);

	}

	@AfterTest
	public void close() {
		termination();
	}

	@Test
	public void veryfying_login_with_correct_credentials() {
		hp.login_to_app_using_correct_credentials();
		String actual_title = driver.getTitle();
		String expected_title = "OrangeHRM";
		Assert.assertEquals(actual_title, expected_title);

	}

	@Test
	public void veryfying_forgot_pw_link() {
		
		hp.click_on_forgot_pw();
		boolean link_display= driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		Assert.assertEquals(link_display, true);
	}


}