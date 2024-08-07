package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsUsage {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeOptions option = new EdgeOptions();
	option.addArguments("--start-maximized");
	option.addArguments("disable-popup");
	option.addArguments("disable-notifiactions");
       WebDriver driver = new EdgeDriver(option);
       driver.get("https://www.redbus.in/");
       
       driver.findElement(By.xpath("//span[starts-with(text(),'H')]"));
       
       driver.findElement(By.xpath("//span[contains(text(),'Account')]/parent::div"));
       
       driver.findElement(By.xpath("//label[text()='To']/preceding-sibling::input"));
       
       driver.findElement(By.xpath("//h2[text()=\"TRENDING OFFERS\"]/following-sibling::a"));
       
       driver.findElement(By.xpath("//a[@id=\"privacy_policy_footer\"]/ancestor::li"));
       
       driver.findElement(By.xpath("//a[@id=\"privacy_policy_footer\"]/preceding::a[@id=\"terms_n_conditions_footer\"]"));
       
       driver.findElement(By.xpath("//a[@id=\"faq_footer\"]/following::a[@id=\"blog_footer\"]"));
       
       driver.findElement(By.xpath("//li[@id=\"info_title_footer\"]/descendant::a[last()]"));
       
       
       
    
}
}
