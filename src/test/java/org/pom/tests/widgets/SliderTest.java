package org.pom.tests.widgets;

import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.widgets.SliderPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends TestBase { //бегунок который передвигают влево-вправо

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).selectSlider();
    }

    @Test
    public  void sliderTest(){
        new SliderPage(driver).moveSliderInHorizontalDirection()
                .assertSliderValue("100");//подвинуть на 100 отделений
    }
}
