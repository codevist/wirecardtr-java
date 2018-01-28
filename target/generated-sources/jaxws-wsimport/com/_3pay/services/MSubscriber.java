
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MSubscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSubscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="GSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SubscriberTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentCategoryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BasePrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BaseUnitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastSuccessfulPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GsmOperator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CancelKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSubscriber", propOrder = {
    "subscriberId",
    "gsm",
    "startDate",
    "subscriberTypeId",
    "paymentCategoryId",
    "basePrice",
    "baseUnitPrice",
    "productId",
    "productName",
    "orderChannelId",
    "active",
    "lastSuccessfulPaymentDate",
    "gsmOperator",
    "cancelKeyword"
})
public class MSubscriber {

    @XmlElement(name = "SubscriberId", required = true)
    protected String subscriberId;
    @XmlElement(name = "GSM")
    protected String gsm;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "SubscriberTypeId")
    protected int subscriberTypeId;
    @XmlElement(name = "PaymentCategoryId")
    protected int paymentCategoryId;
    @XmlElement(name = "BasePrice")
    protected double basePrice;
    @XmlElement(name = "BaseUnitPrice")
    protected double baseUnitPrice;
    @XmlElement(name = "ProductId")
    protected int productId;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "OrderChannelId")
    protected int orderChannelId;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "LastSuccessfulPaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulPaymentDate;
    @XmlElement(name = "GsmOperator")
    protected int gsmOperator;
    @XmlElement(name = "CancelKeyword")
    protected String cancelKeyword;

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
     * Gets the value of the gsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSM() {
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
    public void setGSM(String value) {
        this.gsm = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the subscriberTypeId property.
     * 
     */
    public int getSubscriberTypeId() {
        return subscriberTypeId;
    }

    /**
     * Sets the value of the subscriberTypeId property.
     * 
     */
    public void setSubscriberTypeId(int value) {
        this.subscriberTypeId = value;
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
     * Gets the value of the baseUnitPrice property.
     * 
     */
    public double getBaseUnitPrice() {
        return baseUnitPrice;
    }

    /**
     * Sets the value of the baseUnitPrice property.
     * 
     */
    public void setBaseUnitPrice(double value) {
        this.baseUnitPrice = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
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
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the lastSuccessfulPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulPaymentDate() {
        return lastSuccessfulPaymentDate;
    }

    /**
     * Sets the value of the lastSuccessfulPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulPaymentDate(XMLGregorianCalendar value) {
        this.lastSuccessfulPaymentDate = value;
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
     * Gets the value of the cancelKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelKeyword() {
        return cancelKeyword;
    }

    /**
     * Sets the value of the cancelKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelKeyword(String value) {
        this.cancelKeyword = value;
    }

}
