package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class reg_pom {

	WebDriver dr;
	
 By signup=By.xpath("//a[@id='signin2']");
 By username=By.xpath("//input[@id='sign-username']");
 By password=By.xpath("//input[@id='sign-password']");
 By signup_btn=By.xpath("//body[@class='modal-open']/div[2]/div[1]/div/div[3]/button[2]");
 
 Alert alt=dr.switchTo().alert();
  alt.accept();
 
  By login=By.xpath("//a[@id='login2']");
  By l_usr=By.xpath("//input[@id='loginusername']");
  By l_pwd=By.xpath("//input[@id='loginpassword']");
  By l__btn=By.xpath("//body[@class='modal-open']/div[3]/div[1]/div/div[3]/button[2]");
}