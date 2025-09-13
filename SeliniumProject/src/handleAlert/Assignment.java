package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Assignment {
    public static void main(String[] arg) {
        handleChildWindow();
    }

    public static void handleChildWindow() {
        WebDriver oBrowser = null;
        String sParent = null;
        Set<String> oChild = null;
        try {
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();

            oBrowser.navigate().to("https://www.linkedin.com/login");
            Thread.sleep(2000);

            // oBrowser.switchTo().frame(oBrowser.findElement(By.xpath("//iframe[@*='Sign in with Google Button']")));
            //oBrowser.switchTo().frame(oBrowser.findElement(By.xpath("//iframe[@*='Sign in with Apple']")));

            sParent = oBrowser.getWindowHandle();
            System.out.println("Parent Window ID: " + sParent);


            oBrowser.findElement(By.xpath("//span[@class = 'sign-in-with-apple-button__text']")).click();
            Thread.sleep(2000);

            oChild = oBrowser.getWindowHandles();
            for (String childWnd : oChild) {
                if (!childWnd.equals(sParent)) {
                    oBrowser.switchTo().window(childWnd);
                    System.out.println(oBrowser.getTitle());
                    System.out.println(oBrowser.getCurrentUrl());

                    oBrowser.close();
                    break;
                }
            }

            oBrowser.switchTo().window(sParent);

            Thread.sleep(2000);
            oBrowser.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }
}