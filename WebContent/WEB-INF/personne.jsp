<%@page import="sn.papedev.beans.Personne"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Affichage personne - Ma coyotte</title>
</head>
<body>
	<p> R�cuperation du bean</p>
	<p>
		<% 
		Personne ourBean = (Personne)request.getAttribute("personne");
		out.println(ourBean.getNom());
		out.println(ourBean.getPrenom());
		%>
	</p>

</body>
</html>