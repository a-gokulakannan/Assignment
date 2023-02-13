package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_DuplicateLead {
	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
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
		//Click on Email
		driver.findElement(By.linkText("Email")).click();
		//Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("gokulakannan.ap@gmail.com");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='10380']")).click();
		//Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//Verify the title as 'Duplicate Lead'
		System.out.println(driver.getTitle());
		//Click Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		
		//Close the browser (Do not log out)
		driver.close();

	}

}
