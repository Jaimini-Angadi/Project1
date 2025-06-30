package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	/**
	 * This is a generic method to fetch single cell data from excel file
	 * @param sheetName
	 * @param rowNum
	 * @param cellIndex
	 * @return
	 * @throws IOException
	 */
	public String getDataFromExcelFile(String sheetName, int rowNum ,int cellIndex) throws IOException{
		FileInputStream fis=new FileInputStream(IPathUtility.excelPath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sh=workbook.getSheet(sheetName);
		XSSFRow r=sh.getRow(rowNum);
		XSSFCell cell=r.getCell(cellIndex);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(cell);
		workbook.close();
		return value;
		
	}

}
