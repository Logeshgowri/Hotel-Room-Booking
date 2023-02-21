package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	public WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	private SignInHomePage Login;
	public SignInHomePage getLogin() {
		Login = new SignInHomePage(driver);
		return Login;
	}
	private SearchHotelPage searchHotel;
	public SearchHotelPage getSearchHotel() {
		searchHotel = new SearchHotelPage(driver);
		return searchHotel;
	}
	private BookHotel bookingofHotel;
	public BookHotel getBookingofHotel() {
		bookingofHotel = new BookHotel(driver);
		return bookingofHotel;
	}
	
}
