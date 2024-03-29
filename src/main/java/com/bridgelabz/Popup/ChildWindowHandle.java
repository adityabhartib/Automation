package com.bridgelabz.Popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class ChildWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions=new ChromeOptions();

        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        Thread.sleep(1000);

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        String parentWindowHandleId = driver.getWindowHandle();
        System.out.println("Parent Window handle Id :"+parentWindowHandleId);
        System.out.println("Parent Window Tittle: "+driver.getTitle());

        Thread.sleep(10000);

        driver.findElement(By.xpath("//span[contains(text(),'Remote')]")).click();

        options.addArguments("--disable-notifications");
        Set<String> windowHandles = driver.getWindowHandles();
        String firstChildWindow = null;
        for (String windowHandle : windowHandles) {
            System.out.println("window handle Id: " + windowHandle);

            if (!windowHandle.equals(parentWindowHandleId)) {
                firstChildWindow = windowHandle;
                driver.switchTo().window(windowHandle);
                Thread.sleep(10000);
                driver.findElement(By.xpath("//a[contains(text(),'Met')]")).click();
                Thread.sleep(1000);
//                 driver.close();
            }
        }
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String allWindowHandle : allWindowHandles) {

            System.out.println("All window handle ID: " + allWindowHandle);

            /* to close all window accept parent window */
            if (!allWindowHandle.equals(parentWindowHandleId)) {
                if (allWindowHandle.equals(firstChildWindow)) {
                    driver.switchTo().window(firstChildWindow);
//                    driver.close();
                } else if (!allWindowHandle.equals(firstChildWindow)) {
                    driver.switchTo().window(allWindowHandle);
                    Thread.sleep(10000);
//                    driver.close();
                }
            }
            /* to close parent window */
            else if (allWindowHandle.equals(parentWindowHandleId)) {
                driver.switchTo().window(parentWindowHandleId);
                  driver.close();
            }
        }

        Thread.sleep(4000);
        driver.close();
    }
}
