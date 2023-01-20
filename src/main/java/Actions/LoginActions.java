package Actions;

import Locators.LoginLocators;
import Utilities.FileProperties;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.Base.driver;

public class LoginActions {

    LoginLocators loginLocators = new LoginLocators();

    //Enter username
    public void sendUserName(){
        //Esperar a que se pueda hacer click en el elemento nombre de usuario
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(loginLocators.userNameInput));
        loginLocators.userNameInput.sendKeys(FileProperties.getProperty().getProperty("user"));
    }

    //Ingresar contraseña de usuario
    public void sendPassword(){
        loginLocators.userPassInput.sendKeys(FileProperties.getProperty().getProperty("password"));
        System.out.println("El usuario ingresa contraseña.");
    }

    public void clickLogin() throws InterruptedException{
        Thread.sleep(3000);
        loginLocators.btnLogin.click();
        System.out.println("El usuario da click en ingresar.");
        //lskmksdjvx
    }

}
