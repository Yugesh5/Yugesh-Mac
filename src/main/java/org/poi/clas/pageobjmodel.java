package org.poi.clas;

import org.base.clas.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjmodel extends BaseClass {
	public pageobjmodel() {
		PageFactory.initElements(d, this);
	}
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement lo;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLo() {
		return lo;
	}
	
	
	
}
