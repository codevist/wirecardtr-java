<%@page
	contentType="text/html"
	pageEncoding="UTF-8"
%>
</div>        
    </div>
    <script src="<%=request.getContextPath()%>/Content/js/jquery-1.10.2.min.js"></script>
    <script src="<%=request.getContextPath()%>/Content/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/Content/js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script type="text/javascript">
             $(document).ready(function () {
                 $('#sidebarCollapse').on('click', function () {
                     $('#sidebar').toggleClass('active');
                 });
             });
    </script>

</body>
</html>