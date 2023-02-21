package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	public WebDriver driver;
	
	public SearchHotelPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private static WebElement location;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public  WebElement getNo_of_rooms() {
		return No_of_rooms;
	}
	public  WebElement getCheckIn() {
		return checkIn;
	}
	public  WebElement getCheckOut() {
		return checkOut;
	}
	public  WebElement getAdults() {
		return Adults;
	}
	public  WebElement getChild() {
		return child;
	}
	public  WebElement getSubmit() {
		return submit;
	}
	public  WebElement getReset() {
		return reset;
	}
	@FindBy(id="hotels")
	private static WebElement hotel;
	@FindBy(id="room_type")
	private static WebElement roomtype;
	@FindBy(id="room_nos")
	private static WebElement No_of_rooms;
	@FindBy(id="datepick_in")
	private static WebElement checkIn;
	@FindBy(id="datepick_out")
	private static WebElement checkOut;
	@FindBy(id="adult_room")
	private static WebElement Adults;
	@FindBy(id="child_room")
	private static WebElement child;
	@FindBy(id="Submit")
	private static WebElement submit;
	@FindBy(id="Reset")
	private static WebElement reset;
}
