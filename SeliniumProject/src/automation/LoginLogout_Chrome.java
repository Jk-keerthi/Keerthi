package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginLogout_Chrome {
        public static void main(String[] args) {
            loginTestCase();
        }

        public static void loginTestCase() {
            ChromeDriver Chrome = null;
            try {

                //1 .Open chrome browser
                Chrome = new  ChromeDriver();
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
                Thread.sleep(2000);;

                //6. verify login is successful
                String text = Chrome.findElement(By.xpath("//td[@class='pagetitle']")).getText();
                if(text.equalsIgnoreCase("Enter Time-Track")) {
                    System.out.println("Login to ActiTime is successful");
                }else {
                    System.out.println("Failed to login to ActiTime");
                    return;
                }

                //7. logout from actitime(wait for page to load)
                Chrome.findElement(By.xpath("//a[@id='logoutLink']")).click();
                Thread.sleep(2000);

                //8. Verify logout successful
                if(Chrome.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img[1]")).isDisplayed()) {
                    System.out.println("Logout from actiTime is succesful");
                }else {
                    System.out.println("FAiled to logout from actiTime");
                    return;
                }



                //9. close the browser
                Chrome.close();
            }catch(Exception e) {
                e.printStackTrace();
            }finally {
                Chrome = null;
            }
        }
    }
