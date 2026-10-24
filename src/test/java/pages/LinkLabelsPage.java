
	package pages;

	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LinkLabelsPage {

	    WebDriver driver;

	    public LinkLabelsPage(WebDriver driver) {
	        this.driver = driver;
	    }
	    int brokenCount=0 ;

	    public void brokenLink() throws Exception {

	       
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total Links : " + links.size());

	        for (WebElement link : links) {

	            String url = link.getAttribute("href");

	            if (url == null || url.isEmpty()) {
	                continue;
	            }

	            URL linkURL = new URL(url);

	            HttpURLConnection connection =
	                    (HttpURLConnection) linkURL.openConnection();

	            int responseCode = connection.getResponseCode();

	            if (responseCode >= 400) {

	                brokenCount++;

	                System.out.println("Broken Link : " + url);
	                System.out.println("Response code : " + responseCode);
	                System.out.println("------------------------------------");
	            }

	            connection.disconnect();
	        }

	        System.out.println("Total Broken Links : " + brokenCount);
			
	        
	    }
	    public int getBrokenCount() {

	        return brokenCount;
	    }
	}


