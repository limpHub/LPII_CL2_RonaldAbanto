<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.*" %>
	<%@page import="model.TblProductocl2" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de productos</title>
</head>
<body>
	<h1 align="center">Listado de productos</h1>

	<h2 align="center">
		<a href="RegistrarProducto.jsp" style="text-decoration: none;">Registrar
			productos</a>
	</h2>
	<table align="center" border="2">
		<tr>
			<td>Codigo</td>
			<td>Nombre</td>
			<td>Estado</td>
			<td>Descripcion</td>
			<td>Precio de compra</td>
			<td>Precio de venta</td>
		</tr>
		<%
			List<TblProductocl2> listadoproducto = (List<TblProductocl2>) request.getAttribute("ListarProducto");
			if (listadoproducto != null) {

				for (TblProductocl2 lis : listadoproducto) {
		%>
		<tr>
			<td><%=lis.getIdproductoCL2()%></td>
			<td><%=lis.getNombreCl2()%></td>
			<td><%=lis.getEstadoCL2()%></td>
			<td><%=lis.getDescripCL2()%></td>
			<td><%=lis.getPrecioCompraCL2()%></td>
			<td><%=lis.getPrecioVentaCL2()%></td>

		</tr>
		<%
			} //cerramos la condicion...
			} //cerramos el bucle
		%>
	</table>
</body>
</html>