package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis=new FileInputStream("");
//		Properties prop=new Properties();
//		prop.load(fis);
//		String value=prop.getProperty("url");
//		System.out.println(value);
		
		PropertiesUtility pUtil=new PropertiesUtility();
		String value=pUtil.getDataFromPropertiesFile("url");
		System.out.println(value);
		String UN=pUtil.getDataFromPropertiesFile("username");
		System.out.println(UN);
		String PWD=pUtil.getDataFromPropertiesFile("password");
		System.out.println(PWD);
		
		
	}

}
