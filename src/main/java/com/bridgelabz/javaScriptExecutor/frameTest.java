package com.bridgelabz.javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\IntelliJ IDEA\\CQA115\\src\\main\\resources\\page3.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;

         Thread.sleep(3000);
        driver.findElement(By.id("t3")).sendKeys("T3 text field");

        driver.switchTo().frame("f2");

        Thread.sleep(2000);
        driver.findElement(By.id("t2")).sendKeys("T2 text field");

        Thread.sleep(2000);
        driver.switchTo().frame("f1");

        driver.findElement(By.id("t1")).sendKeys("T1 text field");

        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("t3")).clear();

        driver.switchTo().frame("f2");
        Thread.sleep(2000);

        driver.findElement(By.id("t2")).clear();

        driver.switchTo().frame("f1");
        Thread.sleep(3000);

        driver.findElement(By.id("t1")).clear();

        Thread.sleep(3000);
        driver.quit();
    }
}
