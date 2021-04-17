import org.testng.annotations.Test;

public class LeftMenuCheck extends A_BaseTest {
    @Test
    public void LeftMenuCheck() {
        logger.info("Starting test LeftMenuCheck");
        app.demosPage.open();
        app.demosPage.checkEffectsSection("Effects");
        app.demosPage.checkInteractionsSection("Interactions");
        app.demosPage.checkUtilitiesSection("Utilities");
        app.demosPage.checkWidgetSection("Widgets");
        logger.error("Error in the LeftMenuCheck");

    }
}
