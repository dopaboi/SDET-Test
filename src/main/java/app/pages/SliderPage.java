package app.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;


public class SliderPage extends BasePage {

    public SelenideElement sliderPoint =$(By.linkText("Spinner"));
    public SelenideElement inputField = $(".ui-spinner-input");
    public SelenideElement buttonGetValue = $("#getvalue");



    public SliderPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickSlider()
    {
        sliderPoint.click();
    }
    public void inputSpinner(String number)
    {
        inputField.click();
        inputField.setValue(number);
        buttonGetValue.click();
        alertWorks();
        assertEquals(alertWorks(), number);
    }
    public String alertWorks()
    {
        String line =  Selenide.switchTo().alert().getText();
        Selenide.switchTo().alert().accept();
        return line;
    }
}
