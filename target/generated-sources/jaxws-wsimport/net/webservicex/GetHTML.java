
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RSSURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rssurl"
})
@XmlRootElement(name = "GetHTML")
public class GetHTML {

    @XmlElement(name = "RSSURL")
    protected String rssurl;

    /**
     * Gets the value of the rssurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSSURL() {
        return rssurl;
    }

    /**
     * Sets the value of the rssurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSSURL(String value) {
        this.rssurl = value;
    }

}
