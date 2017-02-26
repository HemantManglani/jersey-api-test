package json.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "flight"
})
@XmlRootElement(name = "flights")
public class Flights {

    @XmlElement(required = true)
    protected List<FlightType> flight;

    public List<FlightType> getFlight() {
        if (flight == null) {
            flight = new ArrayList<FlightType>();
        }
        return this.flight;
    }
    
    @Override
    public String toString() {
        return (this.flight != null) ? "{\"flight\": " + this.flight.toString() + "}" : "{flight:[]}";
    }

}
