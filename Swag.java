package Booking;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Swag {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();

		wd.get("https://www.saucedemo.com/");   //  URL
		Thread.sleep(1000);
		
		// LOGIN 

		WebElement user = wd.findElement(By.id("user-name"));
		user.sendKeys("performance_glitch_user");
		Thread.sleep(1000);

		WebElement pass = wd.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");

		TakesScreenshot ts2 = (TakesScreenshot) wd; // narrowing
		File src2 = ts2.getScreenshotAs(OutputType.FILE); // Output Type
		File destination2 = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\TestingScreenshot1.png"); // (store location)
		FileHandler.copy(src2, destination2);
		Thread.sleep(1000);

		WebElement login = wd.findElement(By.id("login-button"));
		login.click();
		Thread.sleep(2000);

		TakesScreenshot ts1 = (TakesScreenshot) wd; // narrowing
		File src1 = ts1.getScreenshotAs(OutputType.FILE); // Output Type
		File destination1 = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\TestingScreenshot2.png"); // (store location)
		FileHandler.copy(src1, destination1);
		Thread.sleep(1000);
		
		// PRODUCT SELECT

		WebElement dress = wd.findElement(By.xpath("//img[contains(@alt,'Jacket')]"));
		dress.click();
		Thread.sleep(3000);

		WebElement add = wd.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		add.click();
		Thread.sleep(4000);

		WebElement cart = wd.findElement(By.className("shopping_cart_link"));
		cart.click();
		Thread.sleep(3000);
		
         //CHECKOUT
      		
		WebElement check = wd.findElement(By.id("checkout"));
		check.click();
		Thread.sleep(3000);

		WebElement name = wd.findElement(By.id("first-name"));
		name.sendKeys("Kaamesh");
		Thread.sleep(1000);

		WebElement lastname = wd.findElement(By.id("last-name"));
		lastname.sendKeys("H");
		Thread.sleep(1000);

		WebElement code = wd.findElement(By.id("postal-code"));
		code.sendKeys("603406");
		Thread.sleep(5000);

		TakesScreenshot ts4 = (TakesScreenshot) wd; // narrowing
		File src4 = ts4.getScreenshotAs(OutputType.FILE); // Output Type
		File destination4 = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\TestingScreenshot4.png"); // (store location)
		FileHandler.copy(src4, destination4);
		Thread.sleep(2000);
		

		WebElement continue1 = wd.findElement(By.id("continue"));
		continue1.click();
		Thread.sleep(4000);
		
//		JavascriptExecutor js1 = (JavascriptExecutor) wd;
//		js1.executeScript("window.scroll(3000,0)");
//		Thread.sleep(3000);


		WebElement finish = wd.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) wd; // narrowing
		File src = ts.getScreenshotAs(OutputType.FILE); // Output Type
		File destination = new File("C:\\Users\\kishv\\OneDrive\\Desktop\\TestingScreenshot5.png"); // (store location)
		FileHandler.copy(src, destination);
		// FileHandler.copy(src, destination); // ( Selenium Handle without Jars)

	}
}
