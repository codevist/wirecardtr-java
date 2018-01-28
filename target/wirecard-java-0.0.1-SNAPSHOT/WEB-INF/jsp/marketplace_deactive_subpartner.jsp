<%@page import="wirecard.core.entity.Token"%>
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.request.MarketPlaceDeactiveRequest"%>
<%@page import="wirecard.core.Settings"%>
<jsp:include page="layout.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Deactive Sub Partner</h2>
<fieldset>
    <legend><label style="font-weight:bold;width:250px;">MarketPlace Bilgileri</label></legend>
    <label style="font-weight:bold;">Servis Adı &nbsp; :   &nbsp; </label> CCMarketPlace<br>
    <label style="font-weight:bold;">Operasyon Adı &nbsp; :&nbsp; </label> DeactivateSubPartner <br>
    <label style="font-weight:bold;">UserCode  &nbsp;:  &nbsp;</label> Wirecard tarafından verilen değer <br>
    <label style="font-weight:bold;">Pin &nbsp;:  &nbsp;</label> Wirecard tarafından verilen değer <br>
   
</fieldset>
<br />
<br />
<form action="" method="post" class="form-horizontal">
    <fieldset>
        <!-- Form Name -->
        <legend><label style="font-weight:bold;width:250px;">UniqueId Değeri </label></legend>

        <div class="form-group">
            <label class="col-md-4 control-label" for="">UniqueId</label>
            <div class="col-md-4">
                <input name="uniqueId" class="form-control input-md" required="">
            </div>
        </div>

    </fieldset>
  
    <!-- Button -->
    <div class="form-group">
        <label class="col-md-4 control-label" for=""></label>
        <div class="col-md-4">
            <button type="submit" id="" name="" class="btn btn-success">Mağazayı Kapat</button>
        </div>
    </div>
</form>
<%
	request.setCharacterEncoding("UTF-8");

	if ("POST".equalsIgnoreCase(request.getMethod())) {
	
		/* 
		   Setting ayarlarımızı alıyoruz. Formdan gelen bilgilerle MarketPlaceDeactiveRequest sınıfımızı dolduruyoruz.
		   MarketPlaceDeactiveRequest ve Setting ayarlarımızla sayfamızı post ediyoruz.
		*/
		Settings settings = new Settings();
		settings.userCode="";
                settings.pin="";
		settings.baseUrl = "https://www.wirecard.com.tr/SGate/Gate"; //"Wirecard web servisleri API url'lerinin bilgisidir. 
		
		MarketPlaceDeactiveRequest marketPlaceDeactiveRequest = new MarketPlaceDeactiveRequest();  
                marketPlaceDeactiveRequest.ServiceType="CCMarketPlace";
		marketPlaceDeactiveRequest.OperationType="DeactivateSubPartner";          
                marketPlaceDeactiveRequest.UniqueId=request.getParameter("uniqueId");
                marketPlaceDeactiveRequest.Token= new Token();
                marketPlaceDeactiveRequest.Token.Pin=settings.pin;
                marketPlaceDeactiveRequest.Token.UserCode=settings.userCode;
                
		String marketPlaceDeactiveResponse = MarketPlaceDeactiveRequest.execute(marketPlaceDeactiveRequest,settings); //"Pazaryeri kapatma servisi başlatılması için gerekli servis çağırısını temsil eder."
		StringWriter sw = new StringWriter();
                JAXB.marshal(marketPlaceDeactiveResponse, sw);
		out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); //"MarketPlace  kapatma servis çağrısı sonucunda oluşan servis çıktı parametrelerinin ekranda gösterilmesini sağlar"
	}
%>

<jsp:include page="footer.jsp" />