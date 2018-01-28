
package com.mikro_odeme.services;

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
 *         &lt;element name="SendSMSResult" type="{http://services.mikro-odeme.com/}MSendSMSOutput" minOccurs="0"/>
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
    "sendSMSResult"
})
@XmlRootElement(name = "SendSMSResponse")
public class SendSMSResponse {

    @XmlElement(name = "SendSMSResult")
    protected MSendSMSOutput sendSMSResult;

    /**
     * Gets the value of the sendSMSResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSendSMSOutput }
     *     
     */
    public MSendSMSOutput getSendSMSResult() {
        return sendSMSResult;
    }

    /**
     * Sets the value of the sendSMSResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSendSMSOutput }
     *     
     */
    public void setSendSMSResult(MSendSMSOutput value) {
        this.sendSMSResult = value;
    }

}
