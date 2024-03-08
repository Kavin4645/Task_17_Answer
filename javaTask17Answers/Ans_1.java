package javaTask17Answers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
public class Ans_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	 /*  WebDriver driver=new ChromeDriver();//Step1
	   driver.navigate().to("http://www.snapdeal.com");//step2
	   driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).click();//Step3
	   driver.findElement(By.cssSelector(".accountBtn.btn.rippleWhite")).click();
	   Thread.sleep(1000);
	   driver.switchTo().frame(0);
	   driver.findElement(By.id("userName")).sendKeys("7824966305");
	   driver.findElement(By.id("checkUser")).click();
	   Thread.sleep(30);*/
	   
		
		 WebDriver driver=new ChromeDriver();//Step1
		   driver.navigate().to("https://www.demoblaze.com/");//step2
		   driver.findElement(By.id("signin2")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("sign-username")).sendKeys("testmiller07@gmail.com");
		   Thread.sleep(1000);
		   driver.findElement(By.id("sign-password")).sendKeys("Testuser@123");
		   driver.findElement(By.xpath("//div/button[text()='Sign up']")).click();
		   Thread.sleep(1000);
		   
		   //Switching to alert
		   Alert alert =driver.switchTo().alert();
		   String text=alert.getText();
		   System.out.println(text);
		   
		   
		   // Output is (Sign up successful).

	}

}
