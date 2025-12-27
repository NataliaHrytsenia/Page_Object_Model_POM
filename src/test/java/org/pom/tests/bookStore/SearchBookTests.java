package org.pom.tests.bookStore;

import org.pom.pages.bookStore.BookStorePage;
import org.pom.pages.HomePage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBookTests extends TestBase {

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
