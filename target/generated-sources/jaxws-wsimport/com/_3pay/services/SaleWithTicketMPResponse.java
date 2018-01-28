
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
 *         &lt;element name="SaleWithTicketMPResult" type="{http://www.3pay.com/services/}MSaleTicketOutput" minOccurs="0"/>
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
    "saleWithTicketMPResult"
})
@XmlRootElement(name = "SaleWithTicketMPResponse")
public class SaleWithTicketMPResponse {

    @XmlElement(name = "SaleWithTicketMPResult")
    protected MSaleTicketOutput saleWithTicketMPResult;

    /**
     * Gets the value of the saleWithTicketMPResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleTicketOutput }
     *     
     */
    public MSaleTicketOutput getSaleWithTicketMPResult() {
        return saleWithTicketMPResult;
    }

    /**
     * Sets the value of the saleWithTicketMPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleTicketOutput }
     *     
     */
    public void setSaleWithTicketMPResult(MSaleTicketOutput value) {
        this.saleWithTicketMPResult = value;
    }

}
