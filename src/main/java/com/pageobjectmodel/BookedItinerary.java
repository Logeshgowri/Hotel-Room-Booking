package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
	public WebDriver driver;
	public BookedItinerary(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private static WebElement bookItinerary;

	public WebElement getBookItinerary() {
		return bookItinerary;
	}

}
