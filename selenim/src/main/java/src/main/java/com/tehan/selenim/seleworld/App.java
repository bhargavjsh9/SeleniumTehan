package src.main.java.com.tehan.selenim.seleworld;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {

	public static void main(String[] args) 
	{
	System.out.println("Hello World");
	
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\tehan\\Downloads\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriver selenium = new FirefoxDriver();
	selenium.get("https://www.google.co.uk");
	
	System.out.println(selenium.getCurrentUrl());
	

	}

}