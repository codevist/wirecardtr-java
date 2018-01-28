
package com.mikro_odeme.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardProxyInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardProxyInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.mikro-odeme.com/}MSaleInput">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://services.mikro-odeme.com/}CreditCardProxyData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardProxyInput", propOrder = {
    "data"
})
public class CreditCardProxyInput
    extends MSaleInput
{

    @XmlElement(name = "Data")
    protected CreditCardProxyData data;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardProxyData }
     *     
     */
    public CreditCardProxyData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardProxyData }
     *     
     */
    public void setData(CreditCardProxyData value) {
        this.data = value;
    }

}
