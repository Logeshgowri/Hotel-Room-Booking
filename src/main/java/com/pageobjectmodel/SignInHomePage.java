package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInHomePage {
	
public WebDriver driver;

public SignInHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getUsername() {
	return Username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
@FindBy(id="username")
private static WebElement Username;
@FindBy(id="password")
private static WebElement password;
@FindBy(id="login")
private static WebElement login;
}
