package java.org.adlsoft;

import java.io.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.lang.*;

public class TensorQuery {

    @Test
    public void testCase() throws InterruptedException, IOException {
        String lineLogin;
        System.setProperty("webdriver.chrome.driver", "driver/win/x32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("csv/login.csv"), "windows-1251"));
        while ((lineLogin = reader.readLine()) != null) {

            String str[] = lineLogin.split(";");
            if (str.length > 1) {
                String basedURL = str[0];
                driver.get(basedURL);

                //mail.ru
                driver.findElement(By.id("mailbox__login")).clear();
                driver.findElement(By.id("mailbox__login")).sendKeys(str[1]);
                driver.findElement(By.id("mailbox__password")).clear();
                driver.findElement(By.id("mailbox__password")).sendKeys(str[2]);
                driver.findElement(By.id("mailbox__auth__button")).click();

//                        int fe_id = 0;
//                        switch (fe_id) {
//                            case 1:
//                                driver.findElement(By.id("title_operator")).click();
//                                break;
//                            case 2:
//                                driver.findElement(By.id("title_controller")).click();
//                                break;
//                            case 3:
//                                driver.findElement(By.id("title_docved")).click();
//                                break;
//                            case 4:
//                                driver.findElement(By.id("title_esia")).click();
//                                break;
//                            default:
//                                break;
//                        }

            }
        }
        driver.quit();
    }
}