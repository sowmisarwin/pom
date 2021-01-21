package org.task1;

import java.io.IOException;

import org.baseMethods.Base;

public class Execute extends Base {
public static void main(String[] args) throws IOException {
	chrome();
	launchUrl("https://www.facebook.com/");
	maxWindow();
	LoginPojo l=new LoginPojo();
	fill(l.getTxtEmail(), readExcel("fb", "details", 1, 0));
	fill(l.getTxtPass(), readExcel("fb", "details", 1, 1));
	btnClick(l.getBtnLogin());
	
}
}
