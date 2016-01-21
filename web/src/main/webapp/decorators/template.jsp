<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<title>Project Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- Stylesheets -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style/bootstrap.css">

</head>
<body>
	<div id="navbar" class="navbar navbar-default">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>
		<div class="navbar-container" id="navbar-container">
			<!-- INICIA BARRA MENU -->
			<div class="navbar-header pull-left">
				<img
					src="${pageContext.request.contextPath}/resources/img/EBC.png" />
			</div>
			<!-- INICIA BARRA MENU -->
			<jsp:include page="_perfil.jsp" />
		</div>
	</div>
	<decorator:body />

	<div class="navbar navbar-inverse navbar-fixed-bottom">
		<div id="footer">
			<div class="container">
				<p class="muted credit">Escuela Bancaria y Comercial, S. C.
					Derechos Reservados 2014</p>
			</div>
		</div>
	</div>

	<!-- JS -->
	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>