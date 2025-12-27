package org.pom.pages.bookStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pom.pages.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {//так как в главном классе есть конструктор, то и в дочернем классе нужен конструктор
        super(driver);
    }

    @FindBy(id = "userName") //здесь передается локатор поля UserName
    WebElement userNameField; //здесь идет инициализация элемента

    @FindBy(id = "password") //локатор поля пароль
    WebElement passwordField;

    @FindBy(id = "login")//локатор поля кнопки логин
    WebElement loginButton;

    public ProfilePage login (String userName, String password){
        typeWithJSExecutor(userNameField, userName, 0, 500); //обращение к универсальному методу type
        type(passwordField, password);
        click(loginButton);
        return new ProfilePage(driver);//возвращает экземпляр новой страницы
    }

    public LoginPage loginNegative (String userName, String password){
        type(userNameField, userName); //обращение к универсальному методу type и если есть реклама, которая мешает
        typeWithJSExecutor(userNameField, userName, 0, 500);
        click(loginButton);
        return this;//возвращает объект, в котором находимся
    }


}
