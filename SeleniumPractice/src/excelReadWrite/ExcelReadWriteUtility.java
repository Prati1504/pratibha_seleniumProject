package excelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ExcelReadWriteUtility {
	String value="";
	WebDriver driver;
	public String readFromExcel(int sheetnum, int rownum, int cell) throws IOException
	{
			File path =new File("C:\\selenium\\demo.xlsx");
			FileInputStream load=new FileInputStream(path);
			XSSFWorkbook workbook= new XSSFWorkbook(load);
			XSSFSheet sheet=workbook.getSheetAt(0);
			CellType type=sheet.getRow(0).getCell(0).getCellType();
			if(type==CellType.NUMERIC)
			{
				double num=sheet.getRow(rownum).getCell(cell).getNumericCellValue();
				int number=(int)num;
				value=String.valueOf(number);
			}
			else
			value=sheet.getRow(rownum).getCell(cell).getStringCellValue();
			return value;
	}
	public void writeInsideExcel(int sheetNum,int rowNum, int colNum, String data) throws IOException
	{
			File path=new File("C:\\selenium\\demo.xlsx");
			FileInputStream load= new FileInputStream(path);
			XSSFWorkbook workbook= new XSSFWorkbook(load);
			XSSFSheet sheet= workbook.getSheetAt(sheetNum);
			FileOutputStream write=new FileOutputStream(path);
			sheet.createRow(rowNum).createCell(colNum).setCellValue(data);
			workbook.write(write);
	}
	public void screenshot() throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\HP\\Desktop\\#Automation testing\\ss\\orangeHrm.png");
		FileHandler.copy(source, destination);
	}
	public static void main(String[] args) throws IOException {
		ExcelReadWriteUtility excel=new ExcelReadWriteUtility();
		excel.writeInsideExcel(0, 1, 0, "Admin");
		excel.writeInsideExcel(0, 2, 0, "admin123");
		String data=excel.readFromExcel(0, 2, 0);
		System.out.println(data);
		excel.screenshot();
	}

}
