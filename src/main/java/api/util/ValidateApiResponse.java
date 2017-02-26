package api.util;

import java.io.IOException;
import json.pojo.*;

public class ValidateApiResponse {
	
	public static void typeXml(Flights flights, String flightId, String company, String aircraft) throws IOException {
		
		assert flights.getFlight().iterator().next().getFlightId().equalsIgnoreCase(flightId):"Wrong flight ID";
		assert flights.getFlight().iterator().next().getCompany().equalsIgnoreCase(company):"Wrong flight Company";
		assert flights.getFlight().iterator().next().getAircraft().equalsIgnoreCase(aircraft):"Wrong aircraft";
	}
	
	public static void typeJson(Country country, String countryName, String isoCode, String ctyCode) throws IOException {
			
		assert country.getResponse().getResult().iterator().next().getName().equalsIgnoreCase(countryName):"Invalid Details";
		assert country.getResponse().getResult().iterator().next().getAlpha2Cd().equalsIgnoreCase(isoCode):"Invalid Details";
		assert country.getResponse().getResult().iterator().next().getAlpha3Cd().equalsIgnoreCase(ctyCode):"Invalid Details";	
	}
}
