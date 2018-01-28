
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
 *         &lt;element name="UpdateSubscriberPriceByIdandDateResult" type="{http://www.3pay.com/services/}MResult" minOccurs="0"/>
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
    "updateSubscriberPriceByIdandDateResult"
})
@XmlRootElement(name = "UpdateSubscriberPriceByIdandDateResponse")
public class UpdateSubscriberPriceByIdandDateResponse {

    @XmlElement(name = "UpdateSubscriberPriceByIdandDateResult")
    protected MResult updateSubscriberPriceByIdandDateResult;

    /**
     * Gets the value of the updateSubscriberPriceByIdandDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link MResult }
     *     
     */
    public MResult getUpdateSubscriberPriceByIdandDateResult() {
        return updateSubscriberPriceByIdandDateResult;
    }

    /**
     * Sets the value of the updateSubscriberPriceByIdandDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MResult }
     *     
     */
    public void setUpdateSubscriberPriceByIdandDateResult(MResult value) {
        this.updateSubscriberPriceByIdandDateResult = value;
    }

}
