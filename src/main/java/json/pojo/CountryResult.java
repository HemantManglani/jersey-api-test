package json.pojo;

import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "CountryResult")
@Produces({"charset=UTF-8", "application/json"})

public class CountryResult {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("alpha2_code")
    private String alpha2cd;
    
	@JsonProperty("alpha3_code")
	private String alpha3cd;
    
    public CountryResult(@JsonProperty("name") String name,
    		@JsonProperty("alpha2_code") String aplha2cd,
    		@JsonProperty("alpha3_code") String aplha3cd){
    	this.name = name;
    	this.alpha2cd = aplha2cd;
    	this.alpha3cd = aplha3cd;
    }
    
  //getters and setters
    public String getName() {
    	return name;
    }
    
    public String getAlpha2Cd() {
    	return alpha2cd;
    }
    
    public String getAlpha3Cd() {
    	return alpha3cd;
    }
    
}
