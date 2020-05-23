/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * 
 * @author Krishna Rungta
 *        Test Script 01
 *        ************** 
 *        Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
 */

public class TestScript01 {

    

    public static void main(String[] args) throws Exception {	  
	
    	//Setup Firefox driver    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akhil.mereddy\\Downloads\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
    	String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);

		String title = driver.getTitle(); 
		int titleLength = driver.getTitle().length(); 
		System.out.println("Title of the page is : " + title); 

	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr261979");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("dAmAqev");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();

	    driver.close();

	    }
	

    }

