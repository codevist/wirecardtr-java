
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
 *         &lt;element name="GetSaleResultResult" type="{http://www.3pay.com/services/}MSaleOutput" minOccurs="0"/>
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
    "getSaleResultResult"
})
@XmlRootElement(name = "GetSaleResultResponse")
public class GetSaleResultResponse {

    @XmlElement(name = "GetSaleResultResult")
    protected MSaleOutput getSaleResultResult;

    /**
     * Gets the value of the getSaleResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleOutput }
     *     
     */
    public MSaleOutput getGetSaleResultResult() {
        return getSaleResultResult;
    }

    /**
     * Sets the value of the getSaleResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleOutput }
     *     
     */
    public void setGetSaleResultResult(MSaleOutput value) {
        this.getSaleResultResult = value;
    }

}
