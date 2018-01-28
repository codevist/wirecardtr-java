
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
 *         &lt;element name="CancelTicketResult" type="{http://www.3pay.com/services/}MResult" minOccurs="0"/>
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
    "cancelTicketResult"
})
@XmlRootElement(name = "CancelTicketResponse")
public class CancelTicketResponse {

    @XmlElement(name = "CancelTicketResult")
    protected MResult cancelTicketResult;

    /**
     * Gets the value of the cancelTicketResult property.
     * 
     * @return
     *     possible object is
     *     {@link MResult }
     *     
     */
    public MResult getCancelTicketResult() {
        return cancelTicketResult;
    }

    /**
     * Sets the value of the cancelTicketResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MResult }
     *     
     */
    public void setCancelTicketResult(MResult value) {
        this.cancelTicketResult = value;
    }

}
