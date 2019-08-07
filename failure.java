package org.testing.pages.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.base.base_midtran;
import org.testing.pages.login_midtran;
import org.testng.annotations.Test;

public class failure extends base_midtran {
	@Test
	public void fail() throws InterruptedException 
	{
	login_midtran l=new login_midtran(driver);
	l.checkout();
	Thread.sleep(4000);
	WebElement no=driver.findElement(By.xpath("//input[@name='cardnumber']"));
	no.sendKeys("4911 1111 1111 1113");
	WebElement date=driver.findElement(By.xpath("//input[@placeholder='MM / YY']"));
	date.sendKeys("02/20");
	WebElement cvv=driver.findElement(By.xpath("//input[@placeholder='123']"));
	cvv.sendKeys("123");
	Thread.sleep(7000);
	WebElement pay=driver.findElement(By.xpath("//a[@class='button-main-content']"));
	pay.click();
	
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	WebElement frame1 = driver.findElement(By.xpath("//div[@class='main-container']//iframe"));
    driver.switchTo().frame(frame1);
	Thread.sleep(7000);
	WebElement otp=driver.findElement(By.xpath("//input[@id='PaRes']"));
	otp.sendKeys("112233");
	Thread.sleep(4000);
	WebElement ok=driver.findElement(By.xpath("//button[@class='btn btn-sm btn-success']"));
	ok.click();
	}}

