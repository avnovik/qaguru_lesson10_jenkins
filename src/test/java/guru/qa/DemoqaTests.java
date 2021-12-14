package guru.qa;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.data.TestData;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

public class DemoqaTests extends TestBase {

    @Test
    void fillFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        registrationPage
                .openPage()
                .hideBanner()
                .typeFirstName(TestData.firstName)
                .typeLastName(TestData.lastName)
                .typeEmail(TestData.email)
                .typeGender(TestData.gender)
                .typeTelNumber(TestData.telephoneNumber)
                .setDate("05", "June", "1977")
                .typeSubjects(TestData.subjectInput1, TestData.subjectInput2)
                .setHobbies(TestData.hobbies)
                .uploadFile(TestData.uploadFileName)
                .typeAddress(TestData.address)
                .setStateAndCity("Uttar Pradesh", "Agra")
                .pushSubmitBtn();

        verificationPage
                .verificationTextForm()
                .softAssertForm()
                .closeTextForm();
    }
}
