package GmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.nisum.com/");
		Thread.sleep(10);
		Actions mouseover=new Actions(driver);
		mouseover.moveToElement(driver.findElement(By.xpath("//*[@id='mainNav']/li[1]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='mainNav']/li[1]/ul/li[2]/a")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='mainNav']/li[1]/ul/li[2]/ul/li[2]/a")))
        .click().build().perform();
	}
}

