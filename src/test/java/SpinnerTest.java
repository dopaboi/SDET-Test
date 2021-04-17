import org.testng.annotations.Test;

public class SpinnerTest extends A_BaseTest {
    @Test
    public void SliderCheck()
    {
        logger.info("Starting test SpinnerTest");
        app.sliderPage.open();
        app.sliderPage.clickSlider();
        app.sliderPage.inputSpinner("12");
        logger.error("Error in the SpinnerTest");
    }
}
