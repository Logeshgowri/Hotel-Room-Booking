package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;

	public static void url(String a) {
		driver.get(a);
	}

	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
	}

	public static void navigate(String a) {
		driver.navigate().to(a);

	}
	public static void contextclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}
	public static void robot(String a) throws AWTException {
		if (a.equalsIgnoreCase("tab")) {
			Robot ab = new Robot();
			ab.keyPress(KeyEvent.VK_DOWN);
			ab.keyPress(KeyEvent.VK_ENTER);
		}else if (a.equalsIgnoreCase("window")) {
			Robot ab = new Robot();
			ab.keyPress(KeyEvent.VK_DOWN);
			ab.keyPress(KeyEvent.VK_DOWN);
			ab.keyPress(KeyEvent.VK_ENTER);
		}
	}
	public void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\screenshot\\"+name+".png");
		FileUtils.copyFile(source, destination);
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void navigateBFR(String a) {
		if (a.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}else if (a.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}else if (a.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}
	public static void alert(String a) {
		if (a.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}else if (a.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	public static void selectbyvalue(WebElement element, String value) {
		Select a = new Select(element);
		a.selectByValue(value);
	}
	public static void selectbyVisibleText(WebElement element, String text) {
		Select a = new Select(element);
		a.selectByVisibleText(text);
	}
	public static void selectbyIndex(WebElement element, int abc) {
		Select a = new Select(element);
		a.selectByIndex(abc);
	}
	public static void windowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void frame(int val) {
		driver.switchTo().frame(val);
	}
	public static void sendkeys(WebElement element, String a) {
		element.sendKeys(a);

	}
}
