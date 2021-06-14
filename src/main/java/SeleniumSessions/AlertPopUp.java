package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/jency/Downloads/chromedriver_win32/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@id=\'login1\']")).sendKeys("jockim");
		
	
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
		if (text.equals("Please enter your password")) {
			System.out.println("corrext popup message displayed");
		}else {
			System.out.println("Incorrect popup message displayed");
		}
		
			
		alert.accept();

	}

}
