package org.pom.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage { //класс, который отвечает за все страницы

    WebDriver driver;

    public BasePage(WebDriver driver) { //сгенерированный конструктор
        this.driver = driver; //передали драйвер
        PageFactory.initElements(driver,this);//строятся вс е страницы проекта
    }

    public void click(WebElement element){//универсальный метод нажатия на кнопку с обращением к веб элементу
        element.click();
    }
    public void type(WebElement element, String text){//универсальный метод ввода текста в поле
        if (text !=null){
            click(element);
            element.clear();
            element.sendKeys(text);
        }
    }
     public void clickWithJSExecutor(WebElement element,int x, int y){

         JavascriptExecutor js = (JavascriptExecutor) driver;//универсальный метод, который убирает если есть реклама или другое
         js.executeScript("window.scrollBy(" + x + "," + y +")");
         element.click();
     }

     public void typeWithJSExecutor(WebElement element, String text, int x, int y) {
        if (text !=null){
            clickWithJSExecutor(element,x,y);
            element.clear();
            element.sendKeys(text);
        }
     }
    public boolean shouldHaveText(WebElement element, String text, int time) {
        return new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.textToBePresentInElement(element,text));
    }
}
