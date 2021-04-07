package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.tagName("a")).click();
		driver.findElement(By.xpath("//*[@href='reservation.php']")).click();
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).click();
		driver.findElement(By.xpath("//*[@value='oneway']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
