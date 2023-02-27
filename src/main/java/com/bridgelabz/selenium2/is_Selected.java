package com.bridgelabz.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Selected {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement user = driver.findElement(By.cssSelector("#email.inputtext._55r1"));

        boolean username = user.isSelected();
        System.out.println(username);

        WebElement pass = driver.findElement(By.name("pass"));

        boolean password = pass.isSelected();
        System.out.println(password);

        Thread.sleep(3000);

        driver.close();
    }
}