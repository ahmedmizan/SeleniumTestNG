package testngSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DropDownLesson {

    @Test
    public void selectFromDropDown(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\workspace\\SeleniumProject\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        By monthDropdown = By.id("month");

        WebElement element = driver.findElement(monthDropdown);
        Select select = new Select(element);

        List<WebElement> monthList = new ArrayList<>();
        monthList = select.getOptions();
        select.selectByVisibleText("Aug");
    }

}
