package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestAuto extends Main {

    @BeforeTest
    public void before_test() {
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("APjFqb")).sendKeys("booking.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.name("btnK")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3/span")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/div[38]/div/div/div/div[1]/div[1]/div/button/span/span/svg")).click();

       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


    }

    @Test()
    public void signup_ebay() {
        driver.findElement(By.linkText("Sign in")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("azxshatatt171@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div[2]/div[2]/button/span")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("00009999mM@");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div/div/div/div/div/form/div/div[2]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


        SoftAssert ass=new SoftAssert();
        String Expected="JOD";
        WebElement act=driver.findElement(By.xpath("//div[@class='adc8292e09 ea1e323a59 a3c80e4a68 c9f64f4509 fbe4119cc7']"));
        String Actual=act.getText();
        System.out.println("Curremcy is: "+Actual);
        ass.assertEquals(Actual,Expected);
        ass.assertAll();

        SoftAssert ass2=new SoftAssert();
        String Expected2="Al3edi Mohand";
        WebElement act2=driver.findElement(By.xpath("//div[normalize-space()='Al3edi Mohand']"));
        String Actual2=act2.getText();
        System.out.println("user name: "+Actual2);
        ass2.assertEquals(Actual2,Expected2);
        ass2.assertAll();
driver.quit();
    }
}
