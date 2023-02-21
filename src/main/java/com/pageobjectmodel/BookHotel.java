package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	public WebDriver driver;
	public BookHotel(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private static WebElement FirstName;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCreditCard() {
		return CreditCard;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getExpireMonth() {
		return ExpireMonth;
	}
	public WebElement getExpireYear() {
		return ExpireYear;
	}
	public WebElement getCVV() {
		return CVV;
	}
	public WebElement getBookNow() {
		return BookNow;
	}
	@FindBy(id="last_name")
	private static WebElement LastName;
	@FindBy(id="address")
	private static WebElement Address;
	@FindBy(id="cc_num")
	private static WebElement CreditCard;
	@FindBy(id="cc_type")
	private static WebElement CardType;
	@FindBy(id="cc_exp_month")
	private static WebElement ExpireMonth;
	@FindBy(id="cc_exp_year")
	private static WebElement ExpireYear;
	@FindBy(id="cc_cvv")
	private static WebElement CVV;
	@FindBy(id="book_now")
	private static WebElement BookNow;
}
