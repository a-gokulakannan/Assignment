package week4.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Gokula");
		driver.findElement(By.name("lastname")).sendKeys("Kannan");
		driver.findElement(By.name("reg_email__")).sendKeys("6384975448");
		driver.findElement(By.id("password_step_input")).sendKeys("testleaf123");
		
		WebElement date = driver.findElement(By.id("day"));
		Select day=new Select(date);
		day.selectByValue("23");
		
		WebElement mon = driver.findElement(By.id("month"));
		Select month=new Select(mon);
		month.selectByValue("8");
		
		WebElement yr = driver.findElement(By.id("year"));
		Select year=new Select(yr);
		year.selectByValue("2000");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.close();
	}

}
