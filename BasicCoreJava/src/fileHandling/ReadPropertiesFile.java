package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception  {
		
		Properties obj= new Properties();
		
		FileInputStream file = new FileInputStream("E:\\27062020\\27062020Automation\\BasicCoreJava\\src\\fileHandling\\TestData.properties");
		
		obj.load(file);
		
		System.out.println(obj.get("name"));
		
		throw new Exception("Testing");
		
	}

}
