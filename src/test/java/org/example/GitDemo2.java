package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class GitDemo2 {
    public static void newWindow1(WebDriver driver){
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");

    }
}
