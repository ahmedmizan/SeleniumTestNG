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
//    https://www.guru99.com/xpath-selenium.html#11

    @Test
    public void selectFromDropdown(){
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\workspace\\SeleniumProject\\driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        By monthDropDown = By.name("birthday_month");
        By dayDropDown = By.name("birthday_day");
        By yearDropDown = By.xpath("//select[@id='year']");

        WebElement element = driver.findElement(monthDropDown);
        Select select = new Select(element);

      WebElement element1 = driver.findElement(dayDropDown);
      Select select1 = new Select(element1);
      select1.selectByVisibleText("15");
      WebElement element2 = driver.findElement(yearDropDown);
      Select select2 = new Select(element2);
      select2.selectByIndex(8);


        List<WebElement> monthList = new ArrayList<>();
        monthList = select.getOptions();
        select.selectByVisibleText("Jan");

    }


}
