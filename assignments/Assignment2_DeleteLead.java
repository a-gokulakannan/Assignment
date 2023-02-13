package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_DeleteLead {
public static void main(String[] args) {
	//Launch the browser
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
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
	//Click on Phone
	driver.findElement(By.linkText("Phone")).click();
	//Enter phone number
	driver.findElement(By.name("phoneNumber")).sendKeys("6384975448");
	//Click find leads button
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//Click First Resulting lead
	driver.findElement(By.xpath("//a[text()='10527']")).click();
	//Click Delete
	driver.findElement(By.linkText("Delete")).click();
	//Click Find leads
	driver.findElement(By.linkText("Find Leads")).click();
	//Enter captured lead ID
	driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10527");
	//Click find leads button
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	System.out.println(driver.findElement(By.xpath("//div[text()='No records to display']")).getText());
	//Close the browser (Do not log out)
	driver.close();







}
}
