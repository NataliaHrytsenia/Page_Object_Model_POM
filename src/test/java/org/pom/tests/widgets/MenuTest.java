package org.pom.tests.widgets;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.widgets.MenuPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuTest extends TestBase {

    @BeforeMethod
    public void precondition (){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectMenu();
    }

    @Test
    public void selectMenuTest(){
        new MenuPage(driver).selectSubMenu()
                .assertSubMenu();
    }
}
