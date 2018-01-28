<jsp:include page="layout.jsp" />
<%@page import="wirecard.core.Helper"%>
<%@page import="javax.xml.bind.JAXB"%>
<%@page import="java.io.StringWriter"%>
<%@page import="wirecard.core.Settings"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date "%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>



<%@ page import = "java.util.Date,java.text.SimpleDateFormat,java.text.ParseException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link
	href="<%=request.getContextPath()%>/Content/css/jquery-ui.css"
	rel="stylesheet"
	type="text/css"
/>
<form action="" method="post">

    <!-- Text input-->
    <div class="form-group">
        <div class="row">

            <label class="col-md-12 control-label" for="">Telefon Numarası</label>
            <div class="col-md-3">
                <input name="gsmNumber" type="text" value="" id="txtPhoneNumber" class="form-control" placeholder="(5XX)XXXXXXX" required="">
            </div>
        </div>

        <div class="row">
            <br />
            <label class="col-md-12 control-label" for=""> Ödeme Yöntemi:</label>
            <div class="col-md-12">
                <select name="subscriberTypeId">
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
            </div>
        </div>
        <br />
        <div class="row">
            <div class="col-md-2">
                <label class="col-md-12 control-label" for="">Abonelik Satış Kanalı</label>
                <div class="col-md-12">
                    <select name="orderChannelId">
                        <option value="100">Pro Api</option>
                        <option value="101">Basic Api</option>
                        <option value="102">Sms</option>
                        <option value="103">Direct Api</option>
                        <option value="104">Api Plus</option>

                    </select>
                </div>
            </div>
            <div class="col-md-4">
                <label class="col-md-12 control-label" for="">Abonelik Aktif/Pasif Bilgisi</label>
                <div class="col-md-12">
                    <select name="activeTypeId">
                        <option value="1">Aktif</option>
                        <option value="0">Pasif</option>
                        <option value="-1">Hepsi</option>

                    </select>
                </div>
            </div>

        </div>
        <br />
        <div class="row">
            <div class="form-group">
                <label class="control-label col-md-2">Abonelik Başlangıç Tar.</label>
                <div class="col-md-3">
                <input name="startDateMin" type="text" value="" id="txtStartDateMin" class="form-control"  @readonly = "readonly", required="">
                    <span class="help-block">
                        Abonelik başlangıç tarihini belirtir (alt sınır)
                    </span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <label class="control-label col-md-2">Abonelik Başlangıç Tar.</label>
                <div class="col-md-3">
                 
                    <input name="startDateMax" type="text" value="" id="txtStartDateMax" class="form-control"  @readonly = "readonly", required="">
                    <span class="help-block">
                        Abonelik başlangıç tarihini belirtir (üst sınır)
                    </span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <label class="control-label col-md-2">Son Başarılı Ödeme Tarihi</label>
                <div class="col-md-3">
                <input name="lastSuccessfulPaymentDateMin" type="text" value="" id="txtLastSuccessfulPaymentDateMin" class="form-control"  @readonly = "readonly", required="">
                    <span class="help-block">
                        Aboneliğe ait son başarılı ödeme tarihini belirtir. (alt sınır)
                    </span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group">
                <label class="control-label col-md-2">Son Başarılı Ödeme Tarihi</label>
                <div class="col-md-3">
                <input name="lastSuccessfulPaymentDateMax" type="text" value="" id="txtLastSuccessfulPaymentDateMax" class="form-control"  @readonly = "readonly", required="">
                    <span class="help-block">
                        Aboneliğe ait son başarılı ödeme tarihini belirtir. (üst sınır)
                    </span>
                </div>
            </div>
        </div>
        <div class="row">
            <label class="col-md-12 control-label" for=""></label>
            <div class="col-md-4">
                <br />
                <button type="submit" id="" name="" class="btn btn-danger">Abonelik Listele</button>
            </div>
        </div>

       
    </div>


</form>

 <%-- start web service invocation --%><hr/>
             <%
              request.setCharacterEncoding("UTF-8");

	if ("POST".equalsIgnoreCase(request.getMethod())) {   
           
            
            
        String stringDate = "2018-01-01T12:55:38.0";
        
        XMLGregorianCalendar result = null;
        Date date;
 
        SimpleDateFormat simpleDateFormat;
        GregorianCalendar gregorianCalendar;
        try {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            date = simpleDateFormat.parse(stringDate);
            gregorianCalendar =(GregorianCalendar) GregorianCalendar.getInstance();
            gregorianCalendar.setTime(date);
            result = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
            
            /*
                    Abonelik listeleme soap çağrısının başlatıldığı kısmı temsil etmektedir.
                    Input ve token bilgileri doldurularak otomatik service çağrısı başlatılır.
            */  
            Settings settings = new Settings();
            settings.userCode="";
            settings.pin="";    
            
             com._3pay.services.SubscriberManagementService service = new com._3pay.services.SubscriberManagementService();
             com._3pay.services.SubscriberManagementServiceSoap port = service.getSubscriberManagementServiceSoap();
             
             com._3pay.services.MAuthToken token = new com._3pay.services.MAuthToken();
             com._3pay.services.MSelectSubscriberInput input = new com._3pay.services.MSelectSubscriberInput();
             
             token.setUserCode(settings.userCode);
             token.setPin(settings.pin);
             
             input.setProductId(0);
             input.setGSM(request.getParameter("gsmNumber"));
             input.setOrderChannelId(Integer.parseInt(request.getParameter("orderChannelId")));
             input.setActive(Integer.parseInt(request.getParameter("activeTypeId")));
             input.setSubscriberType(Integer.parseInt(request.getParameter("subscriberTypeId")));
             input.setStartDateMin(result);
             input.setStartDateMax(result);
             input.setLastSuccessfulPaymentDateMin(result);
             input.setLastSuccessfulPaymentDateMax(result);
             
             com._3pay.services.MSelectSubscriberOutput result2 = port.selectSubscriber(token, input);
              StringWriter sw = new StringWriter();
                 JAXB.marshal(result2, sw);
		
                 out.println("  <h1>Sonuç</h1>");
                 out.println("<pre>" + Helper.prettyPrintXml(sw.toString()) + "</pre>"); 

             
             
           
        } catch (Exception ex) {
            System.out.println("Exception in String to Greg Calander Conversion.");
            ex.printStackTrace();
        }
        }
             %>
             <%-- end web service invocation --%><hr/>

<jsp:include page="footer.jsp" />

    <script src="<%=request.getContextPath()%>/Content/js/jquery-ui.js"></script>
    <script src="<%=request.getContextPath()%>/Content/js/jquery.maskedinput.min.js"></script>
    <script src="<%=request.getContextPath()%>/Content/js/datepicker-tr.js"></script>
    <script type="text/javascript">
       $("#txtPhoneNumber").mask("9999999999", { placeholder: "__________" });


        $("#txtStartDateMin").datepicker({
            dateFormat: 'dd.mm.yy',
            changeMonth: true,
            changeYear: true,
            yearRange: "-3:+1",
            onSelect: function (selected) {
                $("#txtStartDateMax").datepicker("option", "minDate", selected);
            }
        });
        $("#txtStartDateMax").datepicker({
            dateFormat: 'dd.mm.yy',
            changeMonth: true,
            changeYear: true,
            yearRange: "-3:+1",
            onSelect: function (selected) {
                $("#txtStartDateMin").datepicker("option", "maxDate", selected);
            }
        });
        $("#txtLastSuccessfulPaymentDateMin").datepicker({
            dateFormat: 'dd.mm.yy',
            changeMonth: true,
            changeYear: true,
            yearRange: "-3:+1",
            onSelect: function (selected) {
                $("#txtLastSuccessfulPaymentDateMax").datepicker("option", "minDate", selected);
            }
        });
        $("#txtLastSuccessfulPaymentDateMax").datepicker({
            dateFormat: 'dd.mm.yy',
            changeMonth: true,
            changeYear: true,
            yearRange: "-3:+1",
            onSelect: function (selected) {
                $("#txtLastSuccessfulPaymentDateMin").datepicker("option", "maxDate", selected);
            }
        });
    </script>