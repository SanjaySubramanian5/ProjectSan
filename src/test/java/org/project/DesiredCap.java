package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCap {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Franky\\Selenium\\target\\driver\\msedgedriver.exe");
    WebDriver driver = new EdgeDriver();
	
	DesiredCapabilities des = new DesiredCapabilities();
    des.setCapability("browserName", "edge");
    des.setCapability("platform", "windows 10");
    des.setCapability("edge.driver", "127.0.2651.86");
    des.setCapability("network", "true");
    driver.get("https://www.facebook.com/");
}
}
    