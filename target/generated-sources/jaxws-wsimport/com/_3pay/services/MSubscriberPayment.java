
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MSubscriberPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSubscriberPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OrderObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSubscriberPayment", propOrder = {
    "paymentDate",
    "isPaid",
    "orderObjectId"
})
public class MSubscriberPayment {

    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "IsPaid")
    protected boolean isPaid;
    @XmlElement(name = "OrderObjectId", required = true)
    protected String orderObjectId;

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the isPaid property.
     * 
     */
    public boolean isIsPaid() {
        return isPaid;
    }

    /**
     * Sets the value of the isPaid property.
     * 
     */
    public void setIsPaid(boolean value) {
        this.isPaid = value;
    }

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

}
