package automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverUtils {

    static WebDriver driver;

    public static void createDriver() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.manage().window().maximize();
    }

    public static void createSauceDriver() {
        // Steps/hooks and update to use craeteSauceDriver in setup

        ChromeOptions options = new ChromeOptions();
        options.setPlatformName("Windows 10");
        options.setBrowserVersion("latest");

        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-");
        sauceOptions.put("accessKey", "f81---");
        sauceOptions.put("name", "My first Test");

        options.setCapability("sauce:options", sauceOptions);
        URL url = null;
        try {
            //get url from dashboard, username and pass
            url = new URL("https://ondemand.us-west-1.saucelabs.com/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        // user remotewebdriver to execute on remote machine
        driver = new RemoteWebDriver(url, options);
    }

    public static void createBrowserStackDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "97.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("name", "My first test"); // test name
        caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
            //final WebDriver driver = new RemoteWebDriver(new URL("\"https://chiraq:\" + password +\"@hub-cloud.browserstack.comm), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

}

//https://docs.saucelabs.com/web-apps/automated-testing/selenium/#step-1-create-a-remote-session