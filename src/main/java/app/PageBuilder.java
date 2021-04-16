package app;

import app.pages.AutocompletePage;
import app.pages.DemosPage;
import app.pages.SliderPage;

public class PageBuilder {

    public static DemosPage buildDemosPage() {
        return new DemosPage("/demos");
    }
    public static SliderPage buildSliderPage() {
        return new SliderPage("/demos");
    }
    public static AutocompletePage buildAutocompletePage() {return new AutocompletePage("/demos");}
}
