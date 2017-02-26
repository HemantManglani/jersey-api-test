package api.test;

import java.io.IOException;
import org.testng.annotations.Test;
import api.util.*;
import json.pojo.*;
import test.data.*;


public class Tc1MimeTypeXml {
	
	@Test(dataProvider="apiXmlRequest",dataProviderClass=ApiTestData.class)
	public void testXmlApi(String requestMsg, String mimeType, String flightId, String company, int number, String aircraft) {

		// Step - 1 : Send Request
		Flights flights = ApiRequest.sendXmlRequest(requestMsg, mimeType);

		// Step - 2 : Validate Response
		try {
			ValidateApiResponse.typeXml(flights, flightId, company, aircraft);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
