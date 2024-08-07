package org.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Franky\\ProjectSan\\src\\test\\resources\\data.property");
		FileInputStream read = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(read);
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		String env = prop.getProperty("env");
		System.out.println(url);
		System.out.println(userName);
		System.out.println(pwd);
		System.out.println(env);
		FileOutputStream write = new FileOutputStream(f);
		prop.setProperty("username", "Subramanian");
		prop.setProperty("env", "dev");
		prop.setProperty("mobile no", "8764689035");
		prop.save(write, "Updated new Credentials");
	}

}
