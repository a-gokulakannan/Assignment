package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_2_Acme {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Launch the browser and load the URL
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		// Enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//Click login button
		driver.findElement(By.xpath("//button[contains(text(),'                           Login')]")).click();
		//Get the title of the page and print
		System.out.println("The Title of the page: " +driver.getTitle());
		//Click on Log Out
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		//Close the browser(use -driver.close())
		driver.close();
		
	}

}
