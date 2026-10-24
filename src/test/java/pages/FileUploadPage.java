package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    // Single File Upload
    public void single(String filePath) {

        WebElement singleUpload =
                driver.findElement(By.id("singleFileInput"));

        singleUpload.sendKeys(filePath);
    }

    // Multiple File Upload
    public void multiple(String file1, String file2) {

        WebElement multipleUpload =
                driver.findElement(By.id("multipleFilesInput"));

        multipleUpload.sendKeys(file1 + "\n" + file2);
    }}

    
       