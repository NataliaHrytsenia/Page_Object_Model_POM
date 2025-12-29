package org.pom.tests.widgets;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.widgets.AutoCompletePage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoCompleteTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectAutoComplete();
    }

    @Test
    public void autoCompleteTest(){
        new AutoCompletePage(driver).autoComplete();
    }
}
