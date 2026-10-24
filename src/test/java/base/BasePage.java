package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.ConfigReader;

public class BasePage {

    public WebDriver driver;

    // Normal setup - Chrome only
    // Use this when you want to directly open the website
   
    @BeforeMethod
    public void setUp() throws IOException {

        ConfigReader config = new ConfigReader();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
               .implicitlyWait(Duration.ofSeconds(5));

        driver.get(config.getProperty("url"));
    }
    


    // Browser selection - Chrome or Edge
  /*  @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser) throws IOException {

        ConfigReader config = new ConfigReader();

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

        } 
        else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();

        driver.manage().timeouts()
               .implicitlyWait(Duration.ofSeconds(5));

        driver.get(config.getProperty("url"));
    }
*/

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }}


