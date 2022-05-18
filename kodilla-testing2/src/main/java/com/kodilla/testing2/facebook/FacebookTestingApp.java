package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String ACCEPT_COOKIES = "//button[contains(string(), 'Zezwól tylko na ')]";
    public static final String CREATE_ACCOUNT = "//a[contains(string(), 'Utwórz ')]";

    public static final String XPATH_DAY = "//div[contains(@id=\"birthday_wrapper\")]/div[2]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@id=\"birthday_wrapper\")]/div[2]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@id=\"birthday_wrapper\")]/div[2]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(ACCEPT_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(ACCEPT_COOKIES)).click();

        while(!driver.findElement((By.xpath(CREATE_ACCOUNT))).isDisplayed());
        driver.findElement(By.xpath(CREATE_ACCOUNT)).click();

        while(!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed());
        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByValue("1");

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByValue("1");

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoard3 = new Select(selectCombo3);
        selectBoard3.selectByValue("2000");
    }
}