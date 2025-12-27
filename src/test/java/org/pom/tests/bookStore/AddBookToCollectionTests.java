package org.pom.tests.bookStore;

import org.pom.data.UserData;
import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.bookStore.BookStorePage;
import org.pom.pages.bookStore.LoginPage;
import org.pom.pages.bookStore.ProfilePage;
import org.pom.tests.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookToCollectionTests extends TestBase {

    @BeforeMethod
    public void precondition(){

        //СЦЕНАРИЙ

        //click on Book Store Application
        new HomePage(driver).getBookStore();
        //click on the Login Button
        new BookStorePage(driver).cliclOnLoginButton();
        //login
        new LoginPage(driver).login(UserData.USER_Name,UserData.USER_PASSWORD);
    }

    @Test
    public  void  addBookToCollectionTests(){
        //СЦЕНАРИЙ
        //enter book name
        //click on book name
        //click on the Add yo you collection button an accept alert
        //click on profile
        //verify the book is added

        new BookStorePage(driver).enterBookName(UserData.BOOK_NAME)
                .clickOnBookName()
                .addToCollection();
                new SidePanel(driver).selectProfile();
                new BookStorePage(driver).verifyBookName(UserData.BOOK_NAME);
    }

    @AfterMethod
    public  void deleteBookFromCollection(){
        new ProfilePage(driver).deleteBook();
    }
}
