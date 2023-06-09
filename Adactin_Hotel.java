package Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		
		wd.get("https://adactinhotelapp.com/");
		
		WebElement fd = wd.findElement(By.id("username"));
		fd.sendKeys("Kishbose");
	
		WebElement pd = wd.findElement(By.name("password"));
		pd.sendKeys("MMH053");
		Thread.sleep(1000);
		
		WebElement lg = wd.findElement(By.xpath("//input[@id='login']"));  //login
		lg.click();
	
		WebElement ln = wd.findElement(By.xpath("//select[@id='location']")); 
		Select s = new Select(ln);
		s.selectByIndex(1);
		
		WebElement dd1 = wd.findElement(By.name("location"));   //Location
		Select s1 = new Select(dd1);
		s1.selectByVisibleText("London");
		
		WebElement h= wd.findElement(By.id("hotels"));       // Hotel
		Select s2 = new Select(h);
		s2.selectByVisibleText("Hotel Sunshine");
		
		WebElement rt= wd.findElement(By.xpath("//select[@name='room_type']"));   // Hotel_Type
		Select s3 = new Select(rt);
		s3.selectByIndex(3);
		
		WebElement nr= wd.findElement(By.id("room_nos"));  // NO of Room
		Select s4 = new Select(nr);
		s4.selectByIndex(1);
			
		WebElement ci = wd.findElement(By.xpath("//input[@id='datepick_in']"));   // Check in Date
        ci.clear();
        ci.sendKeys("30/09/2022"); 
        WebElement co = wd.findElement(By.xpath("//input[contains(@name,'out')]"));    // check out date
        co.clear();
        co.sendKeys("05/10/2022");
       
        WebElement ap = wd.findElement(By.xpath("//select[contains(@id,'adult_room')]")); // Adult list
        Select s5 = new Select(ap);
        s5.selectByIndex(4);
     
        WebElement cp = wd.findElement(By.name("child_room"));
        Select s6 = new Select(cp);
        s6.selectByVisibleText("1 - One");
       
        WebElement search = wd.findElement(By.className("reg_button"));
        search.click();
       
        WebElement sh = wd.findElement(By.name("radiobutton_0"));
        sh.click();
       
        WebElement c = wd.findElement(By.xpath("//input[@value='Continue']"));
        c.click();
        
        WebElement fn = wd.findElement(By.className("reg_input"));
        fn.sendKeys("Kaamesh");
        
        WebElement l = wd.findElement(By.name("last_name"));
        l.sendKeys("H");
       
        WebElement ba = wd.findElement(By.id("address"));
        ba.sendKeys("No-22 Ramakrishna Nagar, Kanchipuram. ");
        
        WebElement cc = wd.findElement(By.xpath("//input[contains(@maxlength,'16')]"));
        cc.sendKeys("5477 4392 2225 1705");
        
        WebElement cct = wd.findElement(By.id("cc_type"));
        Select s7 = new Select(cct);
        s7.selectByIndex(3);
        
        WebElement em = wd.findElement(By.name("cc_exp_month"));
        Select s8 = new Select(em);
        s8.selectByIndex(11);
        
        WebElement ey = wd.findElement(By.id("cc_exp_year"));
        Select s9 = new Select(ey);
        s9.selectByIndex(10);
        
        WebElement cvv = wd.findElement(By.id("cc_cvv"));
        cvv.sendKeys("437");
        
        WebElement bn = wd.findElement(By.id("book_now"));
        bn.click();	
        
}	
}

