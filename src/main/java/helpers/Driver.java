package helpers;

import app.AppConfig;
import com.codeborne.selenide.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Driver {

    public static void initDriver() {

        // Get settings from command line

        TestConfig.initConfig();

        // Set settings for selenide browser

        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;

        if(TestConfig.isHeadless()) {
            Configuration.headless = true;
        } else {
            Configuration.headless = false;
        }

        switch (TestConfig.browser)
        {
            case "chrome":
                Configuration.browser = Browsers.CHROME;
                break;
            case "firefox":
                Configuration.browser = Browsers.FIREFOX;
                break;
            default:
                Configuration.browser = Browsers.CHROME;
                break;
        }
    }

    public static WebDriver currentDriver() {
        return WebDriverRunner.getSelenideDriver().getWebDriver();
    }

    public static void open(String url) {
        Selenide.open(url);
    }

    public static void refresh() {
        Selenide.refresh();
    }


    public static void clearCookies() {
        open(AppConfig.baseUrl);
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    public static void close() {
        currentDriver().quit();
    }

    public static void takeScreenshot() {

        File scrFile = ((TakesScreenshot) currentDriver()).getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir")
                + File.separator + "test-output"
                + File.separator + "screenshots"
                + File.separator + " " + "screenshot_" +  (new SimpleDateFormat("HHmmssSSS").format(new Date())) + ".png";
        try {
            FileUtils.copyFile(scrFile, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
