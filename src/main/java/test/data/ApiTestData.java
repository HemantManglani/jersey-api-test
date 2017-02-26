package test.data;

import org.testng.annotations.DataProvider;

import com.sun.research.ws.wadl.Method;

public class ApiTestData {

        @DataProvider(name="apiXmlRequest")
        public static Object[][] getXmlData(){
        	return new Object[][] {          
        		{ "http://localhost:9998/jsonfromjaxb/flights" , "xml", "OK123", "Czech Airlines", 123, "B737"}
                };       
       }
        
        @DataProvider(name="apiJsonRequest")
        public static Object[][] getJsonData(){

        	return new Object[][] {          
        		{ "//sample-responses//country.json", "json", "India", "IN", "IND" }
                };       
       }
}