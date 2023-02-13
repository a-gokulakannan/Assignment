package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_EditLead {
public static void main(String[] args) {
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("http://leaftaps.com/opentaps/control/login");
	//Enter the username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	//Enter the password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click Login
	driver.findElement(By.className("decorativeSubmit")).click();
	//Click crm/sfa link
	driver.findElement(By.linkText("CRM/SFA")).click();
	//Click Leads link
	driver.findElement(By.linkText("Leads")).click();
	//Click Find leads
	driver.findElement(By.linkText("Find Leads")).click();
	//Enter first name
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("gokulakannan");
	//Click Find leads button
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//Click on first resulting lead
	driver.findElement(By.xpath("//a[text()='10380']")).click();
	// Verify title of the page
	System.out.println("Page Title is: " +driver.getTitle());
	//Click Edit
	driver.findElement(By.linkText("Edit")).click();
	//Change the company name
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	//Click Update
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	//Confirm the changed name appears
	System.out.println("Changed Company name: " +driver.findElement(By.id("viewLead_companyName_sp")).getText());
	//Close the browser (Do not log out)
	//driver.close();
}
}
