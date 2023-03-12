package com.bridgelabz.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/input[2]")).sendKeys("C:\\Users\\adity\\OneDrive\\Desktop\\Path.txt.txt");

        Thread.sleep(10000);
        driver.close();

    }
}
