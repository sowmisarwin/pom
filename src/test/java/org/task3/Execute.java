package org.task3;

import org.baseMethods.Base;

public class Execute extends Base {
	public static void main(String[] args) throws InterruptedException {
		chrome();
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();
		GreensPojo g=new GreensPojo();

		scrollIntoView(g.getDown());
		btnClick(g.getDown());
		scrollIntoView(g.getDown1());
		Thread.sleep(5000);
		scrollIntoView(g.getUpHome());
		btnClick(g.getUpHome());
		scrollIntoView(g.getUp());
		
		
		
		
		
		
		
		
		
		
		
	}
}
