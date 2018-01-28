
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
 *         &lt;element name="QueryMicroPaymentsResult" type="{http://www.3pay.com/services/}MQueryOutput" minOccurs="0"/>
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
    "queryMicroPaymentsResult"
})
@XmlRootElement(name = "QueryMicroPaymentsResponse")
public class QueryMicroPaymentsResponse {

    @XmlElement(name = "QueryMicroPaymentsResult")
    protected MQueryOutput queryMicroPaymentsResult;

    /**
     * Gets the value of the queryMicroPaymentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link MQueryOutput }
     *     
     */
    public MQueryOutput getQueryMicroPaymentsResult() {
        return queryMicroPaymentsResult;
    }

    /**
     * Sets the value of the queryMicroPaymentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MQueryOutput }
     *     
     */
    public void setQueryMicroPaymentsResult(MQueryOutput value) {
        this.queryMicroPaymentsResult = value;
    }

}
