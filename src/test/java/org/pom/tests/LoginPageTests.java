package org.pom.tests;

import org.pom.pages.HomePage;
import org.pom.pages.LoginPage;
import org.pom.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
        new SidePanel(driver).selectLogin();
    }

    @Test
    public void loginPositiveTest(){
        new LoginPage(driver)
                .login("NH","NatiNati1984!")
                .verifyUserName("NH");//убеждаемся,что мы именно на этой странице
    }
}
