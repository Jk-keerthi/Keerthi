package scripting;

import org.openqa.selenium.WebDriver;
import static scripting.ReusableMethod.*;

public class TestScript extends ReusableMethod {
    public static void main(String[] arg) {
        tsLoginLogout();
       // tsCreatAndDelete();
    }

    public static void tsLoginLogout() {
        WebDriver oBrowser = null;
        try {
            oBrowser = launchBrowser("Edge");
            boolean blnRes = navigateURL(oBrowser, "http://localhost/login.do");
            blnRes = loginToApplication(oBrowser, "admin", "manager");

            String create = createUser(oBrowser);
            boolean delete = deleteUser(oBrowser, "user1, test");
            blnRes = logoutFromActiTime(oBrowser);

        } catch (Exception e) {
            System.out.println("Exception in tsLoginLogout test script: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (oBrowser != null) {
                try {
                    oBrowser.quit();
                } catch (Exception ex) {
                    System.out.println("Exception while closing browser: " + ex.getMessage());
                }
                oBrowser = null;
            }
        }
        }
    }
