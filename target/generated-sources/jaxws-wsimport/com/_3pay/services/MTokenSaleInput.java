
package com._3pay.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MTokenSaleInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MTokenSaleInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="MPAY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Extra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductList" type="{http://www.3pay.com/services/}ArrayOfMSaleProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MTokenSaleInput", propOrder = {
    "tokenId",
    "mpay",
    "paymentTypeId",
    "extra",
    "installmentCount",
    "productList"
})
public class MTokenSaleInput {

    @XmlElement(required = true)
    protected String tokenId;
    @XmlElement(name = "MPAY")
    protected String mpay;
    @XmlElement(name = "PaymentTypeId")
    protected int paymentTypeId;
    @XmlElement(name = "Extra")
    protected String extra;
    @XmlElement(name = "InstallmentCount")
    protected int installmentCount;
    @XmlElement(name = "ProductList")
    protected ArrayOfMSaleProduct productList;

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenId(String value) {
        this.tokenId = value;
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
     * Gets the value of the installmentCount property.
     * 
     */
    public int getInstallmentCount() {
        return installmentCount;
    }

    /**
     * Sets the value of the installmentCount property.
     * 
     */
    public void setInstallmentCount(int value) {
        this.installmentCount = value;
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

}
