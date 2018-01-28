
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
 *         &lt;element name="ResumeSaleWithOtpResult" type="{http://www.3pay.com/services/}MSaleOutput" minOccurs="0"/>
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
    "resumeSaleWithOtpResult"
})
@XmlRootElement(name = "ResumeSaleWithOtpResponse")
public class ResumeSaleWithOtpResponse {

    @XmlElement(name = "ResumeSaleWithOtpResult")
    protected MSaleOutput resumeSaleWithOtpResult;

    /**
     * Gets the value of the resumeSaleWithOtpResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleOutput }
     *     
     */
    public MSaleOutput getResumeSaleWithOtpResult() {
        return resumeSaleWithOtpResult;
    }

    /**
     * Sets the value of the resumeSaleWithOtpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleOutput }
     *     
     */
    public void setResumeSaleWithOtpResult(MSaleOutput value) {
        this.resumeSaleWithOtpResult = value;
    }

}
