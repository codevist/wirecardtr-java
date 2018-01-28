
<jsp:include page="layout.jsp" />
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.Settings"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h2>Bilgi Sms'i Gönderim Servisi</h2>
<hr/>
<form action="" method="post">

    <div class="row">
        <label class="col-md-12 control-label" for="">SMS Gönderilecek Telefon Numarası:</label>
        <div class="col-md-2">
            <input name="gsm" type="text" id="txtPhoneNumber" value="" class="form-control" placeholder="5XXXXXXXXX" required="">
        </div>
    </div>
    <br/>
    <div class="row">
        <label class="col-md-12 control-label" for="">SMS Metni (Türkçe karakter kullanılmamalı)</label>
        <div class="col-md-2">
            <textarea name="content" rows="8" cols="60"   required=""></textarea>
        </div>
    </div>
    <div class="row">
        <label class="col-md-12 control-label" for=""></label>
        <div class="col-md-4">
            <br />
            <button type="submit" id="" name="" class="btn btn-danger">Bilgi Sms'i Gönder</button>
        </div>
    </div>

</form>







<%-- start web service invocation --%><hr/>
             <%
                 request.setCharacterEncoding("UTF-8");
            if ("POST".equalsIgnoreCase(request.getMethod())) {
                try {
                          /*
                            bilgi Sms'i soap çağrısının başlatıldığı kısmı temsil etmektedir.
                            ınput ve token bilgileri doldurularak otomatik service çağrısı başlatılır.
                        */  
                    
                         Settings settings = new Settings();
                         settings.userCode="";
                         settings.pin=""; 
                            
                          com.mikro_odeme.services.MSendSMSService service = new com.mikro_odeme.services.MSendSMSService();
                          com.mikro_odeme.services.MSendSMSServiceSoap port = service.getMSendSMSServiceSoap();
   
                          com.mikro_odeme.services.MAuthToken token = new com.mikro_odeme.services.MAuthToken();
                          com.mikro_odeme.services.MSendSMSInput input = new com.mikro_odeme.services.MSendSMSInput();
                          
                          token.setUserCode(settings.userCode);
                          token.setPin(settings.pin);
                          input.setGsm(request.getParameter("gsm"));
                          input.setContent(request.getParameter("content"));
                          input.setRequestGsmOperator(0);
                          input.setRequestGsmType(0);
                          
                          com.mikro_odeme.services.MSendSMSOutput result = port.sendSMS(token, input);
                          
                           StringWriter sw = new StringWriter();
                           JAXB.marshal(result, sw);
                          out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); 
                          } catch (Exception ex) {
                          // TODO handle custom exceptions here
                          }
            }
            %>

<jsp:include page="footer.jsp" />



