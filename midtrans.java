package seleniumpkg;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class midtrans {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgupta8\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.midtrans.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement buynow=driver.findElement(By.xpath("//a[@class='btn buy']"));
		buynow.click();
		Thread.sleep(4000);
		WebElement brand=driver.findElement(By.xpath("//div[@class='cart-checkout']"));
		brand.click();
		driver.switchTo().frame(0);
		Thread.sleep(7000);
		WebElement con=driver.findElement(By.xpath("//a[@class='button-main-content']"));
		con.click();
		Thread.sleep(4000);
		WebElement credit=driver.findElement(By.xpath("//div[@class='list-title text-actionable-bold']"));
		credit.click();
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
