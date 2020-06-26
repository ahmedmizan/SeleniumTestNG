package testngSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstClass {

    @Test
    public void invalidLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\workspace\\SeleniumProject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//        driver.navigate().to("http://leaftaps.com/opentaps"); // we also can use navigate().to() instead of .get()
//        driver.get("http://leaftaps.com/opentaps");
//        driver.navigate().refresh();
//     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//     driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//     driver.findElement(By.className("decorativeSubmit")).click();
//        driver.findElement(By.id("email")).sendKeys("ahmedmmi@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("42342873484");
//        driver.findElement(By.id("u_0_b")).click();
//        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manha");
//        Thread.sleep(2000);
//        String errorMsg = driver.findElement(By.partialLinkText("an account.")).getText();
////        String errorMsg = driver.findElement(By.linkText("Sign up for an account.")).getText();
//        System.out.println("Error msg" + errorMsg);
//        String expectedErrorMsg = "Sign up for an account.";
//        Assert.assertEquals(errorMsg,expectedErrorMsg);

        driver.findElement(By.name("firstname")).sendKeys("Manha");
        driver.findElement(By.name("lastname")).sendKeys("Ahmed");
        driver.findElement(By.name("reg_email__")).sendKeys("91758221482");
        driver.findElement(By.name("websubmit")).click();
//        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manha");
//        Thread.sleep(2000);
//        driver.quit();
    }


}
