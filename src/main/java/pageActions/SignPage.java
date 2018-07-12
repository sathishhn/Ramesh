package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.repository.signInRepos;

public class SignPage implements signInRepos{
	WebDriver driver;
 public SignPage(WebDriver driver){
	 this.driver=driver;
 }
 public String entermail(String emailid){
	driver.findElement(By.xpath(("//*[@id='container']/div/header/div[1]/div/div/div/div[2]/div[1]/a"))).click();
	 driver.findElement((phone)).sendKeys(emailid);
	return emailid;
 }
 public String enterpass(String pass){
	 driver.findElement((passwordnumber)).sendKeys(pass);;
	return pass;
 }
 public void login(){
	 driver.findElement((login)).click();
	 }
}
