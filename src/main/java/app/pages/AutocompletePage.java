package app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class AutocompletePage extends BasePage {

    public SelenideElement autocompleteClick = $(By.linkText("Autocomplete"));
    public SelenideElement iframe = $(".demo-frame");
    public SelenideElement inputField = $(".ui-autocomplete-input");


    public void goToAutocompletePage() {
        $(autocompleteClick).click();
    }

    public void inputTag(String charaсter) {
        Selenide.switchTo().frame(iframe);
        $(inputField).click();
        $(inputField).setValue(charaсter);
        $(inputField).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        String characterFromInput = $(inputField).getValue();
        assertEquals(characterFromInput, "Asp");

    }

    public AutocompletePage(String pageUrl) {
        super(pageUrl);
    }
}
