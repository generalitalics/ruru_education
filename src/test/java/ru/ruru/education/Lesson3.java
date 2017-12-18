package ru.ruru.education;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lesson3 {

    private WebDriver driver;
//    private chromeOptions chromeOptions;

    @BeforeClass()
    public void before() {
        driver = new ChromeDriver();
        //chromeOptions = new ChromeOptions();
    }
    @Test()
    public void test1() throws Exception {
       //System.setProperty("webdriver.chrome.driver","F:/drivers/chromedriver.exe");


       //chromeOptions.addArguments("start-maximized");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       //driver.manage().window().maximize();

       driver.get("https://test02.nsc-tech.ru");
       WebElement search = driver.findElement(By.id("search-text"));
       search.click();
       search.clear();
       search.sendKeys("МТС");
       search.submit();
       Thread.sleep(10000);


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
    @AfterClass()
    public void after(){
        driver.quit();
    }
}