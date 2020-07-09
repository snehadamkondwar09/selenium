package seleniumPOC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocupaceURLLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.paperout.com/rbc_staging_ui");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test1_rep");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("snehad@2020");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='action-new-toggle']")).click();
		driver.findElement(By.xpath("//*[@id='action-startingPoint']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Brokerage']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Existing Account']")).click();
		System.out.println("After the Brokerage click");
		// driver.findElement(By.xpath("(//*[@class="expand-row ng-scope
		// sorting_1"])[1]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='GOODALL']")).click();
		Thread.sleep(5000);
		//WebElement element=driver.findElement(By.xpath("//*[@class='select2-search']")); //s2id_starting_point_select11401
		WebElement element = driver.findElement(By.xpath("//*[@id='s2id_starting_point_select11401']"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//*[@id='s2id_autogen3_search']"));
		element1.click();
		element1.sendKeys("ind");
		driver.findElement(By.xpath("//*[text()='Individual']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='starting_point_select83201']")).click();
		
		WebElement element2 =driver.findElement(By.xpath("//*[@placeholder='Search...']"));
		Thread.sleep(5000);
		element2.click();
		element2.sendKeys("ACH");
		driver.findElement(By.xpath("//*[text()='ACH']")).click();
		driver.findElement(By.xpath("//*[@ng-click='next()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='select2-chosen']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='No']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Create Work Item']")).click();
		 
		
	}

}
