package configReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import testBase.domainObjects;

public class configReader{

		String propFileLocation="config/configuration.Properties";
		String propFileLocation2="config/configuration2.Properties";
		
		void ConfigReader() throws IOException  {
			

		File file=new File(propFileLocation); //file location
		FileInputStream inFile=new FileInputStream(file);  //reading the file
		
		File file2=new File(propFileLocation2); //file location
		FileInputStream inFile2=new FileInputStream(file2);  //reading the file
		
	    Properties prop=new Properties();
		prop.load(inFile);   //loading properties information
        prop.load(inFile2);
		
		String browser=prop.getProperty("browser");
		System.out.println("browser selected in properties file "+ browser);
		
		String url=prop.getProperty("testurl");
		System.out.println("url selected in properties file "+ url);
		
		String password=prop.getProperty("password");
		System.out.println("url selected in properties file "+ password);
		
		
	
		
		
	}

}
