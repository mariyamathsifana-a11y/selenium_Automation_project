package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTabPage {

    WebDriver driver;

    public NewTabPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newTab() {

        WebElement btn = driver.findElement(
                By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));

        btn.click();

        String parentWindow = driver.getWindowHandle();

        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {

            if (!window.equals(parentWindow)) {

                driver.switchTo().window(window);

                break;
            }
        }
    }

    public void childAction() throws InterruptedException {

        WebElement OnlineTraining = driver.findElement(
                By.xpath("//*[@id=\"PageList1\"]/div/ul/li[1]/a"));

        OnlineTraining.click();

        Thread.sleep(2000);
    }
}