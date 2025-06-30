package Sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import genericUtility.ExcelUtility;

public class WritingDataToExcelFile {
	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("");
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sh=workbook.getSheet("Fruits");
	XSSFRow r=sh.createRow(1);
	XSSFCell cell=r.createCell(0);
	cell.setCellValue("Dragon fruit");
	FileOutputStream fos=new FileOutputStream("");
	workbook.write(fos);
	workbook.close();
	
	ExcelUtility eUtil=new ExcelUtility();


	}

}
