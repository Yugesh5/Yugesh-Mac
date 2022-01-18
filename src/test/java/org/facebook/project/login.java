package org.facebook.project;

import org.base.clas.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.poi.clas.pageobjmodel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BaseClass{
	public static void main(String[] args) {
		launchBrowser("chrome");
		urlLaunch("https://www.facebook.com/");
		pageobjmodel p = new pageobjmodel();
		sendkeys(p.getUser(), "yugesh");
		sendkeys(p.getPass(), "8393");
		click(p.getLo());
		d.quit();

		
	}
}
