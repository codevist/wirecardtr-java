
package sendinformationsms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSendSMSOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MSendSMSOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendSMSObjectId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GsmOperator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSendSMSOutput", propOrder = {
    "sendSMSObjectId",
    "statusCode",
    "errorCode",
    "errorMessage",
    "gsmOperator"
})
public class MSendSMSOutput {

    @XmlElement(name = "SendSMSObjectId", required = true)
    protected String sendSMSObjectId;
    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "GsmOperator")
    protected int gsmOperator;

    /**
     * Gets the value of the sendSMSObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendSMSObjectId() {
        return sendSMSObjectId;
    }

    /**
     * Sets the value of the sendSMSObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendSMSObjectId(String value) {
        this.sendSMSObjectId = value;
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

}
