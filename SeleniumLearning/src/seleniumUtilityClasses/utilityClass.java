package seleniumUtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityClass {
	String value="";
	WebDriver driver;
	public String readFromExcel(int sheetnum, int rownum, int cell) throws IOException
	{
			File path =new File("C:\\selenium\\demo.xlsx");
			FileInputStream load=new FileInputStream(path);
			XSSFWorkbook workbook= new XSSFWorkbook(load);
			XSSFSheet sheet=workbook.getSheetAt(sheetnum);
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
	public void screenshot() throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\selenium\\ss\\ghadge.png");
		FileHandler.copy(source, destination);
	}
}
