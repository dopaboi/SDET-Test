package app.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import helpers.Driver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.testng.Assert.assertEquals;


public class SliderPage extends BasePage {

    public SelenideElement sliderPoint =$(By.linkText("Spinner"));
    public SelenideElement iframe=$(".demo-frame");
    public SelenideElement clickPoint = $(By.xpath("//input[@id='spinner']"));
    public SelenideElement inputField = $(".ui-spinner-input");
    public SelenideElement buttonGetValue = $("#getvalue");



    public SliderPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickSlider()
    {
        sliderPoint.click();
    }
    public void inputSpinner(String number) {
        Selenide.switchTo().frame(iframe);
        clickPoint.click();
        clickPoint.setValue(number);
        buttonGetValue.click();
        String numberFromAlert = Selenide.switchTo().alert().getText();
        Selenide.switchTo().alert().accept();
        assertEquals(numberFromAlert, number);
    }
}
