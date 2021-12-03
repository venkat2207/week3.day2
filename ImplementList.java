package week3.day2.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplementList {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://www.ajio.com/");	
		
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		
		String itemsFound = driver.findElement(By.className("length")).getText();
		
		System.out.println(itemsFound);
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='name']"));
		
		System.out.println(findElements.size());

        for (WebElement webElement : findElements) {
            String name = webElement.getText();
            System.out.println(name);
        }
		
		
		
	
	}

}
