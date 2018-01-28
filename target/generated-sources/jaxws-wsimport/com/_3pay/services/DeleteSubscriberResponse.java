
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
 *         &lt;element name="DeleteSubscriberResult" type="{http://www.3pay.com/services/}MOperationOutput" minOccurs="0"/>
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
    "deleteSubscriberResult"
})
@XmlRootElement(name = "DeleteSubscriberResponse")
public class DeleteSubscriberResponse {

    @XmlElement(name = "DeleteSubscriberResult")
    protected MOperationOutput deleteSubscriberResult;

    /**
     * Gets the value of the deleteSubscriberResult property.
     * 
     * @return
     *     possible object is
     *     {@link MOperationOutput }
     *     
     */
    public MOperationOutput getDeleteSubscriberResult() {
        return deleteSubscriberResult;
    }

    /**
     * Sets the value of the deleteSubscriberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MOperationOutput }
     *     
     */
    public void setDeleteSubscriberResult(MOperationOutput value) {
        this.deleteSubscriberResult = value;
    }

}
