package org.sample;

import java.io.IOException;

public class TeastCase1 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
	
		BrowserLaunch("edge");
		
		launchUrl("https://www.amazon.in/");
		
		//findElement("id", "twotabsearchtextbox");
		
		screenShot("C:\\Users\\USER\\Desktop\\Prakash\\julybatch\\baseclass.png");
		
		
		
		
	}
	
	
	
	
	
	

}
