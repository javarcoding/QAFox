package SE_42_FC_PropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		
		File propfile=new File("Configurations//EmployeeDetails.properties");
		FileInputStream fis=new FileInputStream(propfile);   //Convert the properties file into FileInputStream
		Properties pro=new Properties();
		pro.load(fis);   //It will load the EmployeeDetails.properties file
		
		System.out.println(pro.getProperty("Name"));  //Arun
		System.out.println(pro.getProperty("Place")); //Hyderabad
		System.out.println(pro.getProperty("Designation")); //Test Lead
		System.out.println(pro.getProperty("Exprience")); //11 Years
		
		WebDriver driver=null;
		
		String browserName=pro.getProperty("Browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browserName.equals("edge")) {
			System.setProperty("webdriver.chrome.driver", "Drivers//msedgedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get(pro.getProperty("url"));
		
		
		
		
		
		
		
	} 
	
}
