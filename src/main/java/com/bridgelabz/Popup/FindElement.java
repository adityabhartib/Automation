package com.bridgelabz.Popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions=new ChromeOptions();

        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

         int totalLinks = allLinks.size();
         System.out.println("total number of links present on the web page is : "+totalLinks);

         int visibleLinkCount = 0;

         int hiddenLinkCount = 0;

         for(WebElement link : allLinks) {

         if (link.isDisplayed()) {
         visibleLinkCount++;
         System.out.println(visibleLinkCount+" --> "+link.getText());
         }else{
         hiddenLinkCount++;
         } }
         System.out.println("Total number of visible links :" + visibleLinkCount);
         System.out.println("Total number of hidden links :" + hiddenLinkCount);

         driver.close();
    }
}
