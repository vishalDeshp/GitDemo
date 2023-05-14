package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitDemo {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","F:\\Selenium_Grid_jars\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("Development1");

        GitDemo2.newWindow1(driver);
    }
}
