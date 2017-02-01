<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TURNOS</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>numturno</td>
				<td>observaciones</td>
				
			</tr>
		</thead>
		<tbody>
			<s:iterator value="session.results">
		        <tr>
		            <td><s:property value="idturno"/></td>
		            <td><s:property value="nroTurno"/></td>
		            <td><s:property value="observaciones"/></td>
		            
		        </tr>
		    </s:iterator>
		</tbody>
	</table>
</body>
</html>