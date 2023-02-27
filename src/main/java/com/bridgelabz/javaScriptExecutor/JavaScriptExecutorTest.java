package com.bridgelabz.javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("D:\\IntelliJ IDEA\\CQA115\\src\\main\\resources\\Test.html");

        JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
        Thread.sleep(3000);

//        driver.findElement(By.id("username")).sendKeys("Username");

        javaScriptExecutor.executeScript("document.getElementById('username').value='test'");
        Thread.sleep(3000);
//        driver.findElement(By.id("password")).sendKeys("Password");

        javaScriptExecutor.executeScript("document.getElementById('password').value='Password'");
        Thread.sleep(5000);
        driver.close();


    }
}
