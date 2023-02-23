package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightAndWeightofLogginPage {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

     WebElement unTB = driver.findElement(By.id("email"));

     int username_height = unTB.getSize().getHeight();

     int username_width = unTB.getSize().getWidth();
        System.out.println("---------------User Name-----------");
     System.out.println("Height "+username_height);
     System.out.println("Weight "+username_width);

     WebElement pwdTB = driver.findElement(By.name("pass"));

     int password_height = pwdTB.getSize().getHeight();

     int password_width = pwdTB.getSize().getWidth();
        System.out.println("-------------Password-------------");
        System.out.println("Height "+password_height);
        System.out.println("Weight "+password_width);
    }
}
