package ru.ruru.education;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class Lesson3 {

    @Test
    public void test1() {
       System.setProperty("webdriver.chrome.driver","F:/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.manage().window().maximize();

       driver.get("http://www.yandex.ru/");
       WebElement login = driver.findElement(By.cssSelector("input[name=\"_username\"]"));
       login.clear();
       login.sendKeys("admin");
       WebElement password = driver.findElement(By.cssSelector("input[name=\"_password\"]"));
       password.sendKeys("Superadmin1");
       WebElement submit = driver.findElement(By.cssSelector("form[class=\"pull-right auth-form\"] button"));
       submit.click();
       String text = driver.findElement(By.cssSelector("div.page-header h1")).getText();

       assertThat("h1 text is correct displayed",text, equalTo("Заявки на подключение"));
//        WebElement

    }
}
