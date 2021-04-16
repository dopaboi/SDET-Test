import org.testng.annotations.Test;

public class SliderTest extends A_BaseTest {
    @Test
    public void SliderCheck()
    {
        app.sliderPage.open();
        app.sliderPage.clickSlider();
        app.sliderPage.inputSpinner("12");
    }
}
