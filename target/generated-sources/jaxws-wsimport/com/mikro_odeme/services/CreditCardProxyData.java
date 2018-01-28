
package com.mikro_odeme.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditCardProxyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardProxyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardExpireMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CreditCardExpireYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CreditCardOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardProxyData", propOrder = {
    "creditCardNumber",
    "creditCardExpireMonth",
    "creditCardExpireYear",
    "creditCardOwner",
    "cvv"
})
public class CreditCardProxyData {

    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardExpireMonth")
    protected int creditCardExpireMonth;
    @XmlElement(name = "CreditCardExpireYear")
    protected int creditCardExpireYear;
    @XmlElement(name = "CreditCardOwner")
    protected String creditCardOwner;
    @XmlElement(name = "CVV")
    protected String cvv;

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardExpireMonth property.
     * 
     */
    public int getCreditCardExpireMonth() {
        return creditCardExpireMonth;
    }

    /**
     * Sets the value of the creditCardExpireMonth property.
     * 
     */
    public void setCreditCardExpireMonth(int value) {
        this.creditCardExpireMonth = value;
    }

    /**
     * Gets the value of the creditCardExpireYear property.
     * 
     */
    public int getCreditCardExpireYear() {
        return creditCardExpireYear;
    }

    /**
     * Sets the value of the creditCardExpireYear property.
     * 
     */
    public void setCreditCardExpireYear(int value) {
        this.creditCardExpireYear = value;
    }

    /**
     * Gets the value of the creditCardOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardOwner() {
        return creditCardOwner;
    }

    /**
     * Sets the value of the creditCardOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardOwner(String value) {
        this.creditCardOwner = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV(String value) {
        this.cvv = value;
    }

}
