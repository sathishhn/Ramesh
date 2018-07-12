package com.altimetrix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements config{

	public static WebDriver driver;
	
	public void browserLaunch(String sbrowser){
		if(sbrowser.equalsIgnoreCase("firefox")){
			System.setProperty(firefoxbrowser, firefoxpath);
			driver=new FirefoxDriver();
		}else if(sbrowser.equalsIgnoreCase("chrome")){
			System.setProperty(chromebrowser, chromebrowserpath);
			driver=new  ChromeDriver();
		}
	}
}
