package week3.day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSorting {
	
	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://erail.in/");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        
        driver.findElement(By.id("chkSelectDateOnly")).click();
        
        driver.findElement(By.id("txtStationFrom")).clear();
        
        driver.findElement(By.id("txtStationFrom")).sendKeys("Egmore");
        
        driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.RETURN);
        
        driver.findElement(By.id("txtStationTo")).clear();
        
        driver.findElement(By.id("txtStationTo")).sendKeys("Madurai Jn");
        
        driver.findElement(By.id("txtStationTo")).sendKeys(Keys.RETURN);
        
        
        
        List<WebElement> findElementsTrain = driver.findElements(By.xpath("//td[@style=';']/a"));
        
        Thread.sleep(300);
        
        System.out.println(findElementsTrain.size());
        
        List<String> trainList=new ArrayList<String>();
        
       // Collections.sort(findElementsTrain);
        
        //Collections.sort(findElementsTrain);
        
      

        for (WebElement webElement : findElementsTrain) {
            String name = webElement.getText();
            
            trainList.add(name);
            
            //System.out.println(name);
        }
        
        
		Collections.sort(trainList);
		
		System.out.println(trainList);
		
		
	}

}
