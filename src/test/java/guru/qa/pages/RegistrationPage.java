package guru.qa.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.pages.components.CalendarComponent;
import guru.qa.pages.components.StateAndCityComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    final String
            LINK = "https://demoqa.com/automation-practice-form",
            FORM_TITLE = "Student Registration Form";

    private final SelenideElement
            welcomeFormProof = $(".practice-form-wrapper"),
            hideBanner = $("#close-fixedban"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadio = $("#genterWrapper"),
            telNumInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            fileUploadSelect = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress");

    // public CalendarComponent calendar = new CalendarComponent();
    //public StateAndCityComponent stateandcity = new StateAndCityComponent();
    public RegistrationPage openPage() {
        open(LINK);
        welcomeFormProof.shouldHave(text(FORM_TITLE));
        return this;
    }

    public RegistrationPage hideBanner() {
        hideBanner.click();
        return this;
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage typeGender(String value) {
        genderRadio.$(byText(value)).click();
        return this;
    }

    public RegistrationPage typeTelNumber(String value) {
        telNumInput.val(value);
        return this;
    }

    public RegistrationPage setDate(String day, String month, String year) {
        new CalendarComponent().setDate(day, month, year);
        return this;
    }

    public RegistrationPage typeSubjects(String value1, String value2) {
        subjectInput.setValue(value1).pressTab();
        subjectInput.setValue(value2).pressTab();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadFile(String fileName) {
        fileUploadSelect.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationPage typeAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage setStateAndCity(String state, String city) {
        new StateAndCityComponent().setStateAndCity(state, city);
        return this;
    }

    public void pushSubmitBtn() {
        $("#submit").click();
    }
}
