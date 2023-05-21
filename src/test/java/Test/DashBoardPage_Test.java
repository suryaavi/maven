package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseCLass;
import com.pages.DashBoardPage;
import com.pages.homepage;

public class DashBoardPage_Test extends BaseCLass {

	homepage hp = null;
	DashBoardPage db = null;

	@BeforeTest
	public void settup() {
		initialization();
		hp = new homepage(driver);
		db = new DashBoardPage(driver);
		hp.login_to_app_using_correct_credentials();
	}

	@AfterTest
	public void tearDown() {
		termination();
	}

	@Test
	public void veryfying_all_the_links() {
		db.click_on_all_Links();

	}

}
