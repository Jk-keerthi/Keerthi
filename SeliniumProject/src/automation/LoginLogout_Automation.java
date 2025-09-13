package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout_Automation {

    public static void main(String[] args) {
        loginTestCase("chrome");
    }
    public static void loginTestCase(String browseName) {
        WebDriver oBrowser = null;
        try {
            //1. Open chrome browser
            switch (browseName.toLowerCase()) {
                case "chrome":
                    oBrowser = new ChromeDriver();
                    break;
                case "edge":
                    oBrowser = new EdgeDriver();
                    break;
                case "firefox":
                    oBrowser = new FirefoxDriver();
                    break;
            }

            oBrowser.manage().window().maximize();


            //2. navigate the actiTime URL (wait for page to load)
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(2000);


            //3. enter user name
            oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");


            //4. enter password
            oBrowser.findElement(By.name("pwd")).sendKeys("manager");


            //5. click on Login button (wait for page to load)
            oBrowser.findElement(By.cssSelector("a[id='loginButton'] div")).click();
            Thread.sleep(2000);

            if (oBrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).isDisplayed()) {
                oBrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
            }

            //6. Verify login is successful
            String text = oBrowser.findElement(By.xpath("//td[@class='pagetitle']")).getText();
            if (text.equalsIgnoreCase("Enter Time-Track")) {
                System.out.println("Login to ActiTime is successful");
            } else {
                System.out.println("Failed to login to actiTime");
                return;
            }


            //7. Logout from actiTime (wait for page to load)
            oBrowser.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);


            //8. Verify logout successful
            if (oBrowser.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
                System.out.println("Logout from actiTime is succesful");
            } else {
                System.out.println("FAiled to logout from actiTime");
                return;
            }


            //9. close the browser
            oBrowser.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser = null;
        }
    }
}
