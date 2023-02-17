package week4.day5.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement my = driver.findElement(By.id("REGISTERED_BY"));
		Select mySelf=new Select(my);
		mySelf.selectByValue("1");
		
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Gokulakannan");
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		
		WebElement date = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select day=new Select(date);
		day.selectByValue("23");
		
		WebElement mon = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
		Select month=new Select(mon);
		month.selectByValue("8");
		
		WebElement yr = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
		Select year=new Select(yr);
		year.selectByValue("2000");
		
		WebElement rel = driver.findElement(By.xpath("//select[@id='RELIGION']"));
		Select religion=new Select(rel);
		religion.selectByValue("1");
		
		WebElement language = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
		Select motherTougue=new Select(language);
		motherTougue.selectByValue("48");
		
		
		WebElement place = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
		Select country=new Select(place);
		country.selectByVisibleText("India");
		
		WebElement count = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
		Select code=new Select(count);
		code.selectByValue("98");
		
		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("6484975448");
		driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("a.gokulakannan23@gmail.com");
	}

}
