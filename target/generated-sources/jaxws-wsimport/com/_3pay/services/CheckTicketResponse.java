
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckTicketResult" type="{http://www.3pay.com/services/}MResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkTicketResult"
})
@XmlRootElement(name = "CheckTicketResponse")
public class CheckTicketResponse {

    @XmlElement(name = "CheckTicketResult")
    protected MResult checkTicketResult;

    /**
     * Gets the value of the checkTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link MResult }
     *     
     */
    public MResult getCheckTicketResult() {
        return checkTicketResult;
    }

    /**
     * Sets the value of the checkTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MResult }
     *     
     */
    public void setCheckTicketResult(MResult value) {
        this.checkTicketResult = value;
    }

}
