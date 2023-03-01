package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_location {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        String title= driver.getTitle();
        System.out.println("The tittle of this page is :"+title);



    }
}
