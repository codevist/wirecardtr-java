
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mikro_odeme.services.MSaleOutput;


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
 *         &lt;element name="CreditCardProxyResult" type="{http://services.mikro-odeme.com/}MSaleOutput" minOccurs="0"/>
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
    "creditCardProxyResult"
})
@XmlRootElement(name = "CreditCardProxyResponse")
public class CreditCardProxyResponse {

    @XmlElement(name = "CreditCardProxyResult")
    protected MSaleOutput creditCardProxyResult;

    /**
     * Gets the value of the creditCardProxyResult property.
     * 
     * @return
     *     possible object is
     *     {@link MSaleOutput }
     *     
     */
    public MSaleOutput getCreditCardProxyResult() {
        return creditCardProxyResult;
    }

    /**
     * Sets the value of the creditCardProxyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MSaleOutput }
     *     
     */
    public void setCreditCardProxyResult(MSaleOutput value) {
        this.creditCardProxyResult = value;
    }

}
