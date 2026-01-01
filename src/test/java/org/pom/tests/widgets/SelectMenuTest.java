package org.pom.tests.widgets;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.widgets.SelectMenuPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTest extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectSelectMenu();
    }

    @Test
    public void selectOldStyleTest(){
        new SelectMenuPage(driver).selectOldStyle("Blue");
    }

    @Test
    public void multiSelectTest(){
        new SelectMenuPage(driver).multiSelect(new String[]{"Blue","Black","Red"});
    }

    @Test//второй способ
    public void multiSelectTest1(){
        new SelectMenuPage(driver).multiSelect1(new String[]{"Blue","Black","Red"});
    }

    @Test
    public void standartMultiSelectTest(){
        new SelectMenuPage(driver).standartMultiSelectTest(2);//Opel
    }
}
