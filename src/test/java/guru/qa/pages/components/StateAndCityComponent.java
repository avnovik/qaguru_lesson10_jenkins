package guru.qa.pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class StateAndCityComponent {
    private final SelenideElement
            stateInput = $("#react-select-3-input"),
            cityInput = $("#city");


    public void setStateAndCity(String state, String city) {
        stateInput.setValue(state).pressTab();
        cityInput.click();
        cityInput.$(byText(city)).click();
    }
}
