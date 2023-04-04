package Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    public WebDriverManager(String webDriverType){
        this.webDriverType = webDriverType;
    }
    private WebDriver driver;

    private String webDriverType;

    private WebDriver createDriver(){

        switch (webDriverType)
        {
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Optiunea de web driver indicata ne este valabila! Mai incearca!");
        }
        return driver;
    }

    public WebDriver getDriver()
    {
        if(driver == null){
            createDriver();
        }
        return  driver;
    }

    public void closeDriver(){
        if(driver != null){
            driver.close();
            System.out.println("Web driverul a fost inchis!");
        }
    }
}
