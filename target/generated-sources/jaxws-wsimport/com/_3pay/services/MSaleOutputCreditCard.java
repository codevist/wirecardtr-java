
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSaleOutputCreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSaleOutputCreditCard">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.3pay.com/services/}MSaleOutput">
 *       &lt;sequence>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SessionObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ExtraParam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCardObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="MaskedCreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CCSaleTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSaleOutputCreditCard", propOrder = {
    "basePrice",
    "sessionObjectId",
    "extraParam",
    "creditCardObjectId",
    "maskedCreditCardNumber",
    "errorURL",
    "successURL",
    "ccSaleTypeId"
})
public class MSaleOutputCreditCard
    extends MSaleOutput
{

    @XmlElement(name = "BasePrice")
    protected double basePrice;
    @XmlElement(name = "SessionObjectId", required = true)
    protected String sessionObjectId;
    @XmlElement(name = "ExtraParam")
    protected String extraParam;
    @XmlElement(name = "CreditCardObjectId", required = true)
    protected String creditCardObjectId;
    @XmlElement(name = "MaskedCreditCardNumber")
    protected String maskedCreditCardNumber;
    @XmlElement(name = "ErrorURL")
    protected String errorURL;
    @XmlElement(name = "SuccessURL")
    protected String successURL;
    @XmlElement(name = "CCSaleTypeId")
    protected int ccSaleTypeId;

    /**
     * Gets the value of the basePrice property.
     * 
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     */
    public void setBasePrice(double value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the sessionObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionObjectId() {
        return sessionObjectId;
    }

    /**
     * Sets the value of the sessionObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionObjectId(String value) {
        this.sessionObjectId = value;
    }

    /**
     * Gets the value of the extraParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraParam() {
        return extraParam;
    }

    /**
     * Sets the value of the extraParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraParam(String value) {
        this.extraParam = value;
    }

    /**
     * Gets the value of the creditCardObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardObjectId() {
        return creditCardObjectId;
    }

    /**
     * Sets the value of the creditCardObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardObjectId(String value) {
        this.creditCardObjectId = value;
    }

    /**
     * Gets the value of the maskedCreditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCreditCardNumber() {
        return maskedCreditCardNumber;
    }

    /**
     * Sets the value of the maskedCreditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCreditCardNumber(String value) {
        this.maskedCreditCardNumber = value;
    }

    /**
     * Gets the value of the errorURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorURL() {
        return errorURL;
    }

    /**
     * Sets the value of the errorURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorURL(String value) {
        this.errorURL = value;
    }

    /**
     * Gets the value of the successURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessURL() {
        return successURL;
    }

    /**
     * Sets the value of the successURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessURL(String value) {
        this.successURL = value;
    }

    /**
     * Gets the value of the ccSaleTypeId property.
     * 
     */
    public int getCCSaleTypeId() {
        return ccSaleTypeId;
    }

    /**
     * Sets the value of the ccSaleTypeId property.
     * 
     */
    public void setCCSaleTypeId(int value) {
        this.ccSaleTypeId = value;
    }

}
