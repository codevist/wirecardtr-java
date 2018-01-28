
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSaleTicketInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSaleTicketInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendOrderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PaymentTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReceivedSMSObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="ProductList" type="{http://www.3pay.com/services/}ArrayOfMSaleProduct" minOccurs="0"/>
 *         &lt;element name="SendNotificationSMS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OnSuccessfulSMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OnErrorSMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestGsmOperator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestGsmType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuccessfulPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TurkcellServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSaleTicketInput", propOrder = {
    "mpay",
    "content",
    "sendOrderResult",
    "paymentTypeId",
    "receivedSMSObjectId",
    "productList",
    "sendNotificationSMS",
    "onSuccessfulSMS",
    "onErrorSMS",
    "requestGsmOperator",
    "requestGsmType",
    "url",
    "successfulPageUrl",
    "errorPageUrl",
    "country",
    "currency",
    "extra",
    "turkcellServiceId"
})
@XmlSeeAlso({
    MSaleTicketInputExtended.class
})
public class MSaleTicketInput {

    @XmlElement(name = "MPAY")
    protected String mpay;
    @XmlElement(name = "Content")
    protected String content;
    @XmlElement(name = "SendOrderResult")
    protected boolean sendOrderResult;
    @XmlElement(name = "PaymentTypeId")
    protected int paymentTypeId;
    @XmlElement(name = "ReceivedSMSObjectId", required = true)
    protected String receivedSMSObjectId;
    @XmlElement(name = "ProductList")
    protected ArrayOfMSaleProduct productList;
    @XmlElement(name = "SendNotificationSMS")
    protected boolean sendNotificationSMS;
    @XmlElement(name = "OnSuccessfulSMS")
    protected String onSuccessfulSMS;
    @XmlElement(name = "OnErrorSMS")
    protected String onErrorSMS;
    @XmlElement(name = "RequestGsmOperator")
    protected int requestGsmOperator;
    @XmlElement(name = "RequestGsmType")
    protected int requestGsmType;
    @XmlElement(name = "Url")
    protected String url;
    @XmlElement(name = "SuccessfulPageUrl")
    protected String successfulPageUrl;
    @XmlElement(name = "ErrorPageUrl")
    protected String errorPageUrl;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Extra")
    protected String extra;
    @XmlElement(name = "TurkcellServiceId")
    protected String turkcellServiceId;

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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the sendOrderResult property.
     * 
     */
    public boolean isSendOrderResult() {
        return sendOrderResult;
    }

    /**
     * Sets the value of the sendOrderResult property.
     * 
     */
    public void setSendOrderResult(boolean value) {
        this.sendOrderResult = value;
    }

    /**
     * Gets the value of the paymentTypeId property.
     * 
     */
    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    /**
     * Sets the value of the paymentTypeId property.
     * 
     */
    public void setPaymentTypeId(int value) {
        this.paymentTypeId = value;
    }

    /**
     * Gets the value of the receivedSMSObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedSMSObjectId() {
        return receivedSMSObjectId;
    }

    /**
     * Sets the value of the receivedSMSObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedSMSObjectId(String value) {
        this.receivedSMSObjectId = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMSaleProduct }
     *     
     */
    public ArrayOfMSaleProduct getProductList() {
        return productList;
    }

    /**
     * Sets the value of the productList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMSaleProduct }
     *     
     */
    public void setProductList(ArrayOfMSaleProduct value) {
        this.productList = value;
    }

    /**
     * Gets the value of the sendNotificationSMS property.
     * 
     */
    public boolean isSendNotificationSMS() {
        return sendNotificationSMS;
    }

    /**
     * Sets the value of the sendNotificationSMS property.
     * 
     */
    public void setSendNotificationSMS(boolean value) {
        this.sendNotificationSMS = value;
    }

    /**
     * Gets the value of the onSuccessfulSMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSuccessfulSMS() {
        return onSuccessfulSMS;
    }

    /**
     * Sets the value of the onSuccessfulSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSuccessfulSMS(String value) {
        this.onSuccessfulSMS = value;
    }

    /**
     * Gets the value of the onErrorSMS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnErrorSMS() {
        return onErrorSMS;
    }

    /**
     * Sets the value of the onErrorSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnErrorSMS(String value) {
        this.onErrorSMS = value;
    }

    /**
     * Gets the value of the requestGsmOperator property.
     * 
     */
    public int getRequestGsmOperator() {
        return requestGsmOperator;
    }

    /**
     * Sets the value of the requestGsmOperator property.
     * 
     */
    public void setRequestGsmOperator(int value) {
        this.requestGsmOperator = value;
    }

    /**
     * Gets the value of the requestGsmType property.
     * 
     */
    public int getRequestGsmType() {
        return requestGsmType;
    }

    /**
     * Sets the value of the requestGsmType property.
     * 
     */
    public void setRequestGsmType(int value) {
        this.requestGsmType = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the successfulPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessfulPageUrl() {
        return successfulPageUrl;
    }

    /**
     * Sets the value of the successfulPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessfulPageUrl(String value) {
        this.successfulPageUrl = value;
    }

    /**
     * Gets the value of the errorPageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorPageUrl() {
        return errorPageUrl;
    }

    /**
     * Sets the value of the errorPageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorPageUrl(String value) {
        this.errorPageUrl = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

    /**
     * Gets the value of the turkcellServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurkcellServiceId() {
        return turkcellServiceId;
    }

    /**
     * Sets the value of the turkcellServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurkcellServiceId(String value) {
        this.turkcellServiceId = value;
    }

}
