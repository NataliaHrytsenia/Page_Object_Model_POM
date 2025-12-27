package org.pom.pages.bookStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.pages.BasePage;
import org.testng.Assert;

import java.time.Duration;

public class BookStorePage extends BasePage {

    public BookStorePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "searchBox")//локатор поискового поля книги
    WebElement searchBox;

    public BookStorePage enterBookName(String book) {
        type(searchBox,book);
        return this;
    }


    @FindBy (xpath = "//span[@class='mr-2']/a") //локатор текста книги
    WebElement bookName;

    public BookStorePage verifyBookName(String book) {
        Assert.assertTrue(bookName.getText().contains(book));
        return this;
    }

    @FindBy(id = "login")
    WebElement loginButton;

    public LoginPage cliclOnLoginButton() {
        click(loginButton);
        return new LoginPage(driver);
    }


    public BookStorePage clickOnBookName() {
        clickWithJSExecutor(bookName, 0, 100);
        return this;
    }

    @FindBy (css = ".text-right.fullButton")
    WebElement addBookButton;

    public BookStorePage addToCollection() {
        clickWithJSExecutor(addBookButton, 0, 2000);
        pause(300);
        driver.switchTo().alert().accept();
        return this;
    }
}
