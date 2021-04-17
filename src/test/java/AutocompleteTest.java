import org.testng.annotations.Test;

public class AutocompleteTest extends A_BaseTest{
    @Test
    public void AutocompleteCheck()
    {
        logger.info("Starting test AutocompleteCheck");
        app.autocompletePage.open();
        app.autocompletePage.goToAutocompletePage();
        app.autocompletePage.inputTag("a");
        logger.error("Error in the AutocompleteCheck");
    }

}
