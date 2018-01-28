<jsp:include page="layout.jsp" />
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.Settings"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<h2> Abonelik Detayları</h2>


<form action="" method="post">
    <!-- Text input-->
    <div class="form-group">
        <div class="row">

            <label class="col-md-12 control-label" for="">Abonelik Numarası</label>
            <div class="col-md-3">
                <input name="subscriberId" type="text" value=""  class="form-control" required="">
            </div>
        </div>
        <div class="row">
            <label class="col-md-12 control-label" for=""></label>
            <div class="col-md-4">
                <br />
                <button type="submit" id="" name="" class="btn btn-danger">Aboneliği İptal Et </button>
            </div>
        </div>
       
    </div>
</form>

<%-- start web service invocation --%><hr/>
             <%
                 request.setCharacterEncoding("UTF-8");

            if ("POST".equalsIgnoreCase(request.getMethod())) {
                 try {
                /*
                    Abonelik Detay soap çağrısının başlatıldığı kısmı temsil etmektedir.
                    Input ve token bilgileri doldurularak otomatik service çağrısı başlatılır.
                 */     
                 Settings settings = new Settings();
		 settings.userCode="";
                 settings.pin="";  
                 
                 com._3pay.services.SubscriberManagementService service = new com._3pay.services.SubscriberManagementService();
                 com._3pay.services.SubscriberManagementServiceSoap port = service.getSubscriberManagementServiceSoap();
                 com._3pay.services.MAuthToken token = new com._3pay.services.MAuthToken();
                 token.setUserCode(settings.userCode);
                 token.setPin(settings.pin);
                 java.lang.String subscriberId = request.getParameter("subscriberId");
                 com._3pay.services.MSubscriberDetailOutput result = port.selectSubscriberDetail(token, subscriberId);
                 
                 StringWriter sw = new StringWriter();
                 JAXB.marshal(result, sw);
		
                 out.println("  <h1>Sonuç</h1>");
                 out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); 

                 } catch (Exception ex) {
                 // TODO handle custom exceptions here
                 }
            }
             %>
             
             
<jsp:include page="footer.jsp" />
