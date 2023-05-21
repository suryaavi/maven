package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver dbdriver;
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.dbdriver = driver;
	}

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']")
	WebElement Links;
	

	public void click_on_all_Links() {
		List<WebElement> link = Links.findElements(By.tagName("a"));
	System.out.println(link.size());

	for (int i = 0; i < link.size(); i++) {
		link.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);

	}

		}
	}


