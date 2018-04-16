package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider {
	Properties pro;
	
	public Configdataprovider()
	{
		//giving the path of the config.properties file
		File src=new File("./Configuration/config.properties");
		pro=new Properties();
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			
			//loading the properties in to the pro object
			
			pro.load(fis);
			
		} catch (Exception e) 
		{
			//unable to locate the load the properties file
			
			System.out.println("the exception is "+ e.getMessage());
		}
		
	}
	public String getapplicationurl()
	{
		
		String url=pro.getProperty("applicationpath");
		return url;
	}
	public String getchromepath()
	{
		String url=pro.getProperty("chromepath");
		return url;
	}
	public String getfirefoxpath()
	{
		String url=pro.getProperty("firefoxpath");
		return url;
	}
	
	

}
