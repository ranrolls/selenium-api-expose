package com.sel;

import com.sel.site.formy.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;

public class One {
    public static void main(String[] args) {
//        WebDriver driver = getHtmlUnit();
        WebDriver driver = getChrome();

//        WebDriver driver = getEdge();
//        WebDriver driver = getFirefox();
//        WebDriver driver = getFirefoxW_Opt();
//        WebDriver driver = getFirefoxW_Preference();

        Main main = new Main();
        main.start(driver);

        driver.quit();
    }

    public static WebDriver getChrome() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/yeswe/chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver getHtmlUnit() {
        return new HtmlUnitDriver();
    }

    public static WebDriver getEdge() throws IOException {
        System.setProperty("webdriver.edge.driver", "driver/MicrosoftWebDriver.exe");
        return new EdgeDriver();
    }

    public static WebDriver getFirefox(){
        return new FirefoxDriver();
    }

    public static WebDriver getFirefoxW_Opt() {
        System.setProperty("webdriver.gecko.driver", "C:/Users/yeswe/geckodriver64.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        return new FirefoxDriver(firefoxOptions);
    }

    public static WebDriver getFirefoxW_Preference() {
        FirefoxProfile prof = new FirefoxProfile();
        FirefoxProfile fp = new FirefoxProfile();
        fp.setPreference("browser.startup.homepage", "about:blank");
        fp.setPreference("startup.homepage_welcome_url", "about:blank");
        fp.setPreference("startup.homepage_welcome_url.additional", "about:blank");
        fp.setPreference("xpinstall.signatures.required", false);
        fp.setPreference("toolkit.telemetry.reportingpolicy.firstRun", false);
        fp.setPreference("toolkit.telemetry.archive.enabled", false);
        fp.setPreference("toolkit.telemetry.enabled", false);
        fp.setPreference("toolkit.telemetry.rejected", true);
        fp.setPreference("toolkit.telemetry.server", "<blank>");
        fp.setPreference("toolkit.telemetry.unified", false);
        fp.setPreference("toolkit.telemetry.unifiedIsOptIn", false);
        fp.setPreference("toolkit.telemetry.prompted", 2);
        fp.setPreference("toolkit.telemetry.rejected", true);
        fp.setPreference("browser.urlbar.timesBeforeHidingSuggestionsHint", 0);
        fp.setPreference("datareporting.policy.dataSubmissionPolicyAcceptedVersion", 2);
        fp.setPreference("datareporting.policy.dataSubmissionPolicyNotifiedTime", "9000000000000");
        fp.setPreference("datareporting.healthreport.uploadEnabled", false);
        fp.setPreference("datareporting.healthreport.service.enabled", false);
        fp.setPreference("datareporting.healthreport.service.firstRun", false);
        WebDriver driver = new FirefoxDriver(fp);
        return driver;
    }
}
