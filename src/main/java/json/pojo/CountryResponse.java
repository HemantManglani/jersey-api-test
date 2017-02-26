package json.pojo;

import java.util.List;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@XmlRootElement(name = "CountryResponse")
@Produces({"charset=UTF-8", "application/json"})

public class CountryResponse {
	
	//@JsonProperty("messages")
	@JsonSerialize
	private List<String> message;
	
	//@JsonProperty("result")
	private List<CountryResult> result;
	
  //getters and setters
	@JsonCreator
    public CountryResponse(@JsonProperty("messages") List<String> message,
    					@JsonProperty("result") List<CountryResult> result) {
    	this.message = message;
    	this.result = result;
    }
	
    public List<String> getMessage() {
    	return message;
    }
    
    public List<CountryResult> getResult() {
    	return result;
    }

}
