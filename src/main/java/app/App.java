package app;

import app.pages.AutocompletePage;
import app.pages.DemosPage;
import app.pages.SliderPage;

public class App {

    public DemosPage demosPage;
    public SliderPage sliderPage;
    public AutocompletePage autocompletePage;

    public App() {
        demosPage = PageBuilder.buildDemosPage();
        sliderPage = PageBuilder.buildSliderPage();
        autocompletePage = PageBuilder.buildAutocompletePage();
    }

}
