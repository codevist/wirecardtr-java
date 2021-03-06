<%@page import="wirecard.core.entity.Token"%>
<%@page import="wirecard.core.entity.ContactInfo"%>
<%@page import="wirecard.core.entity.FinancialInfo"%>
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.request.MarketPlaceAddSubMerchantRequest"%>
<%@page import="wirecard.core.Settings"%>
<%@page import="java.util.UUID"%>
<jsp:include page="layout.jsp" />
<%@page contentType="text/html" pageEncoding="windows-1254"%>
<h2>Pazaryeri Olu�turma</h2>


<fieldset>
    <legend><label style="font-weight:bold;width:250px;">MarketPlace Bilgileri</label></legend>
    <label style="font-weight:bold;">Servis Ad� &nbsp; :   &nbsp; </label> CCMarketPlace<br>
    <label style="font-weight:bold;">Operasyon Ad� &nbsp; :&nbsp; </label> AddSubPartner <br>
    <label style="font-weight:bold;">UserCode  &nbsp;:  &nbsp;</label> Wirecard taraf�ndan verilen de�er <br>
    <label style="font-weight:bold;">Pin &nbsp;:  &nbsp;</label> Wirecard taraf�ndan verilen de�er <br>
    <label style="font-weight:bold;">UniqueId &nbsp;:&nbsp;  </label> benzersiz id de�eri <br>
    <label style="font-weight:bold;">�� Telefonu &nbsp;: &nbsp; </label>2121111111 <br>
    <label style="font-weight:bold;">Vergi Dairesi &nbsp;: &nbsp; </label>�stanbul <br>
    <label style="font-weight:bold;">Vergi Numaras� &nbsp;: &nbsp; </label>11111111111 <br>
    <label style="font-weight:bold;">Banka Ad� &nbsp;: &nbsp; </label>Ziraat Bankas� <br>
    <label style="font-weight:bold;">IBAN &nbsp;: &nbsp; </label>TR330006100519786457841326 <br>
    <label style="font-weight:bold;">Banka Hesap Ad� &nbsp;: &nbsp; </label>Fatih Co�kun <br>
    <label style="font-weight:bold;">Ma�aza �lkesi&nbsp;:&nbsp;</label>TR<br>
    <label style="font-weight:bold;">Ma�aza �ehri &nbsp;</label>&nbsp; 34<br>
    <label style="font-weight:bold;">Ma�aza A��k Adresi</label>Gayrettepe Mh. Y�ld�z Posta Cd. D Plaza No:52 K:6 34349 Be�ikta� / �stanbul<br>
    
</fieldset>

<br />
<form action="" method="post" class="form-horizontal">
    <fieldset>
        <!-- Form Name -->
        <legend><label style="font-weight:bold;width:250px;">Market Place Detaylar�</label></legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="">Ma�aza Tipi:</label>
            <div class="col-md-4">
               
                <select name="subPartnerType">
                    <option value="Individual">Individual - �ah�s firmas�</option>
                    <option value="PrivateCompany">PrivateCompany - �zel �irket</option>
                    <option value="Corporation">Corporation - Kurumsal</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">Ma�aza Ad�</label>
            <div class="col-md-4">
                <input  name="name" class="form-control input-md">
            </div>
        </div>
     
        <div class="form-group">
            <label class="col-md-4 control-label" for="">Ma�azaya veya ma�aza yetkilisine ait mobil telefon</label>
            <div class="col-md-4">
                <input name="mobilePhoneNumber" class="form-control input-md">
            </div>
        </div>
        <div class="form-group">
            <label class="col-md-4 control-label" for="">Ma�aza sahibine veya yetkilisine ait TC kimlik numaras�</label>
            <div class="col-md-4">
                <input name="identityNumber" class="form-control input-md">
            </div>
        </div>

    </fieldset>

   
    <!-- Button -->
    <div class="form-group">
        <label class="col-md-4 control-label" for=""></label>
        <div class="col-md-4">
            <button type="submit" id="" name="" class="btn btn-success">Ma�aza Olu�tur</button>
        </div>
    </div>
</form>

<%
	request.setCharacterEncoding("UTF-8");

	if ("POST".equalsIgnoreCase(request.getMethod())) {
	
		/* 
		   Setting ayarlar�m�z� al�yoruz. Formdan gelen bilgilerle MarketPlaceAddSubMerchantRequest s�n�f�m�z� dolduruyoruz.
		   MarketPlaceAddSubMerchantRequest ve Setting ayarlar�m�zla sayfam�z� post ediyoruz.
		*/
		Settings settings = new Settings();
		settings.userCode="";
                settings.pin="";
		settings.baseUrl = "https://www.wirecard.com.tr/SGate/Gate"; //"Wirecard web servisleri API url'lerinin bilgisidir. 
		
		MarketPlaceAddSubMerchantRequest marketPlaceAddSubMerchantRequest = new MarketPlaceAddSubMerchantRequest();  
                
                
                
                marketPlaceAddSubMerchantRequest.ServiceType="CCMarketPlace";
		marketPlaceAddSubMerchantRequest.OperationType="AddSubPartner";   
                marketPlaceAddSubMerchantRequest.UniqueId = "123456";
                marketPlaceAddSubMerchantRequest.SubPartnerType=request.getParameter("subPartnerType");
                marketPlaceAddSubMerchantRequest.Name=request.getParameter("name");
                
                
                marketPlaceAddSubMerchantRequest.Token= new Token();
                marketPlaceAddSubMerchantRequest.Token.Pin=settings.pin;
                marketPlaceAddSubMerchantRequest.Token.UserCode=settings.userCode;
                
                
                marketPlaceAddSubMerchantRequest.ContactInfo= new ContactInfo();
                marketPlaceAddSubMerchantRequest.ContactInfo.Country = "TR";
                marketPlaceAddSubMerchantRequest.ContactInfo.City = "34";
                marketPlaceAddSubMerchantRequest.ContactInfo.Address = "Gayrettepe Mh. Y�ld�z Posta Cd. D Plaza No:52 K:6 34349 Be�ikta� / �stanbul";
                marketPlaceAddSubMerchantRequest.ContactInfo.MobilePhone =request.getParameter("mobilePhoneNumber");
                marketPlaceAddSubMerchantRequest.ContactInfo.BusinessPhone = "2121111111";
                
                marketPlaceAddSubMerchantRequest.FinancialInfo = new FinancialInfo();
                marketPlaceAddSubMerchantRequest.FinancialInfo.IdentityNumber =request.getParameter("identityNumber");
                marketPlaceAddSubMerchantRequest.FinancialInfo.TaxOffice = "�stanbul";
                marketPlaceAddSubMerchantRequest.FinancialInfo.TaxNumber = "11111111111";
                marketPlaceAddSubMerchantRequest.FinancialInfo.BankName = "0012";
                marketPlaceAddSubMerchantRequest.FinancialInfo.IBAN = "TR330006100519786457841326";
                marketPlaceAddSubMerchantRequest.FinancialInfo.AccountName = "Ahmet Y�lmaz";
                
		String marketPlaceAddSubMerchantResponse = marketPlaceAddSubMerchantRequest.execute(marketPlaceAddSubMerchantRequest,settings); //"Pazaryeri Olu�turma servisi ba�lat�lmas� i�in gerekli servis �a��r�s�n� temsil eder."
		StringWriter sw = new StringWriter();
                JAXB.marshal(marketPlaceAddSubMerchantResponse, sw);
		out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); //"Pazaryeri  Olu�turma servis �a�r�s� sonucunda olu�an servis ��kt� parametrelerinin ekranda g�sterilmesini sa�lar"
	}
%>


<jsp:include page="footer.jsp" />