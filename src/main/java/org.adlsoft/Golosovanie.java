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

public class Golosovanie {
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

        String lineLogin;
//        BufferedReader reader = new BufferedReader(new InputStreamReader
//                (new FileInputStream("csv/golos.csv"), "UTF-8"));//windows-1251

        List<String[]> login;
        login = ReadFiles.readFile("csv/golos.csv");
//        while ((lineLogin = reader.readLine()) != null) {
//            String str[] = lineLogin.split(";");
//            if (str.length > 1) {
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
        driver.findElement(By.name("fileNumber")).sendKeys(login.get(0));
        driver.findElement(By.name("authCode")).clear();
        driver.findElement(By.name("authCode")).sendKeys(login.get(1));
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(300);
        String[] str = login.get(0);
        String screenpath = captureScreenshot(driver, str[0]);

        //golosovanie
//        driver.findElement(By.xpath("//div[@id='page0']/div[2]/div/div[2]/ul/li[" + login.get(2) + "]/label/span")).click();
//        driver.findElement(By.xpath("//button[@type='button']")).click();
//        driver.findElement(By.xpath("//div[@id='page1']/div[2]/div/div[2]/ul/li[" + login.get(3) + "]/label/span")).click();
//        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
//        driver.findElement(By.xpath("//div[@id='page2']/div[2]/div/div[2]/ul/li[" + login.get(4) + "]/label/span")).click();
//        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
//        driver.findElement(By.xpath("//div[@id='page3']/div[2]/div/div[2]/ul/li[" + login.get(5) + "]/label/span")).click();
//        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
//        driver.findElement(By.xpath("//div[@id='page4']/div[2]/div/div[2]/ul/li[" + login.get(6) + "]/label/span")).click();
//        driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
//        driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
//        //Screenshot pages
//
//        String screenpath1 = captureScreenshot(driver, str[0]);
    }
}