package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    HelperAlert alert;
    HelperWindows windows;
    HelperSelect select;
    HelperJs js;



    public void init() {
        wd = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/home/i-istomin/TelRan/SYSTEMS/Qa32_DemoTest/chromedriver");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");

        alert = new HelperAlert(wd);
        windows = new HelperWindows(wd);
        select= new HelperSelect(wd);
        js=new HelperJs(wd);


    }
    public void stop() {
        wd.quit();
    }

    public HelperAlert alert() {
        return alert;
    }

    public HelperWindows windows() {
        return windows;
    }

    public HelperSelect select() {
        return select;
    }

    public HelperJs getJs() {
        return js;
    }
}
