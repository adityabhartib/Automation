package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.actimind.com/");
        Actions action = new Actions(driver);

         WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
         action.moveToElement(AreaOfExpertise).perform();


         WebElement cloudApp = driver.findElement(By.linkText("Cloud Applicationss"));
         action.moveToElement(cloudApp).click().perform();


         action.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
         }}