/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wirecard.core.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import wirecard.core.RestHttpCaller;
import wirecard.core.Settings;
import wirecard.core.entity.Token;

/*
 *  Pazaryeri iptal etmek için gerekli olan sýnýfý temsil etmektedir.
 *  Ayrýca execute metodu içerisinde istek sýnýfý ve url bilgisiyle post iþlemi baþlatýlýr.
 *  Post iþlemi sonucunda oluþan response deðeri ekranda kullanýya gösterilir.
 */
@XmlRootElement(name = "WIRECARD")
public class MarketPlaceDeactiveRequest {
       @XmlElement(name ="ServiceType")
       public String ServiceType ;
       @XmlElement(name ="OperationType")
       public String OperationType ;
       @XmlElement(name ="Token")
       public Token Token; 
       @XmlElement(name ="UniqueId")
       public String UniqueId ;
       
       public static String execute(MarketPlaceDeactiveRequest request, Settings settings) throws Exception {         
		return RestHttpCaller.getInstance().postXML(settings.baseUrl,request);
	}
}