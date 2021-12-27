package excelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWrite {
	
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
	public static void main(String[] args) throws IOException {
		excelWrite excel=new excelWrite();
		excel.writeInsideExcel(0, 1, 0, "pratibha");
	}

}
