package org.pom.pages.widgets;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.BasePage;

public class AutoCompletePage extends BasePage {

    public AutoCompletePage(WebDriver driver) {
        super(driver);
    }


    @FindBy (id = "autoCompleteMultipleInput")
    WebElement autoCompleteMultipleInput;

    public AutoCompletePage autoComplete() {
        autoCompleteMultipleInput.sendKeys("a");// берем элемент, вводим букву а
        autoCompleteMultipleInput.sendKeys(Keys.DOWN,Keys.ENTER);//стрелка вниз и ввод текста который выпадет
        return this;
    }
}
