package org.project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
public static void main(String[] args) throws IOException {
	WebDriverManager.edgedriver().setup();
	EdgeOptions option = new EdgeOptions();
	option.addArguments("--start-maximized");
       WebDriver driver = new EdgeDriver(option);
       driver.get("https://www.redbus.in/");
       
       List<WebElement> links = driver.findElements(By.tagName("link"));
      Iterator<WebElement> iterator = links.iterator();
      while(iterator.hasNext()) {
    	  WebElement link = iterator.next();  
    	  String href = link.getAttribute("href");
    	  if(href==null || href.isEmpty()){
    		  System.out.println("link is empty");
    	  }
    	  else if(!href.startsWith("https://www.redbus.in/") ) {
    		  System.out.println("Link doesn't belong to this application "+href);
    	  }
    	  else{
    		  try {
    		  HttpURLConnection http = (HttpURLConnection) (new URL(href)).openConnection();
    		  http.setRequestMethod("HEAD");
    		  http.connect();
    		  int responseCode = http.getResponseCode();
    		  if(responseCode==200) {
    			  System.out.println("Not a broken link "+href);
    		  }
    		  else {
    			  System.out.println("Broken link "+href);
    		  }
    		  
    		  }
    		  catch(MalformedURLException e){
    			  e.printStackTrace();
    		  }
    	  }
    	  
       
      } 
}
}
