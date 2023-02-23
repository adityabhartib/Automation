package com.bridgelabz.pdf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.bigbasket.com/");

        WebElement a = driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/button[1]/div[1]/span[2]"));

        a.click();
        Thread.sleep(3000);
        a.click();
        boolean username = a.isEnabled();
        System.out.println(username);

        Thread.sleep(3000);
        WebElement pass = driver.findElement(By.xpath("//header/div[2]/div[2]/ul[1]/li[1]/a[1]/div[1]/span[1]"));

        pass.click();
        boolean password = pass.isEnabled();
        System.out.println(password);

        Thread.sleep(3000);

        driver.close();
    }
}
