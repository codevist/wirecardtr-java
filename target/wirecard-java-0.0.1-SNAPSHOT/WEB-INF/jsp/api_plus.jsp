<jsp:include page="layout.jsp" />
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.Settings"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h2>Api Plus Yöntemi İle Ödeme </h2>
<form action="" method="post">
    <table class="table">
        <thead>
            <tr>
                <th>
                    Ürün Id
                </th>
                <th>
                    Ürün Açıklaması
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
    <hr />

    <div class="row">
        <label class="col-md-12 control-label" for="">Telefon Numarası</label>
        <div class="col-md-3">
            <input name="gsmNumber" type="text" value="" id="txtPhoneNumber" class="form-control" placeholder="(5XX)XXXXXXX" required="">
        </div>
    </div>
    <br />
    Ödeme Yöntemi:
    <br />
    <select name="paymentTypeId">
        <option value="1">Tek Çekim</option>
        <option value="2">Aylık abonelik (iletilen miktar her ay otomatik çekilir)</option>
        <option value="3">Haftalık abonelik (iletilen miktar her hafta otomatik çekilir)</option>
        <option value="4">2 haftalık abonelik</option>
        <option value="5">3 aylık abonelik</option>
        <option value="6">6 aylık abonelik</option>
        <option value="7">Aylık denemeli (ilk ay ücretlendirme yapılmaz)</option>
        <option value="8">Haftalık denemeli (ilk hafta ücretlendirme yapılmaz)</option>
        <option value="9">2 haftalık denemeli (ilk 2 hafta ücretlendirme yapılmaz)</option>
        <option value="10">3 aylık denemeli</option>
        <option value="11">6 aylık denemeli</option>
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
        <option value="3">Dijital İçerik</option>
        <option value="4">Servis </option>
        <option value="5">Sosyal Ağ/Arkadaşlık </option>
        <option value="6">Aidat/Otomat </option>
        <option value="7">Bahis </option>
        <option value="8">Sigorta </option>
        <option value="10">Kamu - bilet - fastfood </option>
        <option value="11">Cep Sigorta </option>
        <option value="12">Kutu Oyun </option>
        <option value="14">Mobil Uygulama / Mobil Market </option>
        <option value="15">Eğitim </option>
        <option value="16">Bağış (sadece Turkcell aboneleri bağış ödemesi yapabilir) </option>
        <option value="19">Sağlık </option>
        <option value="20">White Label Adult </option>

    </select>
    <br />
    <br />
    <button type="submit" id="" name="" class="btn btn-danger">Sms İle Ödeme Yap</button>
    <br/>
    <br/>

</form>
 <%-- start web service invocation --%><hr/>
             <%
                  request.setCharacterEncoding("UTF-8");

            if ("POST".equalsIgnoreCase(request.getMethod())) {
             try {
             Settings settings = new Settings();
             settings.userCode="";
             settings.pin="";    
             
             com._3pay.services.SaleService service = new com._3pay.services.SaleService();
             com._3pay.services.SaleServiceSoap port = service.getSaleServiceSoap();

             
             com._3pay.services.MAuthToken token = new com._3pay.services.MAuthToken();
             com._3pay.services.MSaleInput input = new com._3pay.services.MSaleInput();
             com._3pay.services.MSaleProduct mSaleProduct = new com._3pay.services.MSaleProduct();
            
             token.setUserCode(settings.userCode);
             token.setPin(settings.pin);
             
             mSaleProduct.setProductId(0);
             mSaleProduct.setProductCategory(1);
             mSaleProduct.setProductDescription("sadsfsd");
             mSaleProduct.setPrice(0.01);
             mSaleProduct.setUnit(1);
             
            // com._3pay.services.MSaleProduct[] mSale;
            // mSale= new com._3pay.services.MSaleProduct[] {mSaleProduct};
            // com._3pay.services.MSaleProduct[] objArr = add(mSale, mSaleProduct);
             
             
             com._3pay.services.MSaleProduct[] mSale = {mSaleProduct};
             
             input.setMPAY("");
             input.setGsm(request.getParameter("gsmNumber"));        
             input.setContent("Bilgisayar");
             input.setSendOrderResult(true);
             input.setPaymentTypeId(Integer.parseInt(request.getParameter("paymentTypeId")));
             input.setUrl("http://localhost:8084/wirecard-java/api_plus.htm");
             input.setReceivedSMSObjectId("00000000-0000-0000-0000-000000000000");        
             input.setSendNotificationSMS(true);
            // input.setProductList(mSale);
             
             input.setOnSuccessfulSMS("basarili odeme yaptiniz");
             input.setOnErrorSMS("basarisiz odeme yaptiniz");
             input.setRequestGsmOperator(0);        
             input.setRequestGsmType(0);
             input.setTurkcellServiceId("0");
             input.setExtra("");
             input.setCustomerIpAddress("127.0.0.1");        
                     
             com._3pay.services.MSaleOutput result = port.saleWithConfirm(token, input);
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
