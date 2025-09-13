package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
        public static void main(String[] args) {
            classname();
        }


        public static void classname() {
            ChromeDriver chrome = null;
            try {
                chrome = new ChromeDriver();
                chrome.manage().window().maximize();

                //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
                chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

                //using name enter userName and password
                chrome.findElement(By.name("frm1_un_name")).sendKeys("aaaaaaaaaaaaa");
                chrome.findElement(By.name("frm1_pwd_name")).sendKeys("bbbbbbbbbbb");
                Thread.sleep(2000);

                chrome.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                chrome = null;
            }
        }
    }