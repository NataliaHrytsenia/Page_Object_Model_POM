package org.pom.tests;

import org.pom.pages.BookStorePage;
import org.pom.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBookTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
    }

    @Test
    public void searchBookTest(){
        new BookStorePage(driver).enterBookName("Git")
                .verifyBookName("Git");
    }
}
