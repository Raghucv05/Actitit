package Actitime;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		//driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		WebElement upload=driver.findElement(By.xpath("//span[normalize-space()='Add Files']"));
		act.click(upload).perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("./AutoIT/3.exe");

	}

}
