
package wirecard.core.entity;

import javax.xml.bind.annotation.XmlElement;

public class CardTokenization {
    
     @XmlElement(name = "RequestType")
     public int RequestType ;    
     
     @XmlElement(name = "CustomerId")
     public String CustomerId ;   
     
     @XmlElement(name = "ValidityPeriod")
     public int ValidityPeriod ;  
     
     @XmlElement(name = "CCTokenId")
     public String CCTokenId ; 
}
