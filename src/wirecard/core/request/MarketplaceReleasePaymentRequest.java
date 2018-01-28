

package wirecard.core.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import wirecard.core.RestHttpCaller;
import wirecard.core.Settings;
import wirecard.core.entity.Token;

/*
 *  Pazaryeri ödeme onayý için gerekli olan sýnýfý temsil etmektedir.
 *  Ayrýca execute metodu içerisinde istek sýnýfý ve url bilgisiyle post iþlemi baþlatýlýr.
 *  Post iþlemi sonucunda oluþan response deðeri ekranda kullanýya gösterilir.
 */
@XmlRootElement(name = "WIRECARD")
public class MarketplaceReleasePaymentRequest {
    
        @XmlElement(name ="ServiceType")
        public String ServiceType ;
        @XmlElement(name ="OperationType")
        public String OperationType ;
        @XmlElement(name ="Token")
        public Token Token ;
        @XmlElement(name ="SubPartnerId")
        public int SubPartnerId ;
        @XmlElement(name ="CommissionRate")
        public int CommissionRate ;
        @XmlElement(name ="MPAY")
        public String MPAY ;
        @XmlElement(name ="OrderId")
        public String OrderId ;
        @XmlElement(name ="Description")
        public String Description ;
        
         public static String execute(MarketplaceReleasePaymentRequest request, Settings settings) throws Exception {         
		return RestHttpCaller.getInstance().postXML(settings.baseUrl,request);
	}
}
