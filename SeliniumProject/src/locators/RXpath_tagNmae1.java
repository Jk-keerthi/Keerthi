package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RXpath_tagNmae1 {
    public static void main(String[] args) {
        rxpathtagname1();
    }

    public static void rxpathtagname1() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("//input[2]")).sendKeys("aaaaaaaaaaaaa");

            //first username
            chrome.findElement(By.xpath("//input[@id='frm1_un_id']\n")).sendKeys("aaaaaaaaaaaaa");

            //Enter value for first username?
            chrome.findElement(By.xpath("//input[@id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");

            //using and logical operator
           // Enter value for first username?
            chrome.findElement(By.xpath("input[@id='frm1_un_id' and @type='text']")).sendKeys("aaaaaaaaaaaaa");

            //Find the link which doesnot have target attribute?
            chrome.findElement(By.xpath("//a[not(@target)]")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);

            chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

