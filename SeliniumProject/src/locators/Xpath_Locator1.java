package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator1 {
        public static void main(String[] args) {
            xpathLocator1();
        }

        public static void xpathLocator1() {
            ChromeDriver chrome = null;
            try {
                chrome = new ChromeDriver();
                chrome.manage().window().maximize();

                //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
                chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

                //using xpath enter userName and password
                chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@id='frm1_pwd_id']")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);

                chrome.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                chrome = null;
            }
        }
    }

