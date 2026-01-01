package org.pom.tests.widgets;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.widgets.ToolTipsPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsTest extends TestBase {//всплываюзие подсказки

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectToolTips();
    }

    @Test
    public void toolTipsTest(){
        new ToolTipsPage(driver).hoverToolTips();
    }
}
