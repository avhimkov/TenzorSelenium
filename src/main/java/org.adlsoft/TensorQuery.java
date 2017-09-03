package org.adlsoft;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;

public class TensorQuery {

    @Test
    public void testCase() throws InterruptedException, IOException {
        String lineLogin;
        ChromeDriverManager.getInstance().setup();
//        System.setProperty("webdriver.chrome.driver", "driver/win/x32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("csv/login.csv"), "windows-1251"));
        while ((lineLogin = reader.readLine()) != null) {

            String str[] = lineLogin.split(";");
            if (str.length > 1) {
                String basedURL = str[0];
                driver.get(basedURL);

                //https://mail.ru/
                driver.findElement(By.id("mailbox__login")).clear();
                driver.findElement(By.id("mailbox__login")).sendKeys(str[1]);
                driver.findElement(By.id("mailbox__password")).clear();
                driver.findElement(By.id("mailbox__password")).sendKeys(str[2]);
                driver.findElement(By.id("mailbox__auth__button")).click();

                //https://uploadfiles.io/
//                driver.findElement(By.cssSelector("input.dz-hidden-input")).sendKeys(str[1]);

//                Thread.sleep(2000);
            }
        }
        driver.quit();
    }
}
