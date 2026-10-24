package tests;

import java.io.IOException;


import org.testng.annotations.Test;

import base.BasePage;
import pages.FileUploadPage;
import utils.ConfigReader;

public class FileUploadTest extends BasePage {

    @Test
    public void fileUpload() throws IOException {

        ConfigReader config = new ConfigReader();

        FileUploadPage fp = new FileUploadPage(driver);

        // Get file paths
        fp.single(config.getProperty("filePath"));
        fp.multiple(config.getProperty("file1"), config.getProperty("file2"));
        
    }
}