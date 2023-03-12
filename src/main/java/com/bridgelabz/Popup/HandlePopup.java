package com.bridgelabz.Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopup {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#email.inputtext._55r1")).sendKeys("9812040783");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("Aditya@120");
        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

//        driver.switchTo().alert();
    }
}
