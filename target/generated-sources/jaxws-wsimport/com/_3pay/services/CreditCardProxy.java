
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mikro_odeme.services.CreditCardProxyInput;
import com.mikro_odeme.services.MAuthToken;


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
 *         &lt;element name="token" type="{http://services.mikro-odeme.com/}MAuthToken" minOccurs="0"/>
 *         &lt;element name="input" type="{http://services.mikro-odeme.com/}CreditCardProxyInput" minOccurs="0"/>
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
    "token",
    "input"
})
@XmlRootElement(name = "CreditCardProxy")
public class CreditCardProxy {

    protected MAuthToken token;
    protected CreditCardProxyInput input;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link MAuthToken }
     *     
     */
    public MAuthToken getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link MAuthToken }
     *     
     */
    public void setToken(MAuthToken value) {
        this.token = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardProxyInput }
     *     
     */
    public CreditCardProxyInput getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardProxyInput }
     *     
     */
    public void setInput(CreditCardProxyInput value) {
        this.input = value;
    }

}
