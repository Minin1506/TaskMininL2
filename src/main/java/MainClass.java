import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {

    public static void main(String[] args) {
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Minin\\IdeaProjects\\TaskMininL2\\drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );


        driver.get("https://ru.wikipedia.org");

        WebElement logo = driver.findElement(By.id("p-logo"));

        driver.quit();

    }

}
