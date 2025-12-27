package org.pom.tests.elements;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.elements.BrokenLinksImagesPage;
import org.pom.pages.elements.LinksPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinksTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
    }

    @Test
    public void getAllLinksTest(){
        new SidePanel(driver).selectLinks();
        new LinksPage(driver).getAllLinks();
    }

    @Test
    public void checkBrokenLinksTests(){
        new SidePanel(driver).selectLinks();
        new LinksPage(driver).checkBrokenLinks();
    }

    @Test
    public void checkBrokenImages(){
        new SidePanel(driver).selectBrokenLinksImages();
        new BrokenLinksImagesPage(driver).checkBrokenImages();
    }
}
