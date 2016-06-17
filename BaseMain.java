import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

public class BaseMain {
    //object of driver
    //Methods for running in different browser

    static WebDriver driver;

    public void openBrowser() {
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait -is connected to driver object until it is alive
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();

    }

    public void closeBrowser(){
        driver.quit();
    }
}
