package com.bridgelabz.Popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class AutoFileUpload {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions=new ChromeOptions();

        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/excel_to_pdf");

        driver.findElement(By.xpath("//span[contains(text(),'Select EXCEL files')]")).click();

        Thread.sleep(5000);

        Runtime.getRuntime().exec("C:\\Users\\adity\\OneDrive\\Desktop\\fileUpload.exe");

        Thread.sleep(8000);

        driver.findElement(By.xpath("//button[@id='processTask']")).click();

        Thread.sleep(5000);
        driver.close();
    }
}
