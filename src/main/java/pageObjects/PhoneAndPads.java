package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PhoneAndPads extends Page {
    public PhoneAndPads(WebDriver driver){
        super(driver);
    }

    private String PhoneNamesCss = ".content a";

    public void printAvailablePhones(WebDriver driver){
        List<WebElement> phones = driver.findElements(By.cssSelector(PhoneNamesCss));

        for(int i=0;i<phones.size();i++){
            System.out.println(phones.get(i).getText());
        }
    }
}
