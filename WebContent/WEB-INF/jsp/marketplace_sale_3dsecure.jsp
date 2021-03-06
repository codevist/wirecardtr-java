<%@page import="wirecard.core.entity.Token"%>
<%@page import="wirecard.core.entity.CreditCardInfo"%>
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.request.MarketPlaceSale3DSecRequest"%>
<%@page import="wirecard.core.Settings"%>
<%@page import="wirecard.core.entity.CardTokenization"%>
<%@page import="java.util.UUID"%>
<%@page contentType="text/html" pageEncoding="windows-1254"%>
<jsp:include page="layout.jsp" />
<fieldset>
    <legend><label style="font-weight:bold;width:250px;">MarketPlace Bilgileri</label></legend>
    <label style="font-weight:bold;">Servis Ad� &nbsp; :   &nbsp; </label> CCMarketPlace<br>
    <label style="font-weight:bold;">Operasyon Ad� &nbsp; :&nbsp; </label> MPSale <br>
    <label style="font-weight:bold;">UserCode  &nbsp;:  &nbsp;</label> Wirecard taraf�ndan verilen de�er <br>
    <label style="font-weight:bold;">Pin &nbsp;:  &nbsp;</label> Wirecard taraf�ndan verilen de�er <br>
    <label style="font-weight:bold;">Fiyat &nbsp;:  &nbsp;</label> 0,01 TL <br>
    <label style="font-weight:bold;">MPAY &nbsp;:  &nbsp;</label> Benzersiz i�lem numaras�. Bu parametre i�lem sonucunda aynen bize geri g�nderilir. <br>
    <label style="font-weight:bold;">Ipaddress &nbsp;:  &nbsp;</label>��lem yapan kullan�c�n�n ip adresi<br>
    <label style="font-weight:bold;">��lem ��eri�i &nbsp;:  &nbsp;</label>Bilgisayar �demesi <br>
    <label style="font-weight:bold;">A��klama &nbsp;:  &nbsp;</label>�deme i�leminin tan�m� <br>
    <label style="font-weight:bold;">Ekstra Parametre &nbsp;:  &nbsp;</label>Bu alan�n bo� olarak g�nderilmesi gerekmektedir. <br>
    <label style="font-weight:bold;">CCTokenId &nbsp;:  &nbsp;</label>�deme i�lemi i�in kullan�lacak kredi kart� i�in olu�turulmu� benzersiz token de�eri<br>
</fieldset>

<br />
<br />
<form action="" method="post" class="form-horizontal">
    <fieldset>
        <!-- Form Name -->
        <legend><label style="font-weight:bold;width:250px;">Kart Bilgileri</label></legend>
        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="">Kart Sahibi Ad� Soyad�:</label>
            <div class="col-md-4">
                <input value="Ahmet Y�lmaz" name="ownerName" class="form-control input-md">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">  Kart Numaras�:</label>
            <div class="col-md-4">
                <input value="4282209004348015" name="creditCardNo" class="form-control input-md">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">  Son Kullanma Tarihi Ay/Y�l: </label>
            <div class="col-md-4">
                <input value="12" name="expireMonth" class="form-control input-md" width="50px">
                <input value="2022" name="expireYear" class="form-control input-md" width="50px">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">  CVC: </label>
            <div class="col-md-4">
                <input value="123" name="cvv" class="form-control input-md">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">  SubPartnerId: </label>
            <div class="col-md-4">
                <input value="" name="subPartnerId" class="form-control input-md">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">  Taksit Say�s�: </label>
            <div class="col-md-4">

                <select name="installmentCount">
                    <option value="0">Pe�in</option>
                    <option value="3">3</option>
                    <option value="6">6</option>
                    <option value="9">9</option>

                </select>
            </div>
        </div>
    </fieldset>
    <!-- Button -->
    <div class="form-group">
        <label class="col-md-4 control-label" for=""></label>
        <div class="col-md-4">
            <button type="submit" id="" name="" class="btn btn-danger"> 3D Secure �le �deme Yap</button>
        </div>
    </div>
</form>

<%
	request.setCharacterEncoding("UTF-8");

	if ("POST".equalsIgnoreCase(request.getMethod())) {
	
		/* 
		   Setting ayarlar�m�z� al�yoruz. Formdan gelen bilgilerle MarketPlaceSale3DSecRequest s�n�f�m�z� dolduruyoruz.
		   MarketPlaceSale3DSecRequest ve Setting ayarlar�m�zla sayfam�z� post ediyoruz.
		*/
                UUID  uuid = UUID.randomUUID();
		Settings settings = new Settings();
                
		settings.userCode="";
                settings.pin="";
		settings.baseUrl = "https://www.wirecard.com.tr/SGate/Gate"; //"Wirecard web servisleri API url'lerinin bilgisidir. 
   
		MarketPlaceSale3DSecRequest marketPlaceSale3DSecRequest = new MarketPlaceSale3DSecRequest();  
                
                marketPlaceSale3DSecRequest.ServiceType = "CCMarketPlace";
                marketPlaceSale3DSecRequest.OperationType = "Sale3DSEC";
                marketPlaceSale3DSecRequest.MPAY = "";
                marketPlaceSale3DSecRequest.IPAddress = "127.0.0.";
                marketPlaceSale3DSecRequest.Port = "123";
                marketPlaceSale3DSecRequest.Description = "Bilgisayar";
                marketPlaceSale3DSecRequest.InstallmentCount =Integer.parseInt(request.getParameter("installmentCount"));
                marketPlaceSale3DSecRequest.CommissionRate = 100; //komisyon oran� 1. 100 ile �arp�l�p g�nderiliyor
                marketPlaceSale3DSecRequest.ExtraParam = "";
                marketPlaceSale3DSecRequest.PaymentContent = "BLGSYR01";
                marketPlaceSale3DSecRequest.SubPartnerId =Integer.parseInt(request.getParameter("subPartnerId"));
                marketPlaceSale3DSecRequest.ErrorURL = "http://localhost:8084/wirecard-java/error.htm";
                marketPlaceSale3DSecRequest.SuccessURL = "http://localhost:8084/wirecard-java/success.htm";
                
                marketPlaceSale3DSecRequest.Token = new Token();
                marketPlaceSale3DSecRequest.Token.UserCode = settings.userCode;
                marketPlaceSale3DSecRequest.Token.Pin = settings.pin;
                
                marketPlaceSale3DSecRequest.CreditCardInfo = new CreditCardInfo();
                marketPlaceSale3DSecRequest.CreditCardInfo.CreditCardNo =request.getParameter("creditCardNo");
                marketPlaceSale3DSecRequest.CreditCardInfo.OwnerName =request.getParameter("ownerName");
                marketPlaceSale3DSecRequest.CreditCardInfo.ExpireYear =Integer.parseInt(request.getParameter("expireYear"));
                marketPlaceSale3DSecRequest.CreditCardInfo.ExpireMonth =Integer.parseInt(request.getParameter("expireMonth"));
                marketPlaceSale3DSecRequest.CreditCardInfo.Cvv =request.getParameter("cvv");
                marketPlaceSale3DSecRequest.CreditCardInfo.Price = 1;//0,01 TL
                
                marketPlaceSale3DSecRequest.CardTokenization = new CardTokenization();
                marketPlaceSale3DSecRequest.CardTokenization.RequestType=0;
                marketPlaceSale3DSecRequest.CardTokenization.CustomerId="01";
                marketPlaceSale3DSecRequest.CardTokenization.ValidityPeriod=0;
                marketPlaceSale3DSecRequest.CardTokenization.CCTokenId=uuid.toString();
                
                
		String marketPlaceSale3DSecResponse = marketPlaceSale3DSecRequest.execute(marketPlaceSale3DSecRequest,settings); //"Pazaryeri 3DSecure servisi ba�lat�lmas� i�in gerekli servis �a��r�s�n� temsil eder."
		StringWriter sw = new StringWriter();
                JAXB.marshal(marketPlaceSale3DSecResponse, sw);
		out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); //"MarketPlace  3DSecure servis �a�r�s� sonucunda olu�an servis ��kt� parametrelerinin ekranda g�sterilmesini sa�lar"
	}
%>
<jsp:include page="footer.jsp" />