package org.adlsoft;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.List;

import static org.adlsoft.Screenshot.captureScreenshot;

public class Vote {
    private WebDriver driver;
//    private PhantomJsDriverManager driverp;

    @BeforeClass
    public static void setupClass() {
        ChromeDriverManager.getInstance().setup();
//        FirefoxDriverManager.getInstance().setup();
//        OperaDriverManager.getInstance().setup();
//        PhantomJsDriverManager.getInstance().setup();
//        EdgeDriverManager.getInstance().setup();
//        InternetExplorerDriverManager.getInstance().setup();
    }

    @Before
    public void setupTest() {
//        driver = new InternetExplorerDriver();
//        driverp = new PhantomJsDriverManager();
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testCase() throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver, 30);

        List<String[]> login;
        login = ReadFiles.readFile("csv/golos.csv");

        int i = 0;
        while (i < login.size()) {
            String[] str = login.get(i);
            String basedURL = "http://mfc.admhmao.ru/mfctablet/quality.htm";
            driver.get(basedURL);

            //https://mail.ru/
//                driver.findElement(By.id("mailbox__login")).clear();
//                driver.findElement(By.id("mailbox__login")).sendKeys(str[1]);
//                driver.findElement(By.id("mailbox__password")).clear();
//                driver.findElement(By.id("mailbox__password")).sendKeys(str[2]);
//                driver.findElement(By.id("mailbox__auth__button")).click();

            //login
            driver.findElement(By.name("fileNumber")).clear();
            driver.findElement(By.name("fileNumber")).sendKeys(login.get(i));
            driver.findElement(By.name("authCode")).clear();
            driver.findElement(By.name("authCode")).sendKeys(login.get(i + 1));
            driver.findElement(By.xpath("//button[@type='button']")).click();
            Thread.sleep(300);

            String screenpath = captureScreenshot(driver, str[0]);
            i++;
        }

        List<String[]> ocenci;
        ocenci = ReadFiles.readFile("csv/ocenka.csv");
        //golosovanie
        driver.findElement(By.xpath("//div[@id='page0']/div[2]/div/div[2]/ul/li[" + ocenci.get(1) + "]/label/span")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//div[@id='page1']/div[2]/div/div[2]/ul/li[" + ocenci.get(2) + "]/label/span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='page2']/div[2]/div/div[2]/ul/li[" + ocenci.get(3) + "]/label/span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("//div[@id='page3']/div[2]/div/div[2]/ul/li[" + ocenci.get(4) + "]/label/span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("//div[@id='page4']/div[2]/div/div[2]/ul/li[" + ocenci.get(5) + "]/label/span")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        //Screenshot pages
//        String screenpath1 = captureScreenshot(driver, str[0]);

    }
}