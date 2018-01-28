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


<h2>Pro Api Yöntemi Ýle Ödeme </h2>
<hr/>

<form action="" method="post" class="form-horizontal">
  <p>
    <form action="" method="post">
        <table class="table">
            <thead>
                <tr>
                    <th>
                        Ürün Id
                    </th>
                    <th>
                        Ürün Açýklamasý
                    </th>
                    <th>
                        Birim Fiyat
                    </th>
                    <th>
                        Unit
                    </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        0
                    </td>
                    <td>
                        Telefon
                    </td>
                    <td>
                        0.01 TL
                    </td>
                    <td>
                        1
                    </td>
                </tr>

            </tbody>
        </table>
        <hr/>
        Ödeme Yöntemi:
        <br/>
        <select name="paymentTypeId">
            <option value="1">Tek Çekim</option>
            <option value="2">Aylýk abonelik (iletilen miktar her ay otomatik çekilir)</option>
            <option value="3">Haftalýk abonelik (iletilen miktar her hafta otomatik çekilir)</option>
            <option value="4">2 haftalýk abonelik</option>
            <option value="5">3 aylýk abonelik</option>
            <option value="6">6 aylýk abonelik</option>
            <option value="7">Aylýk denemeli (ilk ay ücretlendirme yapýlmaz)</option>
            <option value="8">Haftalýk denemeli (ilk hafta ücretlendirme yapýlmaz)</option>
            <option value="9">2 haftalýk denemeli (ilk 2 hafta ücretlendirme yapýlmaz)</option>
            <option value="10">3 aylýk denemeli</option>
            <option value="11">6 aylýk denemeli</option>
            <option value="13">30 günlük</option>
            <option value="14">Günlük abonelik</option>
        </select>
        <br />
        <br />
        
        Ürün Kategorisi: 
        <br />
        <select name="productCategoryId">
            <option value="1">Fiziksel Ürün</option>
            <option value="2">Oyun</option>
            <option value="3">Dijital Ýçerik</option>
            <option value="4">Servis </option>
            <option value="5">Sosyal Að/Arkadaþlýk </option>
            <option value="6">Aidat/Otomat </option>
            <option value="7">Bahis </option>
            <option value="8">Sigorta </option>
            <option value="10">Kamu - bilet - fastfood </option>
            <option value="11">Cep Sigorta </option>
            <option value="12">Kutu Oyun </option>
            <option value="14">Mobil Uygulama / Mobil Market </option>
            <option value="15">Eðitim </option>
            <option value="16">Baðýþ (sadece Turkcell aboneleri baðýþ ödemesi yapabilir) </option>
            <option value="19">Saðlýk </option>
            <option value="20">White Label Adult </option>
           
        </select>
        <br />
        <br />
        <button type="submit" id="" name="" class="btn btn-danger">Sms Ýle Ödeme Yap</button>
    
    </form>
<%-- start web service invocation --%><hr/>
               <%
              request.setCharacterEncoding("UTF-8");

            if ("POST".equalsIgnoreCase(request.getMethod())) 
            {
               try {
                   
               /*
                   Api Plus soap çaðrýsýnýn baþlatýldýðý kýsmý temsil etmektedir.
                   ýnput ve token bilgileri doldurularak otomatik service çaðrýsý baþlatýlýr.
               */  
               
               Settings settings = new Settings();
               settings.userCode="";
               settings.pin="";  
               com._3pay.services.SaleService service = new com._3pay.services.SaleService();
               com._3pay.services.SaleServiceSoap port = service.getSaleServiceSoap();
               com._3pay.services.MAuthToken token = new com._3pay.services.MAuthToken();
               com._3pay.services.MSaleTicketInput input = new com._3pay.services.MSaleTicketInput();
               
               input.setMPAY("");
               input.setContent("Bilgisayar");
               input.setSendOrderResult(true);
               input.setPaymentTypeId(Integer.parseInt(request.getParameter("paymentTypeId")));
               input.setReceivedSMSObjectId("00000000-0000-0000-0000-000000000000");  
               // input.setProductList(mSale);
               input.setSendNotificationSMS(true);
               input.setOnSuccessfulSMS("basarili odeme yaptiniz");
               input.setOnErrorSMS("basarisiz odeme yaptiniz");
               input.setRequestGsmOperator(0);        
               input.setRequestGsmType(0);
               input.setUrl("http://localhost:8084/wirecard-java/pro_api.htm");
               input.setSuccessfulPageUrl("http://localhost:8084/wirecard-java/success.php");
               input.setErrorPageUrl("http://localhost:8084/wirecard-java/fail.php");
               input.setCountry("");
               input.setCurrency("");
               input.setExtra("");
               input.setTurkcellServiceId("0");
               
               token.setUserCode(settings.userCode);
               token.setPin(settings.pin);
               
               com._3pay.services.MSaleTicketOutput result = port.saleWithTicket(token, input);

               StringWriter sw = new StringWriter();
               JAXB.marshal(result, sw);
		
               out.println("  <h1>Sonuç</h1>");
               out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); 
               } catch (Exception ex) {
               
               }
            }
               %>
               <%-- end web service invocation --%><hr/>
  <jsp:include page="footer.jsp" />