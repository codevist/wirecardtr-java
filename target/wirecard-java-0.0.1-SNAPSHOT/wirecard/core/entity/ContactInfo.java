
package wirecard.core.entity;

/*
 *   pazaryeri  oluþturma ve pazaryeri güncelleme için kullanýlacak olan contactInfo sýnýfýný temsil eder.
*/
import javax.xml.bind.annotation.XmlElement;

    public class ContactInfo {
        @XmlElement(name = "Country")
        public String Country ;    
        @XmlElement(name = "City")
        public String City ;
        @XmlElement(name = "Address")
        public String Address;
        @XmlElement(name = "BusinessPhone")
        public String BusinessPhone ;
        @XmlElement(name = "MobilePhone")
        public String MobilePhone;
     
}
