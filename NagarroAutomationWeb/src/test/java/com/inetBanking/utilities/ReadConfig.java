package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;//declare
	public ReadConfig() 
	{
		File propertiesfilepath=new File("./Configuration/config.properties");
		
		//C:\Users\Wasim Ansari\OneDrive - GMO GlobalSign\eclipse-workspace\inetBankingv1= ./ 
		
		try {
			FileInputStream	fis = new FileInputStream(propertiesfilepath);
			prop=new Properties();//define
			prop.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exception is: " +e.getMessage());
		}
		
	}
	public String getApplicationURL()
	{
		String BaseURL=prop.getProperty("BaseURL");
		return BaseURL;
	}
	public String getUserName( )
	{
		String username=prop.getProperty("username");
		return username;
		
	}
	public String getPassword()
	{
		String password=prop.getProperty("password");
		return password;
		
	}
	public String getchromepath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
		
	}
	
	public String getiepath()
	{
		String iepath=prop.getProperty("iepath");
		return iepath;
		
	}
	public String getfirefoxpath()
	{
		String firefoxpath=prop.getProperty("firefoxpath");
		return firefoxpath;
		
	}
}
