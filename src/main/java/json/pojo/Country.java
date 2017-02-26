package json.pojo;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "Country")
@Produces({"charset=UTF-8", "application/json"})

public class Country {
	
	//@JsonProperty("RestResponse")
	private CountryResponse restResponse;
	
  //getters and setters
	public Country(){}
	
	@JsonCreator
	public Country(@JsonProperty("RestResponse") CountryResponse restResponse){
		this.restResponse = restResponse;
	}
	
	public CountryResponse getResponse(){
		return restResponse;
	}
}
