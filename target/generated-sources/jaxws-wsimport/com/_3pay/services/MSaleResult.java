
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MSaleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSaleResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Gsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GsmOperator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GsmType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubscriberId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MicroPaymentResults" type="{http://www.3pay.com/services/}ArrayOfMMicroPaymentOutput" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Products" type="{http://www.3pay.com/services/}ArrayOfMSaleProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSaleResult", propOrder = {
    "orderObjectId",
    "gsm",
    "gsmOperator",
    "gsmType",
    "state",
    "orderChannelId",
    "paymentCategoryId",
    "lastTransactionDate",
    "mpay",
    "subscriberId",
    "pin",
    "microPaymentResults",
    "statusCode",
    "errorCode",
    "errorMessage",
    "basePrice",
    "products"
})
public class MSaleResult {

    @XmlElement(name = "OrderObjectId", required = true)
    protected String orderObjectId;
    @XmlElement(name = "Gsm")
    protected String gsm;
    @XmlElement(name = "GsmOperator")
    protected int gsmOperator;
    @XmlElement(name = "GsmType")
    protected int gsmType;
    @XmlElement(name = "State")
    protected int state;
    @XmlElement(name = "OrderChannelId")
    protected int orderChannelId;
    @XmlElement(name = "PaymentCategoryId")
    protected int paymentCategoryId;
    @XmlElement(name = "LastTransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastTransactionDate;
    @XmlElement(name = "MPAY")
    protected String mpay;
    @XmlElement(name = "SubscriberId", required = true)
    protected String subscriberId;
    @XmlElement(name = "PIN")
    protected String pin;
    @XmlElement(name = "MicroPaymentResults")
    protected ArrayOfMMicroPaymentOutput microPaymentResults;
    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "BasePrice")
    protected double basePrice;
    @XmlElement(name = "Products")
    protected ArrayOfMSaleProduct products;

    /**
     * Gets the value of the orderObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderObjectId() {
        return orderObjectId;
    }

    /**
     * Sets the value of the orderObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderObjectId(String value) {
        this.orderObjectId = value;
    }

    /**
     * Gets the value of the gsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsm() {
        return gsm;
    }

    /**
     * Sets the value of the gsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsm(String value) {
        this.gsm = value;
    }

    /**
     * Gets the value of the gsmOperator property.
     * 
     */
    public int getGsmOperator() {
        return gsmOperator;
    }

    /**
     * Sets the value of the gsmOperator property.
     * 
     */
    public void setGsmOperator(int value) {
        this.gsmOperator = value;
    }

    /**
     * Gets the value of the gsmType property.
     * 
     */
    public int getGsmType() {
        return gsmType;
    }

    /**
     * Sets the value of the gsmType property.
     * 
     */
    public void setGsmType(int value) {
        this.gsmType = value;
    }

    /**
     * Gets the value of the state property.
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

    /**
     * Gets the value of the orderChannelId property.
     * 
     */
    public int getOrderChannelId() {
        return orderChannelId;
    }

    /**
     * Sets the value of the orderChannelId property.
     * 
     */
    public void setOrderChannelId(int value) {
        this.orderChannelId = value;
    }

    /**
     * Gets the value of the paymentCategoryId property.
     * 
     */
    public int getPaymentCategoryId() {
        return paymentCategoryId;
    }

    /**
     * Sets the value of the paymentCategoryId property.
     * 
     */
    public void setPaymentCategoryId(int value) {
        this.paymentCategoryId = value;
    }

    /**
     * Gets the value of the lastTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastTransactionDate() {
        return lastTransactionDate;
    }

    /**
     * Sets the value of the lastTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastTransactionDate(XMLGregorianCalendar value) {
        this.lastTransactionDate = value;
    }

    /**
     * Gets the value of the mpay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPAY() {
        return mpay;
    }

    /**
     * Sets the value of the mpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPAY(String value) {
        this.mpay = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIN(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the microPaymentResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMMicroPaymentOutput }
     *     
     */
    public ArrayOfMMicroPaymentOutput getMicroPaymentResults() {
        return microPaymentResults;
    }

    /**
     * Sets the value of the microPaymentResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMMicroPaymentOutput }
     *     
     */
    public void setMicroPaymentResults(ArrayOfMMicroPaymentOutput value) {
        this.microPaymentResults = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

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
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMSaleProduct }
     *     
     */
    public ArrayOfMSaleProduct getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMSaleProduct }
     *     
     */
    public void setProducts(ArrayOfMSaleProduct value) {
        this.products = value;
    }

}
