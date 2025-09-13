package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_cssSelector {
        public static void main(String[] args) {
            relativecssSelector();
        }

        public static void  relativecssSelector() {
            ChromeDriver chrome = null;
            try {
                chrome = new ChromeDriver();
                chrome.manage().window().maximize();

                //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
                chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

                //using xpath enter userName and password
                //chrome.findElement(By.cssSelector("input[id='frm1_un_id']\n")).sendKeys("aaaaaaaaaaaaa");
                //Thread.sleep(2000);

                 // Identify the first username?
                chrome.findElement(By.cssSelector("input[id='frm1_un_id'][type='text']\n")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);

               // Q: find the link which doesnot have target attribute?
                chrome.findElement(By.cssSelector("a:not([target])")).sendKeys("aaaaaaaaaaaaa");
                Thread.sleep(2000);



                chrome.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                chrome = null;
            }
        }
    }
