package org.team5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        options.addArguments("--remote-allow-origin**");

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("bánh kẹo");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[2]")).click();
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/div/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"txt_search_product\"]")).sendKeys("Bánh quy");

        driver.findElement(By.xpath("//*[@id=\"txt_search_product\"]")).submit();
    }

}
