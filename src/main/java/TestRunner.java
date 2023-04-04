import Managers.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.PhoneAndPads;
import pageObjects.RegisterPage;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager webDriverManager = new WebDriverManager("CHROME");

        webDriverManager.getDriver().get("https://demo.opencart.com/");

        // Register new user
        HomePage homePage = new HomePage(webDriverManager.getDriver());
        homePage.navigateToRegisterPage();
        RegisterPage registerPage = new RegisterPage(webDriverManager.getDriver());
        registerPage.fillInTheRegisterForm("Cristian", "Ceban", "test@gmail.com", "test1234!");
        registerPage.acceptPrivacy();
        registerPage.finishRegistration();

        //Print list of available phones and pads
        PhoneAndPads phonesAndPads = new PhoneAndPads(webDriverManager.getDriver());
        phonesAndPads.navigateToPhonesAndPads();
        phonesAndPads.printAvailablePhones(webDriverManager.getDriver());

        //Close driver
        Thread.sleep(2500);
        webDriverManager.getDriver().close();
    }
}
