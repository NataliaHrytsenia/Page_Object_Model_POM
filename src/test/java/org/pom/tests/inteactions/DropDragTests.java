package org.pom.tests.inteactions;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.interactions.DroppablePage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDragTests extends TestBase {//перетаскивание одного объекта в другой


    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDroppable().hideIframes();//скрываем рекламу
    }

    @Test
    public void dragMeTest(){
        new DroppablePage(driver).actionDragMe()
                .assertDropped("Drop here");
    }

    @Test     //по координатам передвигать
    public void dragMeByTest(){
        new DroppablePage(driver).actionDragMeBy(30,100)
                .assertDropped("Dropped!");
    }
}
