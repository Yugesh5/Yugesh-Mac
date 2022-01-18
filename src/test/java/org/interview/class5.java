package org.interview;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class5 {
	public static void main(String[] args) throws IOException {
//		swapping
		
//		int a=10;
//		int b=20;
//		int temp = 0;
////		
////		temp=b;
////		b=a;
////		a=temp;
////		
////		System.out.println(b);
////		System.out.println(a);
//		
////		swapping without dulipcates
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println(a);
//		System.out.println(b);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		links
		List<WebElement> li = d.findElements(By.tagName("a"));
		for (int i = 0; i < li.size(); i++) {
			WebElement ii = li.get(i);
			String src = ii.getAttribute("href");
//			System.out.println(src);
			URL url = new URL(src);
			URLConnection up = url.openConnection();
			HttpURLConnection he = (HttpURLConnection) up;
			int in = he.getResponseCode();
			if (in!=200) {
				System.out.println(in);	
			}
		}
		
		List<WebElement> img = d.findElements(By.tagName("img"));
		
		for (int i = 0; i < img.size(); i++) {
			WebElement we = img.get(i);
			
			String src = we.getAttribute("src");
			URL u = new URL(src);
			URLConnection ut = u.openConnection();
			HttpURLConnection ht = (HttpURLConnection) ut;
			int get = ht.getResponseCode();
//			System.out.println(src);
//			System.out.println("done");
			
			if (get==200) {
				System.out.println(get);
			}
		}
		
		
		
		
	}
}
