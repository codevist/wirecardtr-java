
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MSelectSubscriberInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSelectSubscriberInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GSM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderChannelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubscriberType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StartDateMin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StartDateMax" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastSuccessfulPaymentDateMin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastSuccessfulPaymentDateMax" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSelectSubscriberInput", propOrder = {
    "productId",
    "gsm",
    "orderChannelId",
    "active",
    "subscriberType",
    "startDateMin",
    "startDateMax",
    "lastSuccessfulPaymentDateMin",
    "lastSuccessfulPaymentDateMax"
})
public class MSelectSubscriberInput {

    @XmlElement(name = "ProductId")
    protected int productId;
    @XmlElement(name = "GSM")
    protected String gsm;
    @XmlElement(name = "OrderChannelId")
    protected int orderChannelId;
    @XmlElement(name = "Active")
    protected int active;
    @XmlElement(name = "SubscriberType")
    protected int subscriberType;
    @XmlElement(name = "StartDateMin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateMin;
    @XmlElement(name = "StartDateMax", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateMax;
    @XmlElement(name = "LastSuccessfulPaymentDateMin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulPaymentDateMin;
    @XmlElement(name = "LastSuccessfulPaymentDateMax", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulPaymentDateMax;

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
    public int getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(int value) {
        this.active = value;
    }

    /**
     * Gets the value of the subscriberType property.
     * 
     */
    public int getSubscriberType() {
        return subscriberType;
    }

    /**
     * Sets the value of the subscriberType property.
     * 
     */
    public void setSubscriberType(int value) {
        this.subscriberType = value;
    }

    /**
     * Gets the value of the startDateMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateMin() {
        return startDateMin;
    }

    /**
     * Sets the value of the startDateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateMin(XMLGregorianCalendar value) {
        this.startDateMin = value;
    }

    /**
     * Gets the value of the startDateMax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateMax() {
        return startDateMax;
    }

    /**
     * Sets the value of the startDateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateMax(XMLGregorianCalendar value) {
        this.startDateMax = value;
    }

    /**
     * Gets the value of the lastSuccessfulPaymentDateMin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulPaymentDateMin() {
        return lastSuccessfulPaymentDateMin;
    }

    /**
     * Sets the value of the lastSuccessfulPaymentDateMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulPaymentDateMin(XMLGregorianCalendar value) {
        this.lastSuccessfulPaymentDateMin = value;
    }

    /**
     * Gets the value of the lastSuccessfulPaymentDateMax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulPaymentDateMax() {
        return lastSuccessfulPaymentDateMax;
    }

    /**
     * Sets the value of the lastSuccessfulPaymentDateMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulPaymentDateMax(XMLGregorianCalendar value) {
        this.lastSuccessfulPaymentDateMax = value;
    }

}
