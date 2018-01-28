
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
 *         &lt;element name="CreateTicketForMsisdnForwardingResult" type="{http://www.3pay.com/services/}TicketOutput" minOccurs="0"/>
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
    "createTicketForMsisdnForwardingResult"
})
@XmlRootElement(name = "CreateTicketForMsisdnForwardingResponse")
public class CreateTicketForMsisdnForwardingResponse {

    @XmlElement(name = "CreateTicketForMsisdnForwardingResult")
    protected TicketOutput createTicketForMsisdnForwardingResult;

    /**
     * Gets the value of the createTicketForMsisdnForwardingResult property.
     * 
     * @return
     *     possible object is
     *     {@link TicketOutput }
     *     
     */
    public TicketOutput getCreateTicketForMsisdnForwardingResult() {
        return createTicketForMsisdnForwardingResult;
    }

    /**
     * Sets the value of the createTicketForMsisdnForwardingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketOutput }
     *     
     */
    public void setCreateTicketForMsisdnForwardingResult(TicketOutput value) {
        this.createTicketForMsisdnForwardingResult = value;
    }

}
