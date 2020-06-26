package testngSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondClass {

    //Absolute xpath --> Too long, starts from root, can break anytime, starts with /
    //Relative xpath --> Not that long, can start from anywhere of DOM, less possibility to break, starts with //
    // xpath --> //tagName[@attribute='value']
//            --> //tagName[text()='value']


    @Test
    public void xpathLesson() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\workspace\\SeleniumProject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[1]/table[1]/tbody[1]//input[1]")).sendKeys("daskdj@gmail.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("weqewq");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();
//        driver.findElement(By.xpath("//input[@type='submit' or @value='Log In']")).click();
        driver.findElement(By.xpath("//input[@type='submit' and @value='Log In']")).click();
        Thread.sleep(3000);
//        String actualErrorMsg = driver.findElement(By.xpath("//div[text()='The email you’ve entered doesn’t match any account. ']")).getText();
        String actualErrorMsg = driver.findElement(By.xpath("//div[text()='The password you’ve entered is incorrect. ' or text()='The email you’ve entered doesn’t match any account. ']")).getText();
        String expectedErrorMsg = "The email you’ve entered doesn’t match any account. ";
        String expectedErrorMsg2 = "The password you’ve entered is incorrect. Forgot Password?";

        if(actualErrorMsg.equalsIgnoreCase(expectedErrorMsg)){
            Assert.assertEquals(actualErrorMsg,expectedErrorMsg);
        }else
        Assert.assertEquals(actualErrorMsg,expectedErrorMsg2);


//        driver.quit();
    }



}
