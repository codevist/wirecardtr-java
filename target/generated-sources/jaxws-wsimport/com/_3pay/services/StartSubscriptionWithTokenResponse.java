
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
 *         &lt;element name="StartSubscriptionWithTokenResult" type="{http://www.3pay.com/services/}MSaleOutputCreditCard" minOccurs="0"/>
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
    "startSubscriptionWithTokenResult"
})
@XmlRootElement(name = "StartSubscriptionWithTokenResponse")
public class StartSubscriptionWithTokenResponse {

    @XmlElement(name = "StartSubscriptionWithTokenResult")
    protected MSaleOutputCreditCard startSubscriptionWithTokenResult;

    /**
     * Gets the value of the startSubscriptionWithTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleOutputCreditCard }
     *     
     */
    public MSaleOutputCreditCard getStartSubscriptionWithTokenResult() {
        return startSubscriptionWithTokenResult;
    }

    /**
     * Sets the value of the startSubscriptionWithTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleOutputCreditCard }
     *     
     */
    public void setStartSubscriptionWithTokenResult(MSaleOutputCreditCard value) {
        this.startSubscriptionWithTokenResult = value;
    }

}
