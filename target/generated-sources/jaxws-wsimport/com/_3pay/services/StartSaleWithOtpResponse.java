
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
 *         &lt;element name="StartSaleWithOtpResult" type="{http://www.3pay.com/services/}MSaleOutput" minOccurs="0"/>
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
    "startSaleWithOtpResult"
})
@XmlRootElement(name = "StartSaleWithOtpResponse")
public class StartSaleWithOtpResponse {

    @XmlElement(name = "StartSaleWithOtpResult")
    protected MSaleOutput startSaleWithOtpResult;

    /**
     * Gets the value of the startSaleWithOtpResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleOutput }
     *     
     */
    public MSaleOutput getStartSaleWithOtpResult() {
        return startSaleWithOtpResult;
    }

    /**
     * Sets the value of the startSaleWithOtpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleOutput }
     *     
     */
    public void setStartSaleWithOtpResult(MSaleOutput value) {
        this.startSaleWithOtpResult = value;
    }

}
