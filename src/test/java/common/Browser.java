package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
    public static WebDriver driver = null;

    public static void OpenChromeBrowser(){
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
//        options.addArguments("--headless");
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("Chrome Driver Initialised");
    }
    public static void CloseAllBrowserWindows(){
        System.out.println("Closing all browsers");
        driver.quit();
    }
}
