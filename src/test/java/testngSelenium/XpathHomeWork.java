package testngSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class XpathHomeWork {
    // xpath --> //tagName[@attribute='value']
//            --> //tagName[text()='value']
    // xpath --> //tagName[@attribute='value'] use of and/or
//            --> //tagName[text()='value']
    //        --> //tagName[starts-with(@attribute, 'value')]
    //        --> //tagName[contains(text(), 'value')]
    //        --> //tagName[contains(@attribute, 'value')]
//              --> (//tagName[@attribute='value']//preceding/following::tagName)[indexno]

    @Test
    public void xpathPractice() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\workspace\\SeleniumProject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[starts-with(@name,'firstname')]")).sendKeys("Abdul");
        driver.findElement(By.xpath("(//input[starts-with(@name,'firstname')]//following::input)[1]")).sendKeys("Rahim");
        driver.findElement(By.xpath("//input[contains(@name,'reg_')][1]")).sendKeys("313258568");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("0123456");

        WebElement element = driver.findElement(By.xpath("//select[@id='month']"));
        Select dropDownMonth = new Select(element);
        dropDownMonth.selectByVisibleText("Mar");

        WebElement dateElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select dropDownDay = new Select(dateElement);
        dropDownDay.selectByVisibleText("6");

        WebElement yearElement = driver.findElement(By.xpath("//select[@id='year']"));
        Select dropDownYear = new Select(yearElement);
        dropDownYear.selectByIndex(16);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.id("u_0_12")).click();
        Thread.sleep(3000);
        String errorMsg = driver.findElement(By.xpath("//div[text()='Please enter a valid mobile number or email address.']")).getText();
        String expectedErrorMsg = "Please enter a valid mobile number or email address.";

        Assert.assertEquals(errorMsg,expectedErrorMsg);

    }

}
