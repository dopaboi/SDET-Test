package app.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class DemosPage extends BasePage {

    public SelenideElement interactionsSection = $(By.xpath("//div[@id='sidebar']//h3[.='Interactions']"));
    public SelenideElement widgetSection = $(By.xpath("//div[@id='sidebar']//h3[.='Widgets']"));
    public SelenideElement effectsSection = $(By.xpath("//div[@id='sidebar']//h3[.='Effects']"));
    public SelenideElement utilitiesSection = $(By.xpath("//div[@id='sidebar']//h3[.='Utilities']"));


    public DemosPage(String pageUrl) {
        super(pageUrl);
    }

    public String checkSection(WebElement webElement) {
        return webElement.getText();
    }

    public void checkInteractionsSection(String string) {
        assertEquals(checkSection(interactionsSection), string);
    }

    public void checkWidgetSection(String string) {
        assertEquals(checkSection(widgetSection), string);
    }

    public void checkEffectsSection(String string) {
        assertEquals(checkSection(effectsSection), string);
    }

    public void checkUtilitiesSection(String string) {
        assertEquals(checkSection(utilitiesSection), string);
    }


}
