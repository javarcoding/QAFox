package SE_45_FC_Log4j_API;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger("devpinoyLogger");
		
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver.exe");
		//System.out.println("Script execution started");
		log.info("Script execution started");
		
		WebDriver driver=new ChromeDriver();
		//System.out.println("Chrome browser got opened ");
		log.info("Chrome browser got opened ");
		
		driver.manage().window().maximize();
		//System.out.println("Chrome browser got maximized ");
		log.info("Chrome browser got maximized ");
		
		driver.get("http://www.omayo.blogspot.com");
		//System.out.println("Omayo application URL got opened in the Chrome browser");
		log.info("Omayo application URL got opened in the Chrome browser");
		
		driver.findElement(By.linkText("compendiumdev")).click();
		//System.out.println("Compendiumdev link got clicked and the User got navigated to its page ");
		log.info("Compendiumdev link got clicked and the User got navigated to its page ");
		
		driver.navigate().back();
		//System.out.println("Navigated back to Omayo application ");
		log.info("Navigated back to Omayo application ");
		
		driver.navigate().forward();
		//System.out.println("Navigated forward to compendiumdev ");
		log.info("Navigated forward to compendiumdev ");
		
		driver.navigate().refresh();
		System.out.println("COmpendium dev page got refresh in the browser ");
		log.info("COmpendium dev page got refresh in the browser ");
		
		driver.close();
		System.out.println("Browser got closed ");
		log.debug("Browser got closed ");
	}
}
