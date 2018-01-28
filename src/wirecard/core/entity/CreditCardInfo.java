/*
 *   Pazaryeri  kredi kartý ödeme iþlemleri ve CCProxySale(Ödeme formu) xml verilerinin içerisinde kullanýlacak olan creditcardýnfo sýnýfýný temsil eder.
 */
package wirecard.core.entity;

import javax.xml.bind.annotation.XmlElement;

public class CreditCardInfo {
    
        @XmlElement(name = "CreditCardNo")
        public String CreditCardNo ;  
        @XmlElement(name = "OwnerName")
        public String OwnerName ;  
        @XmlElement(name = "ExpireYear")
        public int ExpireYear ;     
        @XmlElement(name = "ExpireMonth")
        public int ExpireMonth ;  
        @XmlElement(name = "Cvv")
        public String Cvv ;   
        @XmlElement(name = "Price")
        public int Price ; 
}