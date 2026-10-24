package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPage {

    WebDriver driver;

    public MouseHoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Mousehover() {

        WebElement mHover = driver.findElement(
                By.xpath("//*[@id='HTML3']/div[1]/div/button"));

        Actions action = new Actions(driver);

        action.moveToElement(mHover).perform();
    }

    public String getMobileText() {

        return driver.findElement(
                By.xpath("//a[text()='Mobiles']")).getText();
    }

    public String getLaptopText() {

        return driver.findElement(
                By.xpath("//a[text()='Laptops']")).getText();
    }
}