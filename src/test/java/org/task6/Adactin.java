package org.task6;

import java.awt.AWTException;
import java.io.IOException;

import org.baseMethods.Base;

public class Adactin extends Base {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		chrome();
		launchUrl("http://www.adactin.com/HotelApp/");
		maxWindow();
		PojoAdactinLogin p1=new PojoAdactinLogin();
		fill(p1.getTxtUser(),readExcel("adactin", "details", 1, 0));
		fill(p1.getPassword(), readExcel("adactin", "details", 1, 1));
		btnClick(p1.getLogin());
		impicitWait();
		
		PojoSearchHotel p2=new PojoSearchHotel();
		selectByVisibleTextPom(p2.getLocation(),  "Sydney");
		selectByVisibleTextPom(p2.getHotel(), "Hotel Sunshine");
		selectByVisibleTextPom(p2.getRoomType(), "Super Deluxe");
		selectByVisibleTextPom(p2.getRoomNo(), "1 - One");
		selectByVisibleTextPom(p2.getAdultRoom(), "2 - Two");
		selectByVisibleTextPom(p2.getChildroom(), "1 - One");
		findAndClickPom(p2.getSubmit());
		impicitWait();
		
		PojoSelectHotel p3=new PojoSelectHotel();
		findAndClickPom(p3.getRadio());
		findAndClickPom(p3.getClick());
		impicitWait();

		PojoBookHotel p4=new PojoBookHotel();
		fill(p4.getFirstName(), readExcel("adactin", "details", 1, 4));
		fill(p4.getLastName(), readExcel("adactin", "details", 1, 5));
		fill(p4.getAddress(), readExcel("adactin", "details", 1, 6));
		fill(p4.getCcNum(), readExcel("adactin", "details", 1, 7));
		selectByVisibleTextPom(p4.getCcType(), "VISA");
		selectByVisibleTextPom(p4.getExpMonth(), "February");
		selectByVisibleTextPom(p4.getExpYear(), "2021");
		fill(p4.getCvv(), "123");
		findAndClickPom(p4.getBooknw());
		impicitWait();
		
		PojoBookingConfirm pb=new PojoBookingConfirm();
		scrollIntoView(pb.getPageDown());
		impicitWait();
		String attribute = attribute(pb.getOrderNo());
		System.out.println("order no."+attribute);
		
		
//		writeDataInRow("adactin", "details", 0, 10, "order no.");
//		writeDataInRow("adactin", "details", 1, 10, attribute);

	}

}
