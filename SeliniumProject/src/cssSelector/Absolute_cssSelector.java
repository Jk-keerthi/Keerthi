package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_cssSelector {
        public static void main(String[] args) {
            //Q: Using AC find first username?
                    absolutecssselector();
        }

        public static void absolutecssselector() {
            ChromeDriver chrome = null;
            try {
                chrome = new ChromeDriver();
                chrome.manage().window().maximize();

                //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
                chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

                //using xpath enter userName and password
                 chrome.findElement(By.cssSelector("[id='frm1'] input[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
                 Thread.sleep(2000);

                //Q: Using AC find first password?
                chrome.findElement(By.cssSelector("html body form input[id='frm1_pwd_id']\n")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);

                 // Q: Using AC find second username?
                chrome.findElement(By.cssSelector("html body form[id='frm2'] input[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);

                //Q: Using AC find second password?
                chrome.findElement(By.cssSelector("html body form[id='frm2'] input[id='frm1_pwd_id']")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);

                chrome.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                chrome = null;
            }
        }
    }

