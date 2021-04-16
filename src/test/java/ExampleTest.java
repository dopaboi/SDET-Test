import org.testng.annotations.Test;

public class ExampleTest extends A_BaseTest {
    @Test
    public void LeftMenuCheck() {
        app.demosPage.open();
        app.demosPage.checkEffectsSection("Effects");
        app.demosPage.checkInteractionsSection("Interactions");
        app.demosPage.checkUtilitiesSection("Utilities");
        app.demosPage.checkWidgetSection("Widgets");

        logger.info("Starting test");
        logger.warn("WARNING!");
        logger.error("ERROR!");
        logger.fatal("CRITICAL ERROR");

//        softAssert.assertEquals(2,2);
//        softAssert.assertAll();
    }
}
