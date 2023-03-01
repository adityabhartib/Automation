package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the peop')]"));

        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9812040783");

        driver.close();
    }

    public static class Current_url {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.javatpoint.com/");

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = ("https://www.javatpoint.com/");
            if (actualUrl.contains(expectedUrl)) {
                System.out.println("Home page is displayed");
            } else {
                System.out.println("Home page is NOT displayed");
            }
        }
    }
}
