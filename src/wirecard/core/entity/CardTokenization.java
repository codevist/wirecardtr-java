/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wirecard.core.entity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Codevist
 */
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
