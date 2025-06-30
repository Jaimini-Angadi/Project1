package Sample;

import java.io.IOException;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws IOException {
		ExcelUtility eUtil=new ExcelUtility();
		String value=eUtil.getDataFromExcelFile("Leads", 1, 3);
		System.out.println(value);
		String value1=eUtil.getDataFromExcelFile("Contacts", 3, 2);
		System.out.println(value1);
	}

}
