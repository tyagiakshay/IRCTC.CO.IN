import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TICKETBOOKING {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		Properties prop = new Properties();
		InputStream is = new FileInputStream("C:/Users/AKSHAY/workspace/IRCTC/src/resources/config.properties");
		prop.load(is);
		System.setProperty(prop.getProperty("setpropertyname"), prop.getProperty("setpropertyvalue"));
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Clicking Login link
		driver.findElement(By.xpath("/html/body/app-root/app-home/app-header/div[2]/div[2]/div[1]/a[1]")).click();
		
		// Entering username and password
		driver.findElement(By.id("userId")).sendKeys("t_akshay");
		driver.findElement(By.id("pwd")).sendKeys("txp160");
		
		//waiting for 10 seconds to enter Captcha
		Thread.sleep(10000);
		
		// Clicking on SignIn button
		driver.findElement(By.xpath("//*[@id='login_header_disable']/div/div[2]/app-login/div[2]/div/div/div[2]/div[2]/form/button")).click();
		Thread.sleep(1500);
		
		// From 
		driver.findElement(By.xpath("//*[@id='origin']/span/input")).sendKeys("AMLAI - AAL");
		//driver.findElement(By.xpath("//*[@id='origin']/span/div/ul/li")).click();
		
		//To
		driver.findElement(By.xpath("")).sendKeys("GHAZIABAD - GZB");
		//driver.findElement(By.xpath("//*[@id='origin']/span/div/ul/li")).click();
		
		//Date
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/input")).sendKeys("02-06-2018");

		//Select Class as AC 3 Tier
		driver.findElement(By.xpath("//*[@id='journeyClass']/div/label")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id='journeyClass']/div/div[4]/div/ul/li[7]/span")).click();
		
		//Search
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[7]/button")).click();
		Thread.sleep(2000);
		
		////Quota set to Tatkal
		//driver.findElement(By.xpath("//*[@id='divMain']/div/app-train-list/div[4]/div/div[2]/div[3]/div[4]/div/div[3]/div/div[2]/p-dropdown/div/label")).click();
		//Thread.sleep(800);
		//driver.findElement(By.xpath("//*[@id='divMain']/div/app-train-list/div[4]/div/div[2]/div[3]/div[4]/div/div[3]/div/div[2]/p-dropdown/div/div[4]/div/ul/li[5]/span")).click();
		
		//check availability
		driver.findElement(By.xpath("//*[@id='check-availability']")).click();
		Thread.sleep(1500);
		
		//Click Book
		//driver.findElement(By.xpath("//*[@id='divMain']/div/app-train-list/div[4]/div/div[2]/div[3]/div[6]/div/div[1]/app-train-avl-enq/div[2]/div[3]/p-panel/div/div[2]/div/div/div/table/tbody/tr/td/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-train-list/div[4]/div/div[2]/div[3]/div[6]/div/div[1]/app-train-avl-enq/div[2]/div[3]/p-panel/div/div[2]/div/div/div/table/tbody/tr/td[2]/div/div[3]/button")).click();
		
		//Passenger 1 Name
		driver.findElement(By.xpath("//*[@id='psgn-name']")).sendKeys("Shyam Singh Tyagi");
		
		//Passenger 1 Age
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[1]/div/div[2]/app-passenger/div/div[1]/div[2]/input")).sendKeys("63");
		
		//Passenger 1 Gender
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[1]/div/div[2]/app-passenger/div/div[1]/div[3]/select")).sendKeys("Male");
		
		//Passenger 1 Preference
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[1]/div/div[2]/app-passenger/div/div[1]/div[3]/select")).sendKeys("Lower");
		
		//Passenger 1 Concession
		driver.findElement(By.xpath("//*[@id='srctzn-option']")).sendKeys("Avail Concession");
		
		//Add passenger
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[2]/a/span")).click();
		
				//Passenger 2 Name
				driver.findElement(By.xpath("//*[@id='psgn-name']")).sendKeys("Mamta Tyagi");
				
				//Passenger 2 Age
				driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[2]/div/div[2]/app-passenger/div/div[1]/div[2]/input")).sendKeys("59");
				
				//Passenger 2 Gender
				driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[2]/div/div[2]/app-passenger/div/div[1]/div[3]/select")).sendKeys("Female");
				
				//Passenger 2 Preference
				driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[2]/div/div[2]/app-passenger/div/div[1]/div[4]/select")).sendKeys("Lower");
				
				//Passenger 2 Concession
				driver.findElement(By.xpath("//*[@id='srctzn-option']")).sendKeys("Avail Concession");
				
		//Auto Upgradation
		driver.findElement(By.xpath("//*[@id='divMain']/div/app-passenger-input/div[6]/form/div/div[1]/div[3]/div[6]/div/div/label")).click();
		
		//Mobile Number
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys("9399401735");
		
				
	}

}
