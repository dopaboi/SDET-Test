import org.testng.annotations.Test;

public class AutocompleteTest extends A_BaseTest{
    @Test
    public void AutocompleteCheck()
    {
        app.autocompletePage.open();
        app.autocompletePage.goToAutocompletePage();
        app.autocompletePage.inputTag("a");
    }

}
