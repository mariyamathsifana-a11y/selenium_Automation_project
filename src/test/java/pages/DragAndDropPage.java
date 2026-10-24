package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDrop() throws InterruptedException {

        WebElement source = driver.findElement(
                By.xpath("//*[@id=\"draggable\"]/p"));

        WebElement destination = driver.findElement(
                By.xpath("//*[@id=\"droppable\"]"));

        Actions action = new Actions(driver);

        action.dragAndDrop(source, destination).perform();
        
    }
    public String getDropMessage() {
    	return driver.findElement(By.xpath("//*[@id=\"droppable\"]/p")).getText();
    }

    
}