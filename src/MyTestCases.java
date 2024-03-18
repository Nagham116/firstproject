import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;





@Test
public class MyTestCases {
    
	WebDriver driver= new ChromeDriver();
	
	
	@BeforeTest
 
public void mySetup () throws InterruptedException{
    String myURL="https://www.saucedemo.com/";
    driver.get(myURL);
    Thread.sleep(2000);
	driver.manage().window().maximize();
	} 
	public void CheckTheWebsiteTitle() {
   
    driver.get("https://www.google.com/");
    System.out.println( driver.getTitle());
	driver.navigate().back();
    }
    

    public void MyCases()throws InterruptedException {
    	WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement PasswordInputField = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserName.sendKeys("standard_user");
		PasswordInputField.sendKeys("secret_sauce");
		LoginButton.click();
		WebElement firstItemAddtoCartButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

		firstItemAddtoCartButton.click();




}


        @AfterTest
public void AfterTesting() {

}
}

