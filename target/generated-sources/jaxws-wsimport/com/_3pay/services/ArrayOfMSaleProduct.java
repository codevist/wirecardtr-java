
package com._3pay.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMSaleProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMSaleProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSaleProduct" type="{http://www.3pay.com/services/}MSaleProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMSaleProduct", propOrder = {
    "mSaleProduct"
})
public class ArrayOfMSaleProduct {

    @XmlElement(name = "MSaleProduct", nillable = true)
    protected List<MSaleProduct> mSaleProduct;

    /**
     * Gets the value of the mSaleProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mSaleProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMSaleProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSaleProduct }
     * 
     * 
     */
    public List<MSaleProduct> getMSaleProduct() {
        if (mSaleProduct == null) {
            mSaleProduct = new ArrayList<MSaleProduct>();
        }
        return this.mSaleProduct;
    }

}
