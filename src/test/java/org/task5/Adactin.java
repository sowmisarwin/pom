package org.task5;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseMethods.Base;

public class Adactin extends Base {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		chrome();
		launchUrl("http://www.adactin.com/HotelApp/");
		maxWindow();
		PojoAdactinLogin p1 = new PojoAdactinLogin();
		fill(p1.getTxtUser(), "sowntharya");
		fill(p1.getPassword(), "sss*123");
		btnClick(p1.getLogin());
		impicitWait();

		PojoSearchHotel p2 = new PojoSearchHotel();
		selectByVisibleTextPom(p2.getLocation(), "Sydney");
		selectByVisibleTextPom(p2.getHotel(), "Hotel Sunshine");
		selectByVisibleTextPom(p2.getRoomType(), "Super Deluxe");
		selectByVisibleTextPom(p2.getRoomNo(), "1 - One");
		
		selectByVisibleTextPom(p2.getAdultRoom(), "2 - Two");
		selectByVisibleTextPom(p2.getChildroom(), "1 - One");
		findAndClickPom(p2.getSubmit());
		impicitWait();

		PojoSelectHotel p3 = new PojoSelectHotel();
		findAndClickPom(p3.getRadio());
		findAndClickPom(p3.getClick());
		impicitWait();

		PojoBookHotel p4 = new PojoBookHotel();
		fill(p4.getFirstName(), "Sowmi");
		fill(p4.getLastName(), "sarwin");
		fill(p4.getAddress(), "chennai");
		fill(p4.getCcNum(), "5253518797645675");
		selectByVisibleTextPom(p4.getCcType(), "VISA");
		selectByVisibleTextPom(p4.getExpMonth(), "February");
		selectByVisibleTextPom(p4.getExpYear(), "2021");
		fill(p4.getCvv(), "123");
		findAndClickPom(p4.getBooknw());
		Thread.sleep(3000);
		PojoBooking p5 = new PojoBooking();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(15000);
		String attribute = attribute(p5.getOrderNo());
		System.out.println("order no: " + attribute);

		findAndClickPom(p5.getLogout());


	}

}