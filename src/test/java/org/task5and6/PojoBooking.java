package org.task5and6;

import org.baseMethods.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoBooking extends Base{
	public PojoBooking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement pageDown;

	@FindBy(xpath="//input[@id='order_no']")
	private WebElement orderNo;
	
	@FindBy(id="logout")
	private WebElement logout;

	public WebElement getPageDown() {
		return pageDown;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getLogout() {
		return logout;
	}

	
}
