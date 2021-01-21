package org.task1;

import org.baseMethods.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Base {
//public constructor
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	
//find the webelements
	
	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	
//generate getters
	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
