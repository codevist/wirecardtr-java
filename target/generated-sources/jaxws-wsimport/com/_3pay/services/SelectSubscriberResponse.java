
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
 *         &lt;element name="SelectSubscriberResult" type="{http://www.3pay.com/services/}MSelectSubscriberOutput" minOccurs="0"/>
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
    "selectSubscriberResult"
})
@XmlRootElement(name = "SelectSubscriberResponse")
public class SelectSubscriberResponse {

    @XmlElement(name = "SelectSubscriberResult")
    protected MSelectSubscriberOutput selectSubscriberResult;

    /**
     * Gets the value of the selectSubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSelectSubscriberOutput }
     *     
     */
    public MSelectSubscriberOutput getSelectSubscriberResult() {
        return selectSubscriberResult;
    }

    /**
     * Sets the value of the selectSubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSelectSubscriberOutput }
     *     
     */
    public void setSelectSubscriberResult(MSelectSubscriberOutput value) {
        this.selectSubscriberResult = value;
    }

}
