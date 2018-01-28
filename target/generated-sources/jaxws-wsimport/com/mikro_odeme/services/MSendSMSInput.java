
package com.mikro_odeme.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSendSMSInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSendSMSInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestGsmOperator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestGsmType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSendSMSInput", propOrder = {
    "gsm",
    "content",
    "requestGsmOperator",
    "requestGsmType"
})
public class MSendSMSInput {

    @XmlElement(name = "Gsm")
    protected String gsm;
    @XmlElement(name = "Content")
    protected String content;
    @XmlElement(name = "RequestGsmOperator")
    protected int requestGsmOperator;
    @XmlElement(name = "RequestGsmType")
    protected int requestGsmType;

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

}
