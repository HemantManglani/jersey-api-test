package api.test;

import java.io.IOException;
import org.testng.annotations.Test;
import api.util.*;
import json.pojo.*;
import test.data.*;


public class Tc2MimeTypeJson {
	
	@Test(dataProvider="apiJsonRequest",dataProviderClass=ApiTestData.class)
	public void testJsonApi(String requestMsg, String mimeType, String countryName, String isoCode, String ctyCode) throws IOException {

		// Step - 1 : Send Request
		Country country = ApiRequest.sendJsonRequest(requestMsg, mimeType);

		// Step - 2 : Validate Response
		try {
			ValidateApiResponse.typeJson(country, countryName, isoCode, ctyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
