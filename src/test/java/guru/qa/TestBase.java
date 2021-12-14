package guru.qa;

import org.junit.jupiter.api.BeforeAll;
import guru.qa.pages.RegistrationPage;
import guru.qa.pages.VerificationPage;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    VerificationPage verificationPage = new VerificationPage();

    @BeforeAll
    static void beforeAll() {
        //Configuration.browserSize = "800x600";
    }
}
