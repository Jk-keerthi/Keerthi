package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial_Matchs {
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

//            //Q: Enter first username value?
//            chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);
//
//            //Q: Enter first username value?
//            chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);
//
//            //Enter first username value?
//            chrome.findElement(By.cssSelector("input[id$='1_un_id']")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);
//
//            //Q: Enter first username value?
//            chrome.findElement(By.cssSelector("form[id='frml']>input[id*='1_un_id']")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);
//
//            //using regualr expression
//            //Q: Identify the first username?
//            chrome.findElement(By.cssSelector("*[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);
//
//            //using parent hierarchy
//            //Q: Identify the first username?
//            chrome.findElement(By.cssSelector("*form[id='frm1']>input[id='frm1_un_id']")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);

//            //child concept
//            // Q: Identify the first element in the form parent tag?
//            chrome.findElement(By.cssSelector("form[id='frm1']>:first-child")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);

//           // last-child
//            //Q: Identify the last element in the form parent tag?
//            chrome.findElement(By.cssSelector("form[id='frm1']>:last-child")).sendKeys("aaaaaaaaaaaaa");
//            Thread.sleep(2000);

            //nth child
            //Q: Identify the middle element in the form parent tag?
            chrome.findElement(By.cssSelector("form[id='frm1']>:nth-child(5)")).sendKeys("aaaaaaaaaaaaa");
           Thread.sleep(2000);





                    chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}

