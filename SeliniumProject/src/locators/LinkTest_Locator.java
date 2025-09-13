package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest_Locator {
    public static void main(String[] args) {
        linkTextLocator();
    }
    public static void linkTextLocator() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

            //using linkText enter userName and password
            chrome.findElement(By.linkText("Google India")).click();
            Thread.sleep(2000);

            //Click on back navigation
            chrome.navigate().back();

            chrome.findElement(By.linkText("Facebook")).click();
            Thread.sleep(2000);

            //Click on back navigation
            chrome.navigate().back();


            chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}