package org.adlsoft;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;

import org.apache.commons.io.FileUtils;
import org.junit.*;

import java.io.*;

import static org.adlsoft.Screenshot.captureScreenshot;

public class TensorQuery {

    private WebDriver driver;

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
//        driver = (WebDriver) new PhantomJsDriverManager();
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
        long startAtByte = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader
                (new FileInputStream("csv/login.csv"), "windows-1251"));//windows-1251

        while ((lineLogin = reader.readLine()) != null) {
            if (lineLogin.length() > 1) {
                String str[] = lineLogin.split(";");
                if (str.length > 1) {
                    String basedURL = str[0];
                    driver.get(basedURL);

                  //баянова
//                driver.get(basedURL + "/petition.html?id=e544f187-e6c9-491b-ae9c-599083f9fa03");
//                driver.findElement(By.xpath("//div[@id='ws-1flvutwf8hl1504609716252']/div")).click();
//                driver.findElement(By.cssSelector("input.controls-TextBox__field.js-controls-TextBox__field")).clear();
//                driver.findElement(By.cssSelector("input.controls-TextBox__field.js-controls-TextBox__field")).sendKeys("66859");
//                driver.findElement(By.cssSelector("span[name=\"confirmButton\"] > span.controls-Button__text.js-controls-Button__text")).click();
//                driver.findElement(By.linkText("Ханты-Мансийский автономный округ - Югра, Сургутский р-н, г.Лянтор, мкр.3-й, 70/1")).click();
//                driver.findElement(By.cssSelector("div.ws-window-overlay")).click();
//                driver.findElement(By.xpath("//div[@id='ws-vhykx7e7jj71504601169872']/a/div")).click();
//                driver.findElement(By.cssSelector("#ws-hrf5xav57v81504601169874 > div.ws-field.ws-field-dropdown > div.custom-select")).click();
//                driver.findElement(By.xpath("//div[@id='ws-54fp36kple1504601169877']/div")).click();
//                driver.findElement(By.xpath("//div[@id='ws-n8o07fhwy2p1504609763694']/div[4]/div[2]/div[2]/div")).click();
//                driver.findElement(By.id("ws-glodbmd4p1p1504609765808")).click();
//                driver.findElement(By.xpath("//div[@id='ws-qk8ijgibdcd1504609763725']/a/div")).click();
//                driver.findElement(By.cssSelector("#ws-kbuir9ybvh1504609763729 > div.ws-field.ws-field-dropdown > div.custom-select")).click();
//                driver.findElement(By.xpath("//div[@id='ws-vhykx7e7jj71504601169872']/a/div")).click();
//                driver.findElement(By.cssSelector("#ws-hrf5xav57v81504601169874 > div.ws-field.ws-field-dropdown > div.custom-select")).click();
//                driver.findElement(By.cssSelector("#ws-hrf5xav57v81504601169874 > div.ws-field.ws-field-dropdown > div.custom-select > div.custom-select-text")).click();
//                driver.findElement(By.cssSelector("#ws-kbuir9ybvh1504609763729 > div.ws-field.ws-field-dropdown > div.custom-select > div.custom-select-arrow")).click();
//                driver.findElement(By.cssSelector("div.custom-select-option.custom-select-option-hover")).click();
//                driver.findElement(By.xpath("//span/div/div[2]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-bef96km4yud1504609763732']/div")).click();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).clear();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).sendKeys("Баянова Варвара Николаевна");
//                driver.findElement(By.xpath("//div[@id='fld-Паспорт.Дата']/em")).click();
//                driver.findElement(By.id("fld-Паспорт.КемВыдан")).clear();
//                driver.findElement(By.id("fld-Паспорт.КемВыдан")).sendKeys("МП П.НИЖНЕСОРТЫМСКИЙ ОУФМС РОССИИ ПО ХАНТЫ-МАНСИЙСКОМУ АВТОНОМ. ОКР.-ЮГРЕ В СУРГУТСКОМ РАЙОНЕ");
//                driver.findElement(By.xpath("(//div[@id='fld-Паспорт.ПолПерекдючатель']/label/span)[3]")).click();
//                driver.findElement(By.id("Паспорт.ПолПерекдючатель-F")).click();
//                driver.findElement(By.xpath("//div[@id='fld-Паспорт.ДатаРождения']/em")).click();
//                driver.findElement(By.id("fld-Паспорт.МестоРождения")).clear();
//                driver.findElement(By.id("fld-Паспорт.МестоРождения")).sendKeys("Г.ТИРАСПОЛЬ");
//                driver.findElement(By.id("fld-Значение")).clear();
//                driver.findElement(By.id("fld-Значение")).sendKeys("16981123290");
//                driver.findElement(By.cssSelector("#ws-lbbigphxd9e1504609765221 > div.ws-field > #fld-Значение")).clear();
//                driver.findElement(By.cssSelector("#ws-lbbigphxd9e1504609765221 > div.ws-field > #fld-Значение")).sendKeys("Ведущий специалист");
//                driver.findElement(By.cssSelector("#ws-6qi41xkf2x31504609765234 > span.js-controls-RadioButton__caption.controls-RadioButton__caption")).click();
//                driver.findElement(By.cssSelector("#ws-odanyayhfj1504609925159 > div.ws-field > #fld-Значение")).click();
//                driver.findElement(By.cssSelector("#ws-odanyayhfj1504609925159 > div.ws-field > #fld-Значение")).clear();
//                driver.findElement(By.cssSelector("#ws-odanyayhfj1504609925159 > div.ws-field > #fld-Значение")).sendKeys("ТОСП п. Нижнесортымский");
//                driver.findElement(By.cssSelector("#ws-rmh17lfxzvh1504609763821 > span.js-controls-RadioButton__caption.controls-RadioButton__caption")).click();
//                driver.findElement(By.id("fld-ПаспортПолучателя.Серия")).clear();
//                driver.findElement(By.id("fld-ПаспортПолучателя.Серия")).sendKeys("6715");
//                driver.findElement(By.id("fld-ПаспортПолучателя.Номер")).clear();
//                driver.findElement(By.id("fld-ПаспортПолучателя.Номер")).sendKeys("533909");
//                driver.findElement(By.id("fld-ФИО владельца подписи")).clear();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).sendKeys("Баянова Варвара Николаевна");
//                driver.findElement(By.cssSelector("#ws-s5v4h7nqgfh1504609763481 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.xpath("//span[@id='ws-0gmlexv4xzy51504609941130']/span")).click();
//                driver.findElement(By.cssSelector("span.controls-MenuItem__text.js-controls-MenuItem__text")).click();
//                driver.findElement(By.name("file1")).clear();
//                driver.findElement(By.name("file1")).sendKeys("C:\\Users\\AvhimkovDL.MFCLYANTOR\\Desktop\\2017эцп\\Баянова\\Паспорт.pdf");
//                driver.findElement(By.xpath("//span[@id='ws-9atv7z4l9061504609941162']/span")).click();
//                driver.findElement(By.cssSelector("#ws-a8wz5jlgiut1504609985264 > span.controls-MenuItem__content")).click();
//                driver.findElement(By.cssSelector("#ws-n08570v7pzt1504609941174 > form.ws-file-browse-form > input[name=\"file1\"]")).clear();
//                driver.findElement(By.cssSelector("#ws-n08570v7pzt1504609941174 > form.ws-file-browse-form > input[name=\"file1\"]")).sendKeys("C:\\Users\\AvhimkovDL.MFCLYANTOR\\Desktop\\2017эцп\\Баянова\\СНИЛС.pdf");
//                driver.findElement(By.xpath("//div[@id='ws-ns1z08r11pg1504609763689']/div[2]/div/div/div[3]/div/div[6]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-ns1z08r11pg1504609763689']/div[2]/div/div/div[3]/div/div[3]/div[2]")).click();
//                driver.findElement(By.xpath("//span[@id='ws-1qceji9qrvu1504609941185']/span")).click();
//                driver.findElement(By.cssSelector("#ws-uu04hhpeemo1504610000900 > span.controls-MenuItem__content > span.controls-MenuItem__text.js-controls-MenuItem__text")).click();
//                driver.findElement(By.cssSelector("#ws-ukz18lu9j7i1504609941198 > form.ws-file-browse-form > input[name=\"file1\"]")).clear();
//                driver.findElement(By.cssSelector("#ws-ukz18lu9j7i1504609941198 > form.ws-file-browse-form > input[name=\"file1\"]")).sendKeys("C:\\Users\\AvhimkovDL.MFCLYANTOR\\Desktop\\2017эцп\\_Получатель_\\Юдина Ю.В\\ЮЮВ_Паспорт-2016 года.pdf");
//                driver.findElement(By.cssSelector("#ws-luiwvx6qzxp1504609941252 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.id("fld-Файл.Документ.Должность")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Должность")).sendKeys("И.О. ДИРЕКТОРА");
//                driver.findElement(By.id("fld-Файл.Документ.ФИО")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ФИО")).sendKeys("Высоколенко Елена Николаевна");
//                driver.findElement(By.id("fld-Файл.Документ.ОснованиеПолномочий")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ОснованиеПолномочий")).sendKeys("Устава");
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Серия")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Серия")).sendKeys("6716");
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Номер")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Номер")).sendKeys("655415");
//                driver.findElement(By.xpath("//div[@id='fld-Файл.Документ.Паспорт.КогдаВыдан']/em")).click();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.КемВыдан")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.КемВыдан")).sendKeys("МП П.НИЖНЕСОРТЫМСКИЙ ОУФМС РОССИИ ПО ХАНТЫ-МАНСИЙСКОМУ АВТОНОМ. ОКР.-ЮГРЕ В СУРГУТСКОМ РАЙОНЕ");
//                driver.findElement(By.cssSelector("div.calendar-container")).click();
//                driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
//                driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
//                driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
//                driver.findElement(By.linkText("31")).click();
//                driver.findElement(By.cssSelector("#ws-5o8yplggteo1504610010894 > div.ws-button-caption")).click();
//                driver.findElement(By.cssSelector("#ws-4rbsip9vexk1504609941278 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.id("fld-Файл.Документ.Должность1")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Должность1")).sendKeys("И.О. ДИРЕКТОРА");
//                driver.findElement(By.id("fld-Файл.Документ.Должность2")).click();
//                driver.findElement(By.id("fld-Файл.Документ.Должность2")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Должность2")).sendKeys("И.О. ДИРЕКТОРА");
//                driver.findElement(By.id("fld-Файл.Документ.ФИО")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ФИО")).sendKeys("Высоколенко Елена Николаевна");
//                driver.findElement(By.id("fld-Файл.Документ.ОснованиеПолномочий")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ОснованиеПолномочий")).sendKeys("Устава");
//                driver.findElement(By.id("fld-Файл.Документ.ФИОПредставителя")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ФИОПредставителя")).sendKeys("Юдина Юлия Владимирована");
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Серия")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Серия")).sendKeys("6715");
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Номер")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.Номер")).sendKeys("533909");
//                driver.findElement(By.xpath("//div[@id='fld-Файл.Документ.Паспорт.КогдаВыдан']/em")).click();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.КемВыдан")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.Паспорт.КемВыдан")).sendKeys("ОТДЕЛЕНИЕМ В ГОР.ЛЯНТОРЕ ОУФМС РОССИИ ПО ХАНТЫ-МАНСИЙСКОМУ АВТОНОМ.ОКР.-ЮГРЕ В СУРГУТСКОМ РАЙОНЕ");
//                driver.findElement(By.cssSelector("div.calendar-container")).click();
//                driver.findElement(By.linkText("След>")).click();
//                driver.findElement(By.linkText("След>")).click();
//                driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
//                driver.findElement(By.linkText("31")).click();
//                driver.findElement(By.id("fld-Файл.Документ.ФИОВладельцаСКПКраткое")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ФИОВладельцаСКПКраткое")).sendKeys("Баянова В.Н.");
//                driver.findElement(By.id("fld-Файл.Документ.ФИОПолучДов")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ФИОПолучДов")).sendKeys("Юдина Ю.В.");
//                driver.findElement(By.id("fld-Файл.Документ.ФИОКраткое")).clear();
//                driver.findElement(By.id("fld-Файл.Документ.ФИОКраткое")).sendKeys("Высоколенко Е.Н.");
//                driver.findElement(By.cssSelector("#ws-2gqnrz1pc581504610064991 > div.ws-button-caption")).click();
//                driver.findElement(By.cssSelector("#ws-s5v4h7nqgfh1504609763481 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.xpath("//div[@id='ws-54fp36kple1504601169877']/div")).click();
//                driver.findElement(By.cssSelector("#ws-2iqxur16b5u1504601169672 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.cssSelector("#ws-dg2b84qw8tb1504599961338 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.cssSelector("#ws-qwz1pyjhnje1504598406949 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();

                    //комарчук
//                driver.get(baseUrl + "/petition.html?id=e587a92f-aa07-4aff-b55b-dd976f6b5c9f");
//                driver.findElement(By.xpath("//div[@id='ws-rg32jr1nraf1504598337597']/div")).click();
//                driver.findElement(By.cssSelector("input.controls-TextBox__field.js-controls-TextBox__field")).clear();
//                driver.findElement(By.cssSelector("input.controls-TextBox__field.js-controls-TextBox__field")).sendKeys("77804");
//                driver.findElement(By.cssSelector("span[name=\"confirmButton\"] > span.controls-Button__text.js-controls-Button__text")).click();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).click();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).clear();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).sendKeys("Комарчук Роза Фларитовна");
//                driver.findElement(By.xpath("//div[@id='fld-Паспорт.Дата']/em")).click();
//                driver.findElement(By.id("fld-Паспорт.КемВыдан")).clear();
//                driver.findElement(By.id("fld-Паспорт.КемВыдан")).sendKeys("ОТДЕЛЕНИЕМ В ГОР. ЛЯНТОРЕ ОУФМС РОССИИ ПО ХАНТЫ-МАНСИЙСКОМУ АВТОНОМНОМУ ОКРУГУ  ЮГРЕ В СУРГУТСКОМ РАЙОНЕ");
//                driver.findElement(By.xpath("//div[@id='fld-Паспорт.ДатаРождения']/em")).click();
//                driver.findElement(By.xpath("(//div[@id='fld-Паспорт.ПолПерекдючатель']/label/span)[3]")).click();
//                driver.findElement(By.id("Паспорт.ПолПерекдючатель-F")).click();
//                driver.findElement(By.id("fld-Паспорт.МестоРождения")).clear();
//                driver.findElement(By.id("fld-Паспорт.МестоРождения")).sendKeys("ПОС. ПИМ СУРГУТСКОГО Р-НА ТЮМЕНСКАЯ ОБЛ.");
//                driver.findElement(By.id("fld-Значение")).clear();
//                driver.findElement(By.id("fld-Значение")).sendKeys("11527292643");
//                driver.findElement(By.cssSelector("#ws-z0pvgsft1as1504598408613 > div.ws-field > #fld-Значение")).clear();
//                driver.findElement(By.cssSelector("#ws-z0pvgsft1as1504598408613 > div.ws-field > #fld-Значение")).sendKeys("");
//                driver.findElement(By.cssSelector("#ws-nrptisb68d1504598408624 > i.controls-RadioButton__icon")).click();
//                driver.findElement(By.id("ws-89e3udhdyua1504598407273")).click();
//                driver.findElement(By.cssSelector("#ws-yog2ppf57el1504598661316 > div.ws-field > #fld-Значение")).clear();
//                driver.findElement(By.cssSelector("#ws-yog2ppf57el1504598661316 > div.ws-field > #fld-Значение")).sendKeys("Ведущий специалист");
//                driver.findElement(By.cssSelector("#ws-rv8vkqry8v1504598661339 > div.ws-field > #fld-Значение")).clear();
//                driver.findElement(By.cssSelector("#ws-rv8vkqry8v1504598661339 > div.ws-field > #fld-Значение")).sendKeys("Отдел ПиВД");
//                driver.findElement(By.xpath("//span[@id='ws-ahm8ffjqa1m1504598661396']/span")).click();
//                driver.findElement(By.cssSelector("span.controls-MenuItem__text.js-controls-MenuItem__text")).click();
//                driver.findElement(By.name("file1")).clear();
//                driver.findElement(By.name("file1")).sendKeys("C:\\Users\\AvhimkovDL.MFCLYANTOR\\Desktop\\2017эцп\\Комарчук Роза Фларитовна\\Комарчук Роза Фларитовна.pdf");
//                driver.findElement(By.xpath("//span[@id='ws-sltzfvhq4e1504598661417']/span")).click();
//                driver.findElement(By.cssSelector("#ws-at1a2ypjjqq1504599002083 > span.controls-MenuItem__content > span.controls-MenuItem__text.js-controls-MenuItem__text")).click();
//                driver.findElement(By.cssSelector("#ws-znxfjvb23vm1504598661425 > form.ws-file-browse-form > input[name=\"file1\"]")).clear();
//                driver.findElement(By.cssSelector("#ws-znxfjvb23vm1504598661425 > form.ws-file-browse-form > input[name=\"file1\"]")).sendKeys("C:\\Users\\AvhimkovDL.MFCLYANTOR\\Desktop\\2017эцп\\Комарчук Роза Фларитовна\\СНИЛС Комарчук.jpg");
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[3]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[3]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[4]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[4]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[3]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[3]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[3]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[7]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[7]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[6]/div[2]")).click();
//                driver.findElement(By.xpath("//div[@id='ws-lkpn98vyi0r1504598407159']/div[2]/div/div/div[3]/div/div[6]/div[2]")).click();
//                driver.findElement(By.cssSelector("#ws-qwz1pyjhnje1504598406949 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();
//                driver.findElement(By.xpath("//div[@id='ws-kh0wnsciuxo1504598407199']/a/div")).click();
//                driver.findElement(By.xpath("//div[13]/span[2]/div[2]")).click();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).clear();
//                driver.findElement(By.id("fld-ФИО владельца подписи")).sendKeys("Комарчук Роза Фларитовна");
//                driver.findElement(By.cssSelector("#ws-qwz1pyjhnje1504598406949 > a.ws-link-body.ws-hover-target > div.ws-button-caption")).click();

                    //https://mail.ru/
//                    driver.findElement(By.id("mailbox__login")).clear();
//                    driver.findElement(By.id("mailbox__login")).sendKeys(str[1]);
//                    driver.findElement(By.id("mailbox__password")).clear();
//                    driver.findElement(By.id("mailbox__password")).sendKeys(str[2]);
//                    driver.findElement(By.id("mailbox__auth__button")).click();

                    //Screenshot pages
                    String screenpath = captureScreenshot(driver, str[1]);
                }
            }
        }
    }

}