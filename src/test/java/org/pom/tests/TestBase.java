package org.pom.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void init(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize(); //разворот на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //ожидание загрузки всех элементов
    }

    @AfterMethod(enabled = false) //временно отключаем метод
    public void tearDown(){
        driver.quit();
    }
}
