package org.task3;

import org.baseMethods.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends Base {
	public GreensPojo() {
		PageFactory.initElements(driver, this);
	}
	
//1.
	@FindBy(xpath="//a[text()=' Privacy Policy']")
	private WebElement down;
	
	@FindBy(xpath="(//div[@class='box'])[2]")
	private WebElement down1;
	
	@FindBy(xpath="//a[text()='HOME']")
	private WebElement upHome;
	
	@FindBy(id="article-wrapper")
	private WebElement up;

	public WebElement getUp() {
		return up;
	}

	public WebElement getDown() {
		return down;
	}

	public WebElement getDown1() {
		return down1;
	}
	
	public WebElement getUpHome() {
		return upHome;
	}
	
	
	
	
	
	
	
	
	
	
	
}
