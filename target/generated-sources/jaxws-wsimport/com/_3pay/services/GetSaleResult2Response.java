
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
 *         &lt;element name="GetSaleResult2Result" type="{http://www.3pay.com/services/}MSaleResult" minOccurs="0"/>
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
    "getSaleResult2Result"
})
@XmlRootElement(name = "GetSaleResult2Response")
public class GetSaleResult2Response {

    @XmlElement(name = "GetSaleResult2Result")
    protected MSaleResult getSaleResult2Result;

    /**
     * Gets the value of the getSaleResult2Result property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleResult }
     *     
     */
    public MSaleResult getGetSaleResult2Result() {
        return getSaleResult2Result;
    }

    /**
     * Sets the value of the getSaleResult2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleResult }
     *     
     */
    public void setGetSaleResult2Result(MSaleResult value) {
        this.getSaleResult2Result = value;
    }

}
