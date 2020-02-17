<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="ReadEtudiantServlet" method="post">
<label for="site-search">Rechercher un étudiant:</label>
<input type="search" id="nom" name="nom"
       aria-label="Rechercher un étudiant">
<input type="search" id="prenom" name="prenom"
aria-label="Rechercher un étudiant">
       <input type="submit" value="Rechercher" name="button1" onclick="callServlet();">
</form>
</body>
</html>