package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPage {

    WebDriver driver;

    public DoubleClickPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doubleClick()  {

        WebElement button = driver.findElement(
                By.xpath("//button[text()='Copy Text']"));

        Actions action = new Actions(driver);

        action.doubleClick(button).perform();
        
    }

    public String getDoubleClick() {

        WebElement doubleclick = driver.findElement(By.id("field2"));

        return doubleclick.getAttribute("value");
    }
}