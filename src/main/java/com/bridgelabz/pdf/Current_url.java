package com.bridgelabz.pdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_url {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        String title= driver.getTitle();
        System.out.println("The tittle of this page is :"+title);

        String Currenturl=driver.getCurrentUrl();
        System.out.println("----------------");
        System.out.println("This is the Current Url :"+Currenturl);

        String source=driver.getPageSource();
        System.out.println("----------------");
        System.out.println("This is My Page Source :"+source);

        Thread.sleep(3000);

        String expected_tittle="Google";

        if (title.contains(expected_tittle))
            System.out.println("Home Page is Displayed");
        else
            System.out.println("Home Page is not Displayed");

        driver.close();

    }
}
