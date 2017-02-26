import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calc {
    @Test
    public void Check() {
        System.setProperty("webdriver.firefox.bin",
                "c:\\Mozilla\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "c:\\Mozilla\\geckodriver.exe");
        String url = "http://www.sberbank.ru/ru/quotes/converter";
        String sale;
        String value;
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        WebElement Element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[3]/div[2]/div/header/em")));
        Element.click();
        WebElement element = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/div[1]/div/div[1]/table/tbody/tr/td[4]/span"));
        sale = element.getText();
        System.out.println("Валюта продажа: " + sale);
        WebElement element3 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[3]/div[2]/div/div/span[2]"));
        element3.click();
        WebElement element1 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[7]/button"));
        element1.click();
        WebElement element2 = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[2]/h4/span[1]")));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        Element.click();
        element1.click();
        Element.click();
        WebElement element4 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[3]/div[2]/div/div/span[3]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element4.click();
        element1.click();
        Element.click();
        WebElement element5 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[3]/div[2]/div/div/span[4]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element5.click();
        element1.click();
        Element.click();
        WebElement element6 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[3]/div[2]/div/div/span[5]"));
        element6.click();
        WebElement Element2 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/header/em"));
        Element2.click();
        WebElement element7 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/div/span[1]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element7.click();
        element1.click();
        Element2.click();
        WebElement element8 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/div/span[2]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element8.click();
        element1.click();
        Element2.click();
        WebElement element9 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/div/span[3]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element9.click();
        element1.click();
        Element2.click();
        WebElement element10 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/div/span[4]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element10.click();
        element1.click();
        Element2.click();
        WebElement element11 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/div/span[5]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element11.click();
        element1.click();
        Element2.click();
        WebElement element12 = driver.findElement(By.xpath(".//*[@id='main']/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div/div/aside/div[1]/div[1]/div[4]/div[2]/div/div/span[6]"));
        value = element2.getText();
        System.out.println("Расчетная стоимость: " + value);
        element12.click();
        element1.click();

    }
}


