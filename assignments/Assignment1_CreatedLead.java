package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_CreatedLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	 // 1. Launch URL 
	 driver.get("http://leaftaps.com/opentaps/control/login");
	 
	 // 2. Enter UserName and Password Using Id Locator
	 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 // 3. Click on Login Button using Class Locator
	 driver.findElement(By.className("decorativeSubmit")).click();
	 // 4. Click on CRM/SFA Link
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 // 5. Click on contacts Button
	 driver.findElement(By.linkText("Contacts")).click();
	 // 6. Click on Create Contact
	  driver.findElement(By.linkText("Create Contact")).click();
	 // 7. Enter FirstName Field Using id Locator
	 driver.findElement(By.id("firstNameField")).sendKeys("Gokulakannan");
	 // 8. Enter LastName Field Using id Locator
	 driver.findElement(By.id("lastNameField")).sendKeys("Arumugaperumal");
	 // 9. Enter FirstName(Local) Field Using id Locator
	 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gokul");
	 // 10. Enter LastName(Local) Field Using id Locator
	 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kannan");
	 // 11. Enter Department Field Using any Locator of Your Choice
	 driver.findElement(By.name("departmentName")).sendKeys("CSE");
	 // 12. Enter Description Field Using any Locator of your choice 
	 driver.findElement(By.id("createContactForm_description")).sendKeys("Create a Contact lead");
	 // 13. Enter your email in the E-mail address Field using the locator of your choice
	 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gokulakannan.ap@gmail.com");
	 // 14. Select State/Province as NewYork Using Visible Text
	 WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	 Select stateOfProvine=new Select(state);
	 stateOfProvine.selectByVisibleText("Florida");
	 // 15. Click on Create Contact
	 driver.findElement(By.className("smallSubmit")).click();
	 // 16. Click on edit button 
	  driver.findElement(By.linkText("Edit")).click();
	 // 17. Clear the Description Field using .clear
	 driver.findElement(By.id("updateContactForm_description")).clear();
	 // 18. Fill ImportantNote Field with Any text
	 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Clear the Description and Fill ImportantNote");
	 // 19. Click on update button using Xpath locator
	 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 // 20. Get the Title of Resulting Page.
	 System.out.println("Title of Resulting Page: " +driver.getTitle());
}
}
