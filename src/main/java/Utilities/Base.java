package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {

    public static WebDriver driver;

    public static void setUp(){
        String getBrowser = FileProperties.getProperty().getProperty("browser");

        switch (getBrowser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Edge" :
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("No se ha encontrado algún navegador.");
        }
        driver.navigate().to(FileProperties.getProperty().getProperty("url"));
    }

    public static void closeDriver(){
        driver.quit();
    }
}
