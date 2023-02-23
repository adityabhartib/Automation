package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceLogin_Page {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement unTB = driver.findElement(By.cssSelector("#email.inputtext._55r1"));

         int username_Ycordinate = unTB.getLocation().getY();
         System.out.println(username_Ycordinate);

         WebElement pwdTB = driver.findElement(By.name("pass"));

         int password_Ycordinate = pwdTB.getLocation().getY();
         System.out.println(password_Ycordinate);

        if (username_Ycordinate==password_Ycordinate) {
            System.out.println("Both username and password fields are displayed in the same row");
        }else{
            System.out.println("username and password fields are NOT aligned in the same row");
        }
    }
}

