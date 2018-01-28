
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
 *         &lt;element name="SelectSubscriberDetailResult" type="{http://www.3pay.com/services/}MSubscriberDetailOutput" minOccurs="0"/>
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
    "selectSubscriberDetailResult"
})
@XmlRootElement(name = "SelectSubscriberDetailResponse")
public class SelectSubscriberDetailResponse {

    @XmlElement(name = "SelectSubscriberDetailResult")
    protected MSubscriberDetailOutput selectSubscriberDetailResult;

    /**
     * Gets the value of the selectSubscriberDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSubscriberDetailOutput }
     *     
     */
    public MSubscriberDetailOutput getSelectSubscriberDetailResult() {
        return selectSubscriberDetailResult;
    }

    /**
     * Sets the value of the selectSubscriberDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSubscriberDetailOutput }
     *     
     */
    public void setSelectSubscriberDetailResult(MSubscriberDetailOutput value) {
        this.selectSubscriberDetailResult = value;
    }

}
