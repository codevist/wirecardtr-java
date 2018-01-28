
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
 *         &lt;element name="GetSaleResultMPAYResult" type="{http://www.3pay.com/services/}MSaleOutput" minOccurs="0"/>
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
    "getSaleResultMPAYResult"
})
@XmlRootElement(name = "GetSaleResultMPAYResponse")
public class GetSaleResultMPAYResponse {

    @XmlElement(name = "GetSaleResultMPAYResult")
    protected MSaleOutput getSaleResultMPAYResult;

    /**
     * Gets the value of the getSaleResultMPAYResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleOutput }
     *     
     */
    public MSaleOutput getGetSaleResultMPAYResult() {
        return getSaleResultMPAYResult;
    }

    /**
     * Sets the value of the getSaleResultMPAYResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleOutput }
     *     
     */
    public void setGetSaleResultMPAYResult(MSaleOutput value) {
        this.getSaleResultMPAYResult = value;
    }

}
