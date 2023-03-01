package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        WebElement user=driver.findElement(By.id("email"));

        Actions actions=new Actions(driver);

        actions.contextClick(user).click();
        Thread.sleep(3000);
        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_CONTROL);

        r.keyPress(KeyEvent.VK_N);

        r.keyRelease(KeyEvent.VK_N);

        r.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(9000);

        driver.quit();
    }
}
