package org.pom.tests.form;

import org.pom.data.StudentData;
import org.pom.pages.HomePage;
import org.pom.pages.SidePanel;
import org.pom.pages.forms.PracticeFormPage;
import org.pom.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();//скрывает рекламу

    }

    @Test
    public void fillStudentFormTest(){
        //СЦЕНАРИЙ//

        //enter personal date (name, lastname, email, phone number)
        //select gender
        //enter date
        //select subjects
        //select hobby
        //upload file
        //enter address
        //select state
        //select city
        //click on submit button

        new PracticeFormPage(driver).enterPersonalData(StudentData.FIRST_NAME,
                StudentData.LAST_NAME,StudentData.EMAIL,StudentData.PHONE_NUMBER)
                .selectGender(StudentData.GENDER)
                //.enterDate(StudentData.DATE)
                .selectDate("May", "2001", "15") //способ выбать дату из календаря
                .selectSubjects(StudentData.SUBJECTS)
                .selectHobby(StudentData.HOBBIES)
                .uploadFile(StudentData.PHOTO_PATH)
                .enterAddress(StudentData.ADDRESS)
                .selectState(StudentData.STATE)
                .selectCity(StudentData.CITY)
                .submit()
                .assertSubmit("Thanks for submitting the form");
    }

    @Test
    public void fillStudentFormUsingDataProviderTest(){

        new PracticeFormPage(driver).enterPersonalData(StudentData.FIRST_NAME,
                        StudentData.LAST_NAME,StudentData.EMAIL,StudentData.PHONE_NUMBER)
                .selectGender(StudentData.GENDER)
                .enterDate(StudentData.DATE)
                .selectSubjects(StudentData.SUBJECTS)
                .selectHobby(StudentData.HOBBIES)
                .uploadFile(StudentData.PHOTO_PATH)
                .enterAddress(StudentData.ADDRESS)
                .selectState(StudentData.STATE)
                .selectCity(StudentData.CITY)
                .submit()
                .assertSubmit("Thanks for submitting the form");
    }
}
