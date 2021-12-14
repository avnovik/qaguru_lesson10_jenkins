package guru.qa;

import guru.qa.data.TestData;
import org.junit.jupiter.api.Test;

public class DemoqaTests extends TestBase {

    @Test
    void fillFormTest() {
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
