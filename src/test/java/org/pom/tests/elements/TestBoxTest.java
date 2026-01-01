package org.pom.tests.elements;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.elements.TextBoxPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBoxTest extends TestBase {//копировать и вставить

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectTextBox().hideIframes();
    }

    @Test
    public void keyBoardEventTest(){
        new TextBoxPage(driver).keyBoardEvent("Simensdamm 20");
    }
}
