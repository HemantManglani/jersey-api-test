package api.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import json.pojo.*;

public class ApiRequest {
	
	public static Flights sendXmlRequest(String apiRequest, String mimeType) {
		
		Client client = new Client();
		WebResource resource = client.resource(apiRequest);
		Flights flights = resource.get(Flights.class);
		
		return flights;
	}
	
	public static Country sendJsonRequest(String apiRequest, String mimeType) throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		InputStream input = new FileInputStream(System.getProperty("user.dir")+apiRequest);
		Country country =  objectMapper.readValue(input, Country.class);
		
		return country;
	}

}
