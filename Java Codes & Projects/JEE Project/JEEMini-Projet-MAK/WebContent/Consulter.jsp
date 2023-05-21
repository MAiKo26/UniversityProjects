<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulter Les Etudiants</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="WEB-INF/lib/css/bootstrap.min.css">
  
</head>
<body>
<div class="container">
<div class"row"> <h1><a href="GererEtudiant.jsp"> <center> Gérer les Etudiants </center> </a></h1> </div>
<br>
<br>
<nav class="navbar navbar-light bg-light">
<ul>
 <a class="navbar-brand" href="Consulter.jsp" > <form method="post" action="consult"> <button type="submit"> Consulter Les Etudiants</button> </form></a> 
 <a class="navbar-brand" href="Ajouter.jsp" > <button type="submit"> Ajouter un Etudiant </button></a> 
 <a class="navbar-brand" href="Supprimer.jsp"> <button type="submit"> Supprimer un Etudiant</button> </a> 
</ul>
</nav>
<br>
<br>
<h3> <center> Consulter Les Etudiants</center></h3>

<br>

<div class="row"> <h3><center> Bonjour et voici la liste des Etudiants de notre Institut ! </center></h3> </div>
<br>
 
 <center>
 <ul>
 <c:forEach var="et" items="${ ets }">
 <li>
 <c:out value="${ et.getCIN() }" /> 
 <c:out value="${ et.getNom() }"/> 
 <c:out value="${ et.getPrenom() }"/>
 <c:out value="${ et.getDN() }"/>
 <c:out value="${ et.getDI() }"/>
 <c:out value="${ et.getSexe() }"/>
 <c:out value="${ et.getTel() }"/>
 </li>
 </c:forEach>
 </ul>
 </center>
 
</div>
</body>
</html>