package com.UtilityFiles;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuratonsread {

	
	String path = System.getProperty("user.dir")+"\\Properties\\Configurations.properties";
	
	Properties prop;
	
	public Configuratonsread() {
		
		prop = new Properties();
		try {
			FileInputStream FIS = new FileInputStream(path);
			prop.load(FIS);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String BrowserVal() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String mainURL() {
		String URL = prop.getProperty("url");
		return URL;
	}
	
	public String user() {
		String username = prop.getProperty("uname");
		return username;
	}
	
	public String pass() {
		String password = prop.getProperty("passw");
		return password;
	}
}
