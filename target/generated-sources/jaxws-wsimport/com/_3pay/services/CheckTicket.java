
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
 *         &lt;element name="token" type="{http://www.3pay.com/services/}MAuthToken" minOccurs="0"/>
 *         &lt;element name="ticketObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
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
    "token",
    "ticketObjectId"
})
@XmlRootElement(name = "CheckTicket")
public class CheckTicket {

    protected MAuthToken token;
    @XmlElement(required = true)
    protected String ticketObjectId;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link MAuthToken }
     *     
     */
    public MAuthToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAuthToken }
     *     
     */
    public void setToken(MAuthToken value) {
        this.token = value;
    }

    /**
     * Gets the value of the ticketObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketObjectId() {
        return ticketObjectId;
    }

    /**
     * Sets the value of the ticketObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketObjectId(String value) {
        this.ticketObjectId = value;
    }

}
