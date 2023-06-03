package com.project.Day_6;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App5 {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();

		dr.get("https://demo.smart-hospital.in/site/login");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		dr.findElement(By.xpath("//*[@id=\'sibe-box\']/ul[2]/li[4]/a/span")).click();
		String tag=dr.findElement(By.xpath("//*[@id=\'sibe-box\']/ul[2]/li[4]/a/span")).getTagName();
		String text=dr.findElement(By.xpath("//*[@id=\'sibe-box\']/ul[2]/li[4]/a/span")).getText();
		Dimension size=dr.findElement(By.id("search-btn")).getSize();
		String colour=dr.findElement(By.id("search-btn")).getCssValue("color");
		dr.findElement(By.name("search_text")).sendKeys("Arvind");
		dr.findElement(By.id("search-btn")).click();
		System.out.println("Tag: "+tag);
		System.out.println("Text: "+text);
		System.out.println("Size: "+size);
		System.out.println("Colour: "+colour);
	}

}
