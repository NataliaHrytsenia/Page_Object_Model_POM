package org.pom.tests.alertsFramesWindows;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.alertsFrameWindows.FramePage;
import org.pom.pages.alertsFrameWindows.NestedFramesPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFramesWindows();
    }

    @Test
    public void itFramesTest(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).returnListOfFrames().switchToIframeByIndex(2);
    }

    @Test
    public void switchToIframeByIDTest(){
        new SidePanel(driver).selectFrame();
        new FramePage(driver).switchToIframeByID();
    }

    @Test
    public void handleNestedIframeTest(){
        new SidePanel(driver).selectNestedFrames();
        new NestedFramesPage(driver).handleNestedIframes();
    }
}
