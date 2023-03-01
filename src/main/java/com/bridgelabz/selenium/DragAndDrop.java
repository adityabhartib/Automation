package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

        String xp1 = "//h1[.='Block 1']";

        WebElement block1 = driver.findElement(By.xpath(xp1));


        String xp2 = "//h1[.='Block 3']";

        WebElement block3 = driver.findElement(By.xpath(xp2));

         Actions actions = new Actions(driver);

         Thread.sleep(3000);
         actions.dragAndDropBy(block1, block3.getLocation().getX()+10,
                 block3.getSize().getHeight()+19).perform();

         Thread.sleep(5000);
         driver.quit();
    }
}
