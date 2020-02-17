<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="fr.ensup.gestionecole.domaine.Responsable"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion de l'école ENSUP</title>
</head>
<body>
<%
Responsable resp = (Responsable) session.getAttribute("responsable");
%>
<h1>Information responsable </h1>
<ul>
<li>Login : <%=resp.getNom()%></li>
<li>Password : <%=resp.getPrenom()%> </li>
</ul>
<h1> GESTION DE L'ECOLE ENSUP </h1>
<h1> </h1>
<h1> </h1>
<input name="btn-creation" type="submit" value="Créer un étudiant" onclick="document.location.href='creationEtudiant.jsp';">
<h1> </h1>
<input type="button" value="Associer un étudiant à un cours">
<h1> </h1>
<input type="button" value="Lire les informations d'un étudiant" onclick="document.location.href='LectureEtudiant.jsp';">
<h1> </h1>
<input type="button" value="Modifier les informations d'un étudiant">
<h1> </h1>
<input type="button" value="Supprimer un étudiant">
<h1> </h1>
<input type="button" value="Lister l'ensemble des étudiants de l'école">
<h1> </h1>
</body>
</html>