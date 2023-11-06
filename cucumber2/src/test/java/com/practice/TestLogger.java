package com.practice;
 
import java.time.Duration;
 
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class TestLogger {
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;
	public static void main(String[] args) {
		log= LogManager.getLogger(TestLogger.class);
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("implicitly waiting for 10 seconds");
		driver.get("https://www.google.com/");
		log.info("Logged into google");
		try {
			boolean text = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			log.error("Exception occured",new Exception("Element Not Found"));
		}
		finally {
			driver.quit();
			log.info("quitting the driver");
		}
	}
}
