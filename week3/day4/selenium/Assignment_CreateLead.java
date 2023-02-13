package week3.day4.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokulakannan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugaperumal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating new a lead with help of selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gokulakannan.ap@gmail.com");
		
		WebElement stateOrProvince  = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(stateOrProvince);
		state.selectByVisibleText("Indiana");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//using getTitle
		System.out.println(driver.getTitle());
		
		
		

	}

}
