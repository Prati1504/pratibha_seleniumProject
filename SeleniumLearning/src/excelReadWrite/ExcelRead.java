package excelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		//get path of excel file
		File path =new File("C:\\selenium\\demo.xlsx");
		
		//load excel file
		FileInputStream load=new FileInputStream(path);
		
		//workbook of excel
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		
		//get sheet from the workbook where we want to read
		XSSFSheet sheet1=workbook.getSheetAt(0);
		
		String Data=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data);
	}

}
