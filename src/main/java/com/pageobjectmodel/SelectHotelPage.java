package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {
	public WebDriver driver;
	public SelectHotelPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private static WebElement select;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getNext() {
		return next;
	}
	@FindBy(id="continue")
	private WebElement next;

}
