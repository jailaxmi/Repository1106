package testNGDemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configReader.log4jConfigReader;

public class testNGAnnotationsList {
     Logger logger;
     
     testNGAnnotationsList(){
      logger = Logger.getLogger("Annotations");
      PropertyConfigurator.configure("config/log4j.properties");
     }

     
    @Test  //main annotation
	void test() {
		logger.info("Test Annotations");
		}
	
	@BeforeClass  
	void beforeClass() {
		logger.info("BeforeClass Annotations");
    }              
	
	@AfterClass
	void afterClass() {
		logger.info("AfterClass Annotations");
    }
	
	@AfterMethod
	void afterMethod() {
		logger.info("AfterMethod Annotations");
     }
	
	@BeforeMethod
	void beforeMethod() {
		logger.info("BeforeMethod Annotations");
      }
	
	@BeforeSuite
	void beforeSuite() {
		logger.info("BeforeSuite Annotations");
       }
	
	@AfterSuite
	void afterSuite() {
		logger.info("AfterSuite Annotations");
       }
	
	@AfterTest
	void afterTest() {
		logger.info("AfterTest Annotations");
       }
	
	@BeforeTest
	void beforeTest() {
		logger.info("BeforeTest Annotations");
		}
	
}
