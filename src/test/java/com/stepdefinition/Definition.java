package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pageobjectmodel.BookHotel;
import com.pageobjectmodel.BookedItinerary;
import com.pageobjectmodel.PageObjectManager;
import com.pageobjectmodel.SearchHotelPage;
import com.pageobjectmodel.SelectHotelPage;
//import com.pageobjectmodel.SignInHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition extends BaseClass{
	public static PageObjectManager re = new PageObjectManager(driver);
	
	@Given(":Going to Url")
	public void going_to_url() {
	    url("https://adactinhotelapp.com/");
	}
	@When(":Have to enter username")
	public void have_to_enter_username() {
//	    SignInHomePage a = new SignInHomePage(driver);
//	    sendkeys(a.getUsername(), "logi2211");
		sendkeys(re.getLogin().getUsername(), "logi2211");
	    
	}
	@When(":going to enter password")
	public void going_to_enter_password() {
//		SignInHomePage a = new SignInHomePage(driver);
		sendkeys(re.getLogin().getPassword(), "Logi@11");
	    
	}
	@Then(":after enter confirm, it has to enter to next page")
	public void after_enter_confirm_it_has_to_enter_to_next_page() {
//	    SignInHomePage a = new SignInHomePage(driver);
	    click(re.getLogin().getLogin());
	}
	
	@Given(":search hotel page is lauched")
	public void search_hotel_page_is_lauched() {
		
	}
	@When(":going to choose location")
	public void going_to_choose_location() {
//		SearchHotelPage a = new SearchHotelPage(driver);
		   selectbyvalue(re.getSearchHotel().getLocation(), "London"); 
	}
	@When(":going to select hotel")
	public void going_to_select_hotel() {
//		SearchHotelPage a = new SearchHotelPage(driver);
	    selectbyIndex(re.getSearchHotel().getHotel(), 2);
	}
	@When(":going to room type")
	public void going_to_room_type() {
		//SearchHotelPage a = new SearchHotelPage(driver);
		selectbyVisibleText(re.getSearchHotel().getRoomtype(), "Standard");
	}
	@When(":going to select number of rooms")
	public void going_to_select_number_of_rooms() {
		SearchHotelPage a = new SearchHotelPage(driver);
		selectbyvalue(a.getNo_of_rooms(), "2");
	}
	@When(":choose checkIn date")
	public void choose_check_in_date() {
		SearchHotelPage a = new SearchHotelPage(driver);
		clear(a.getCheckIn());
		sendkeys(a.getCheckIn(), "21/11/2022");
	}
	@When(":choose CheckOut date")
	public void choose_check_out_date() throws InterruptedException {
		SearchHotelPage a = new SearchHotelPage(driver);
		clear(a.getCheckOut());
		sendkeys(a.getCheckOut(), "22/11/2022");
		//Thread.sleep(3000);
	}
	@When(":Going to No of Adults")
	public void going_to_no_of_adults() {
		SearchHotelPage a = new SearchHotelPage(driver);
		selectbyIndex(a.getAdults(), 1);
	}
	@When(":Going to select No of Child")
	public void going_to_select_no_of_child() {
		SearchHotelPage a = new SearchHotelPage(driver);
		selectbyIndex(a.getChild(), 0);
	}
	@Then(":after click search, it has to go to next page")
	public void after_click_search_it_has_to_go_to_next_page() {
		//SearchHotelPage a = new SearchHotelPage(driver);
		click(re.getSearchHotel().getSubmit());
	}
	@Given(":going to the Selecthotel page")
	public void going_to_the_selecthotel_page() {
		
	}
	@When(":going to select booked hotel")
	public void going_to_select_booked_hotel() {
		SelectHotelPage a = new SelectHotelPage(driver);
		click(a.getSelect());
	}
	@Then(": after continue, it have to go to paymentpage")
	public void after_continue_it_have_to_go_to_paymentpage() {
		SelectHotelPage a = new SelectHotelPage(driver);
		click(a.getNext());
	}
	
	@Given(":went to the bookHotel Page")
	public void went_to_the_book_hotel_page() {
	   
	}
	@When(":enter the firstname")
	public void enter_the_firstname() {
		BookHotel a = new BookHotel(driver);
		sendkeys(a.getFirstName(), "Logesh");   
	}
	@When(":enter the lastname")
	public void enter_the_lastname() {
		BookHotel a = new BookHotel(driver);
		sendkeys(a.getLastName(), "R");
	}
	@When(":enter the Billing Address")
	public void enter_the_billing_address() {
		BookHotel a = new BookHotel(driver);
		sendkeys(a.getAddress(), "No 25, 1st cross street, chennai");
	}
	@When(":Enter the Card Number")
	public void enter_the_card_number() {
		BookHotel a = new BookHotel(driver);
		sendkeys(a.getCreditCard(), "1234546735468765");
	}
	@When(":Enter the card Type")
	public void enter_the_card_type() {
		BookHotel a = new BookHotel(driver);
		selectbyvalue(a.getCardType(), "VISA");
	}
	@When(":Enter the card ExpireMonth")
	public void enter_the_card_expire_month() {
		BookHotel a = new BookHotel(driver);
		selectbyvalue(a.getExpireMonth(), "11");
	}
	@When(":Enter the card ExpireYear")
	public void enter_the_card_expire_year() {
		BookHotel a = new BookHotel(driver);
		selectbyvalue(a.getExpireYear(), "2022");
	}
	@When(":Enter the Cvv Number")
	public void enter_the_cvv_number() {
		BookHotel a = new BookHotel(driver);
		sendkeys(a.getCVV(), "233");
	}
	@Then(":click the Booknow Enter to the next page")
	public void click_the_booknow_enter_to_the_next_page() {
		BookHotel a = new BookHotel(driver);
		click(a.getBookNow());
	}
	@Given(":going to select my ltinerary")
	public void going_to_select_my_ltinerary() {
	    
	}
	@When(":click book Itinerary")
	public void click_book_itinerary() {
		
	    BookedItinerary a = new BookedItinerary(driver);
	    click(a.getBookItinerary());
	}
	@Then(":It has to display the booked order details")
	public void it_has_to_display_the_booked_order_details() {
	    
	}

}
