package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative_locator {
        public static void main(String[] args) {
            relativeLocator();
        }

        public static void relativeLocator() {
            ChromeDriver chrome = null;
            try {
                chrome = new ChromeDriver();
                chrome.manage().window().maximize();

                //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
                chrome.navigate().to("file:///C:/Users/dell/Desktop/Sample.HtML");

               //using xpath enter userName and password
                chrome.findElement(RelativeLocator.
               with(By.tagName("input"))
               .toLeftOf(By.xpath("//input[@id='frm1_pwd_id']"))).sendKeys("aaaaaaaaa");

               //Q: Identify the username by traversing left direction from the password element.
               // chrome.findElement(RelativeLocator.
                        //    with(By.tagName("input"))
                      //  .toRightOf(By.xpath("//input[@id='frm1_un_id']"))).sendKeys("aaaaaaaaa");

                //above
               // chrome.findElement(RelativeLocator.
                        // with(By.tagName("input")).
                        //above(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");


                //below
                chrome.findElement(RelativeLocator.
                        with(By.xpath("//input[1]")).
                        below(By.xpath("//pre/b[contains(text(), 'Four')]"))).sendKeys("aaaaaaaaa");

              //near
             //   chrome.findElement(RelativeLocator.
                       // with(By.xpath("//input[1]")).
                     //   near(By.xpath("//pre/b[contains(text(), 'Four')]"))).sendKeys("aaaaaaaaa");


            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                chrome = null;
            }
        }
    }
