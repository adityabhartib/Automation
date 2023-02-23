package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup_with_css_selector {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input#u_f_b_wk")).sendKeys("Aditya");

        Thread.sleep(2000);

        driver.close();
        driver.findElement(By.name("lastname")).sendKeys("Bharti");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("adityabharti.ab@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("adityabharti.ab@gmail.com");

        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("@aditya123");

        Thread.sleep(2000);

        driver.findElement(By.id("day")).sendKeys("10");

        Thread.sleep(2000);

        driver.findElement(By.id("month")).sendKeys("Jan");

        Thread.sleep(2000);

        driver.findElement(By.id("year")).sendKeys("1920");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("websubmit")).click();

        driver.close();
    }
}