package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utilities.Propertiesutilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCLass {

	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger("BaseClass");

	public static void initialization() {

		String browser = null;
		log.info("browser is opening");
		browser = Propertiesutilities.set_Properties("browser");

		if (browser.equals("chrome")) {
			log.info("chrome browser is opening");
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		log.info("window is maximizing");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		log.info("url is opening");
		driver.get(Propertiesutilities.set_Properties("url"));

	}


	public void termination() {
		driver.close();

	}

	public String snapshow(String name) {
		log.info("taking screenshot");
		TakesScreenshot tsc =(TakesScreenshot)driver;
		File source = tsc.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screeshots/" + name + ".jpg";
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;

	}

}