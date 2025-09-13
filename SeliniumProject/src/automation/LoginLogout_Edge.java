package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginLogout_Edge {

    public static void main(String[] args) {
        loginTestCase();
    }

    public static void loginTestCase() {
        EdgeDriver edge = null;
        try {

            //1 .Open chrome browser
            edge = new EdgeDriver();
            edge.manage().window().maximize();

            //2. nagavition the actitime URL
            edge.get("http://localhost/login.do");
            Thread.sleep(2000);

            //3. enter user name
            edge.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

            //4. enter password
            edge.findElement(By.name("pwd")).sendKeys("manager");

            //5. click on login button(wait for page to load
            edge.findElement(By.cssSelector("a[id='loginButton'] div")).click();

            //6. verify login is successful
            String text = edge.findElement(By.xpath("//td[@class='pagetitle']")).getText();
            if(text.equalsIgnoreCase("Enter Time-Track")) {
                System.out.println("Login to ActiTime is successful");
            }else {
                System.out.println("Failed to login to ActiTime");
                return;
            }

            //7. logout from actitime(wait for page to load)
            edge.findElement(By.xpath("//a[@id='logoutLink']")).click();
            Thread.sleep(2000);

            //8. Verify logout successful
            if(edge.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
                System.out.println("Logout from actiTime is succesful");
            }else {
                System.out.println("FAiled to logout from actiTime");
                return;
            }

            //9. close the browser
            edge.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            edge = null;
        }
    }
}


