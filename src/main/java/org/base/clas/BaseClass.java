package org.base.clas;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver d;
	public static WebDriver launchBrowser(String r) {
		if (r=="chrome") {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
		}
		
		else if (r=="edgedriver") {
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver(); 
		}
		
		else if (r=="firefox") {
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
		}
		
		else {
			System.out.println("invalid");
		}
		return d;

	}
	
	public static void urlLaunch(String url) {
		d.get(url);
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static String getCurrentUrl() {
		String c = d.getCurrentUrl();
		return c;
	}
	
	

	public static void dragAndDrop(WebElement src, WebElement tar) {
		Actions a = new Actions(d);
		a.dragAndDrop(src, tar).perform();

	}
	
	public static void doubleClick(WebElement tar) {
		Actions a = new Actions(d);
		a.doubleClick(tar).perform();
	}
	
	public static void click(WebElement t) {
		Actions a = new Actions(d);
		a.click(t).perform();
		
	
	}
	
	public static void contentClick(WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).perform();
	}
	
	public static void clickAndHold(WebElement n, WebElement e) {
		Actions a = new Actions(d);
		a.clickAndHold(n).moveToElement(e).build().perform();
	}
	
	public static void release() {
		Actions a = new Actions(d);
		a.release();
	
	}
	
	public static void select(WebElement s1, String u, int in, String value, String txt) {
		Select s = new Select(s1);
		if (u=="index") {
			s.selectByIndex(in);
		}
		
		else if (u=="value") {
			s.selectByValue(value);
		}
		
		else {
			s.selectByVisibleText(txt);
		}
		
	}
	
	public static void deselectAll(WebElement s1) {
		Select s = new Select(s1);
		s.deselectAll();
	}
	
	public static WebElement findelement(String y,String yu) {
		WebElement f=null;
		if (y=="id") {
			f = d.findElement(By.id(yu));	
		}
		
		else if (y=="name") {
			f=d.findElement(By.name(yu));
		}
		
		else {
			f=d.findElement(By.xpath(yu));
		}
		return f;
	}
	
	public static void sendkeys(WebElement g, String st) {
		g.sendKeys(st);
	}
	
	public static void takeScreenShot(String Filename) throws IOException {
	TakesScreenshot tk = (TakesScreenshot) d;
	File f = tk.getScreenshotAs(OutputType.FILE);
	File f1 = new File(Filename);
	FileUtils.copyFile(f, f1);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
