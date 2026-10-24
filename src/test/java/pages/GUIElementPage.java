package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GUIElementPage {

    WebDriver driver;

    public GUIElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void details(String name,String email,String phone,String address) {

        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys(name);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);

        WebElement phoneField = driver.findElement(By.id("phone"));
        phoneField.sendKeys(phone);

        WebElement addressField = driver.findElement(By.id("textarea"));
        addressField.sendKeys(address);

        WebElement gender = driver.findElement(
                By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]/label"));
        gender.click();

        WebElement days = driver.findElement(
                By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[1]/label"));
        days.click();

        WebElement countryDropDown = driver.findElement(By.id("country"));
        Select country = new Select(countryDropDown);
        country.selectByIndex(3);

        WebElement colourList = driver.findElement(By.id("colors"));
        Select colour = new Select(colourList);
        colour.selectByIndex(3);


        WebElement animalList = driver.findElement(By.id("animals"));
        Select animal = new Select(animalList);
        animal.selectByIndex(3);

    }
}