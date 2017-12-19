package ru.ruru.education;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lesson3 {

    @Test(alwaysRun = true)
    public void test1() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //вход
        driver.get("https://test02.nsc-tech.ru");
        //поиск
        WebElement search = driver.findElement(By.id("search-text"));
        search.click();
        search.clear();
        search.sendKeys("МТС");
        search.submit();
        //выбор нужного
        driver.findElement(By.cssSelector("a[href*='/init-payment/16']")).click();
        //номер телефона кому
        WebElement phoneTo = driver.findElement(By.id("form_phonenumber"));
        phoneTo.click();
        phoneTo.clear();
        phoneTo.sendKeys("9164665784");
        //мобильный платеж
        driver.findElement(By.id("mobile")).click();;
        WebElement phoneFrom = driver.findElement(By.id("input-user_phonenumber"));
        phoneFrom.click();
        phoneFrom.clear();
        phoneFrom.sendKeys("9035434467");
        WebElement sum = driver.findElement(By.id("form_amount"));
        sum.click();
        sum.clear();
        sum.sendKeys("500");
        driver.findElement(By.id("agree")).click();
        driver.findElement(By.id("payment_submit")).click();
        Thread.sleep(10000);
        String text = driver.findElement(By.cssSelector("#success-overlay-content div.success-overlay-header>h2")).getText();
        assertThat("h1 text is correct displayed",text, equalTo("Оплата успешно проведена."));
       /*
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
*/
        driver.close();
    }

}