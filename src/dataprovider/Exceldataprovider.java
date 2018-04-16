package dataprovider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	XSSFWorkbook wb;
	public Exceldataprovider()
	
	{
		
		File src=new File("./Applicationdata/vehicledata.xlsx");
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		}
		catch (Exception e) 
		
		{
			System.out.println("exception is"+e.getMessage());
			
		}
		
	}
	public String getdata(int sheetindex,int row,int col)
	{
		String data=wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
	return data;
	}
	public String getdata(String sheetname,int row,int col)
	{
		String data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	return data;
	}
}



