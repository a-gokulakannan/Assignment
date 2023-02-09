package week3.day3.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmrnt {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Asteria aerospace");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokulakannan ");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arumugaperumal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gokulakannan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Arumugaperumal");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Learning Automation");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("300000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("6");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("10020");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("RAC");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating new a lead with help of selenium");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Use selenium 4.8.0");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6384985447");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Dhamu");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("23");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gokulakannan.ap@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.hotstar.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Dhamodharan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Dhamu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("1023,Middle Street,Nagambatti");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("1024,Middle Street,Nagambatti");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Virudhunagar");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("626004");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("238");
		

	}

}
