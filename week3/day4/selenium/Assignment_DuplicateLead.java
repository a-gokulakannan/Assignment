package week3.day4.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_DuplicateLead {
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
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating new a lead with the help of selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gokulakannan.ap@gmail.com");
		
		WebElement stateOfProvince  = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(stateOfProvince);
		state.selectByVisibleText("Florida");
		
		driver.findElement(By.className("smallSubmit")).click();
		//Title of the page
		System.out.println("Title of the Lead: " +driver.getTitle());
		
		//click the Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//clear the company name and change the company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Asteria");
		
		//clear the First name and change the First name
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasitharan");
		
		//Submit the lead
		driver.findElement(By.className("smallSubmit")).click();
		
		//Title of the page
		System.out.println("Title of the Duplicated Lead page: " +driver.getTitle());	
		
	}

}
