package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.altimetrix.TestBase;

import pageActions.SignPage;

public class Homepage extends TestBase {
	SignPage signin;

	@Parameters("sbrowser")
	/*
	 * @BeforeMethod public void inititionbrowser(String sbrowser){
	 * browserLaunch(sbrowser); driver.get(url); signin=new SignPage(driver);
	 * //driver.findElement(By.xpath(
	 * "//*[@id='container']/div/header/div[1]/div/div/div/div[2]/div[1]/a")).
	 * click(); signin.entermail("7989029271"); signin.enterpass("9912029850");
	 * signin.login();
	 * 
	 * }
	 * 
	 * @Test public void homepagelogin(){
	 * 
	 * 
	 * }
	 */

	@BeforeMethod
	public void inititionbrowser(String sbrowser) {
		browserLaunch(sbrowser);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to(url);
	}

	// To log in flipkart
	@Test
	public void login() {
		//driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.cssSelector(".fk-input.login-form-input.user-email")).sendKeys("8008582045");
		driver.findElement(By.cssSelector(".fk-input.login-form-input.user-pwd")).sendKeys("9912029850");
		driver.findElement(By.cssSelector(".submit-btn.login-btn.btn")).click();
	}
}
