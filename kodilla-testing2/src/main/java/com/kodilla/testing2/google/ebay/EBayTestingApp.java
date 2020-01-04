package com.kodilla.testing2.google.ebay;


import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://ebay.com");

        WebElement searchField = driver.findElement(By.id("gh-ac"));
        searchField.sendKeys("Laptop");
        searchField.submit();

        searchField = driver.findElement(By.id("gh-ac"));
        searchField.click();
    }
}
