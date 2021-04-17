package app.pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;


public class SliderPage extends BasePage {

    public SelenideElement sliderPoint =$(By.linkText("Spinner"));
    public SelenideElement iframe=$(".demo-frame");
    public SelenideElement inputField = $(".ui-spinner-input");
    public SelenideElement buttonGetValue = $("#getvalue");



    public SliderPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickSlider()
    {
        $(sliderPoint).click();
    }
    public void inputSpinner(String number) {
        Selenide.switchTo().frame(iframe);
        $(inputField).should(Condition.exist).click();
        $(inputField).setValue(number);
        $(buttonGetValue).click();
        String numberFromAlert = Selenide.switchTo().alert().getText();
        Selenide.switchTo().alert().accept();
        assertEquals(numberFromAlert, number);
    }
}
