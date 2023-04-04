package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Page {
    public RegisterPage(WebDriver driver){
        super(driver);
    }
    @FindBy(id="input-firstname")
    private WebElement firstNameInput;
    @FindBy(id="input-lastname")
    private WebElement lastNameInput;
    @FindBy(id="input-email")
    private WebElement emaiInput;
    @FindBy(id="input-password")
    private WebElement passwordInput;
    @FindBy(xpath="//*[@id=\"form-register\"]/div/div/div/input")
    private WebElement privacyCheckBox;
    @FindBy(xpath="//*[@id=\"form-register\"]/div/div/button")
    private WebElement continueButton;

    public void fillInTheRegisterForm(String firstName, String lastName, String email, String password) throws InterruptedException {
        Thread.sleep(1000);
        firstNameInput.sendKeys(firstName);
        Thread.sleep(1000);
        lastNameInput.sendKeys(lastName);
        Thread.sleep(1000);
        emaiInput.sendKeys(email);
        Thread.sleep(1000);
        passwordInput.sendKeys(password);
    }

    public void acceptPrivacy() throws InterruptedException {
        Thread.sleep(1000);
        privacyCheckBox.click();
    }

    public void finishRegistration() throws InterruptedException {
        Thread.sleep(1000);
        continueButton.click();
    }
}
