<%@ include file="includes/cabecera.jsp" %>


<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%-- <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>

	<h2>Formulario de productos</h2>
	
	<jsp:useBean id="producto" scope="request"
		class="com.ipartek.ejemplos.leire.tipos.Producto" />

	<form action="productosform" method="post">
		<fieldset>
			<label for="id">ID</label> 
			
			<input type="number" id="id" name="id"
			  required="required" />
			  
<%-- 			  <c:if test="${param.op == 'modificar' or param.op == 'borrar'}"> --%>
<!-- 			  	readonly="readonly" -->
<!-- 			  </c:if>    -->
		  
		</fieldset>
		<fieldset>
			<label for="nombre">Nombre</label> <input type="text" id="nombre"
				name="nombre" />
		</fieldset>
		<fieldset>
			<label for="descripcion">Descripcion</label> <input type="text" id="descripcion"
				name="descripcion" />
		</fieldset>
		<fieldset>
			<label for="precio">Precio</label> <input type="number" id="precio"
				name="precio" />
		</fieldset>
		
	</form>
	
	
<%@ include file="includes/pieextendido.jsp" %>	
<%@ include file="includes/pie.jsp" %>