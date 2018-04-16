package factory;

import dataprovider.Configdataprovider;
import dataprovider.Exceldataprovider;

public class Dataproviderfactory 
{
	public static Configdataprovider getconfig()
	{
		Configdataprovider config=new Configdataprovider();
		return config;
	}
	public static Exceldataprovider getExcel()
	{
		Exceldataprovider excel=new Exceldataprovider();
		return excel;
	}

}
