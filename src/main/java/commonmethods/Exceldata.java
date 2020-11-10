package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	
	static String excelpath=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx";
	
	public static String readdata(int row, int clm) throws IOException {
		
		FileInputStream fis= new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String val1=wb.getSheet("Sheet7").getRow(row).getCell(clm).getStringCellValue();
		return val1;
	}
	
	
	public static void writedata(int row, int clm , String val) throws IOException {
		FileInputStream fis= new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet7").getRow(row).createCell(clm).setCellValue(val);
		FileOutputStream fos= new FileOutputStream(excelpath);
		
		wb.write(fos);
		fos.close();
	}
	
	
	

}
