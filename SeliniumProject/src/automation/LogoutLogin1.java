package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static automation.LoginLogout_Chrome.loginTestCase;

public class LogoutLogin1 {
    public static void main(String[] args) {
        loginTestCase();
    }

    public static void loginAndCreateUser() throws InterruptedException {
        WebDriver Chrome = null;
        try {
            //1 .Open chrome browser
            Chrome = new ChromeDriver();
            Chrome.manage().window().maximize();

            //2. nagavition the actitime URL
            Chrome.get("http://localhost/login.do");
            Thread.sleep(2000);

            //3. enter user name
            Chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

            //4. enter password
            Chrome.findElement(By.name("pwd")).sendKeys("manager");

            //5. click on login button(wait for page to load
            Chrome.findElement(By.cssSelector("a[id='loginButton'] div")).click();
            Thread.sleep(2000);

            //6. verify login is successful
            String text = Chrome.findElement(By.xpath("//td[@class='pagetitle']")).getText();
            if (text.equalsIgnoreCase("Enter Time-Track")) {
                System.out.println("Login to ActiTime is successful");
            } else {
                System.out.println("Failed to login to ActiTime");
                return;
            }

            //7. logout from actitime(wait for page to load)
            Chrome.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);

            //8. Verify logout successful
            if (Chrome.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
                System.out.println("Logout from actiTime is succesful");
            } else {
                System.out.println("FAiled to logout from actiTime");
                return;
            }

            //9. close the browser
            Chrome.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Chrome = null;
        }

        // 10. Click on "Add User" button
        Chrome.findElement(By.xpath("//div[normalize-space()='USERS']")).click();
        Thread.sleep(2000);

//
        // 9. Fill User Details
        Chrome.findElement(By.name("firstName")).sendKeys("J k");
        Chrome.findElement(By.name("lastName")).sendKeys("Keerthi");
        Chrome.findElement(By.name("email")).sendKeys("keerthi2364@gmail.com");
        Chrome.findElement(By.name("username")).sendKeys("keerthi_user");
        Chrome.findElement(By.name("password")).sendKeys("keerthi123");
        Chrome.findElement(By.name("passwordCopy")).sendKeys("keerthi123");

        // 10. Click Create User button
        Chrome.findElement(By.xpath("//input[@value='Create User']")).click();
        Thread.sleep(3000);

        System.out.println("New user created successfully!");

        //7. logout from actitime(wait for page to load)
        Chrome.findElement(By.xpath("//a[@id='logoutLink']")).click();
        Thread.sleep(2000);

        //8. Verify logout successful
        if (Chrome.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
            System.out.println("Logout from actiTime is succesful");
        } else {
            System.out.println("FAiled to logout from actiTime");
            return;
        }

    }
}

