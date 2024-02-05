package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fram {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		driver.switchTo().frame(driver.findElement(By.id("frame3")));
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		WebElement anima=driver.findElement(By.id("animals"));
		Select sel=new Select(anima);
		sel.selectByVisibleText("Baby Cat");

	}

}
