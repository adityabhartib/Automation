package com.bridgelabz.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_using_Attribute {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        System.out.println("Name of the Username :"+driver.findElement(By.id("email")).getAttribute("name"));
        System.out.println("Name of the Placeholder :"+driver.findElement(By.id("email")).getAttribute("placeholder"));
        System.out.println("Name of the type :"+driver.findElement(By.id("email")).getAttribute("type"));

        String text=driver.findElement(By.id("email")).getTagName();
        System.out.println("Tag Name :"+text);

        String s=driver.findElement(By.id("email")).getCssValue("");
        System.out.println(s);

        driver.close();
    }
}
