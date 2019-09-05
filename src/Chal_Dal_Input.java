import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Chal_Dal_Input {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://chaldal.com/");
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/div/div[1]/div[4]/button")).click();
		/*driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[1]/div/input")).sendKeys("01672945535");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[1]/span[1]")).sendKeys("6260");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[2]/div/div/button")).click();*/
		//SIGN_UP
		/*driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[4]/div[2]/button")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[1]/input")).sendKeys("Nuzat Shorna");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[2]/input")).sendKeys("nuzat.shornaalom@gmail.com");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[3]/input")).sendKeys("1234567");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[4]/div/div/button")).click();*/
		//LOGIN
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/button")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[1]/input")).sendKeys("nuzat.shornaalom@gmail.com");
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[2]/input")).sendKeys("1234567");
		Thread.sleep(6500);
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div/form/div[3]/div/div/button")).click();
		//ORDER PRODUCT
		driver.get("https://chaldal.com/fruits-vegetables");
	    //driver.findElement(By.linkText("Food")).click();
	    //driver.findElement(By.linkText("Fruits & Vegetables")).click();
		//Scroll
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		//FRUIT ADD
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Fresh Fruits")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("html/body/div[2]/div/div[5]/section/div/div/div/section/div[2]/div/div[2]/section")).click();
		//JavascriptExecutor js1= (JavascriptExecutor) driver;
		//js1.executeScript("window.scrollBy(0,850)");
		// mouse hover
		/*Actions hover = new Actions(driver);
		hover.moveToElement(driver.findElement(By.xpath("html/body/div[2]/div/div[5]/section/div/div/div/section/div[2]/div/div[2]/div/div[5]/p"))).perform();
		driver.findElement(By.xpath("html/body/div[2]/div/div[5]/section/div/div/div/section/div[2]/div/div[2]/div/div[5]/span/a[1]/span[1]")).click();*/
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//driver.findElement(By.xpath("html/body/div[2]/div/div[5]/section/div/div/div/section/div[2]/div/div[5]/section")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/div/div[5]/section/div/div/div/section/div[2]/div/div[3]/section")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/div/button[2]")).click();
		

	}

}
