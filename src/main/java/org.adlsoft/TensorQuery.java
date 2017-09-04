package org.adlsoft;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.*;

public class TensorQuery {

    @BeforeClass
    public static void setupClass() {
//        FirefoxDriverManager.getInstance().setup();
//        OperaDriverManager.getInstance().setup();
//        PhantomJsDriverManager.getInstance().setup();
//        EdgeDriverManager.getInstance().setup();
//        InternetExplorerDriverManager.getInstance().setup();

        ChromeDriverManager.getInstance().setup();
    }

    @Test
    public void testCase() throws InterruptedException, IOException {
        String lineLogin;
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

                String screenpath = captureScreenshot(driver, str[1]);
                //https://uploadfiles.io/
//                driver.findElement(By.cssSelector("input.dz-hidden-input")).sendKeys(str[1]);

                Thread.sleep(2000);
            }
        }
        driver.quit();
    }



    public static String captureScreenshot (WebDriver driver, String screenshotName){

        try {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String dest = "d:/" + screenshotName + ".png";
            File destination = new File(dest);
            FileUtils.copyFile(source, destination);
            return dest;
        }

        catch (IOException e) {return e.getMessage();}
    }

}
