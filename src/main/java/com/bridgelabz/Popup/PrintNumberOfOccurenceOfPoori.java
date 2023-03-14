package com.bridgelabz.Popup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PrintNumberOfOccurenceOfPoori {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("D:\\IntelliJ IDEA\\CQA115\\src\\main\\resources\\Test2.html");
        WebElement list = driver.findElement(By.id("mtr"));
        Select s = new Select(list);
        List<WebElement> allElements = s.getOptions();
        HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
        for (WebElement element : allElements) {
            String text = element.getText();
            if (hashMapObj.containsKey(text)) {
                Integer value = hashMapObj.get(text);
                value++;
                hashMapObj.put(text, value);
            } else {
                hashMapObj.put(text, 1);
            }
        }
        Set<String> allKeys = hashMapObj.keySet();
        for (String key : allKeys) {
            Integer value = hashMapObj.get(key);
            System.out.println(key + " -->" + value);
            if (value > 1) {
                System.out.println("Occurance of " + key + " is :" + value);
            }
        }
        driver.close();
    }
}