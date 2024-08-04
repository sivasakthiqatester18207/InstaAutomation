package com.insta.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadconfigInsta 
{
	Properties pro;
	public ReadconfigInsta() 
	{
		File src = new File("./Configuration\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		 catch(Exception e)
		 {
			 System.out.println("Exception is"+ e.getMessage());
		}
	}
	
	public String getweburl()
	{
		String url = pro.getProperty("baseurl");
		return url;
	}
	
	public String getusername()
	{
		String gusername = pro.getProperty("umail");
		return gusername;
	}
	
	public String getpassword()
	{
		String gpassword = pro.getProperty("passkey");
		return gpassword;
	}
	
	public String getwebtitle()
	{
		String gtitle = pro.getProperty("title");
		return gtitle;
	}
	
	public String getchromepath()
	{
		String gchromepath = pro.getProperty("chromepath");
		return gchromepath;
	}
//	public String getfirefox()
//	{
//		String gfirefox = pro.getProperty("firefoxpath");
//		return gfirefox;
//	}

}
