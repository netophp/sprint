<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="navbar-buttons navbar-header pull-left" role="navigation">
    <ul class="nav ace-nav">
        <c:forEach var="perfil" items="${persona.perfilUsuario.accesoPerfil}">
            <c:if test="${not empty perfil.accesoPerfil}">
		        <li class="light-blue">
		            <a data-toggle="dropdown" href="#" class="dropdown-toggle">
		                <span>
		                    ${perfil.nombreCorto}<i class="ace-icon fa fa-caret-down"></i>
		                </span>
		            </a>
		            <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-blue dropdown-caret dropdown-close">
		                <c:forEach var="perfilNivel2" items="${perfil.accesoPerfil}">
		                <li>
		                    <a href="${pageContext.request.contextPath}${perfilNivel2.urlPortal}">
		                        <i class="ace-icon fa fa-circle orange smaller-80"></i>
		                        ${perfilNivel2.nombreCorto}
		                    </a>
		                </li>
		                <li class="divider"></li>
		                </c:forEach>
		            </ul>
		        </li>
	        </c:if>
        </c:forEach>
        <li class="light-blue">
            <a href="${pageContext.request.contextPath}/security/logout" >&nbsp;&nbsp;Salir&nbsp;&nbsp;<i class="ace-icon fa fa-sign-out white bigger-160"></i></a>    
        </li>
    </ul>
</div>