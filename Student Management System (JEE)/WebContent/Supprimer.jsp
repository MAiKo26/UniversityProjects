<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supprimer un Etudiant</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="WEB-INF/lib/css/bootstrap.min.css">
  
</head>
<body>
<div class="container">
<div class"row"> <h1> <center> <a href="GererEtudiant.jsp"> Gérer les Etudiants </a></center> </h1> </div>
<br>
<br>
<nav class="navbar navbar-light bg-light">
<ul>
 <a class="navbar-brand" href="Consulter.jsp" > <form method="post" action="consult"> <button type="submit"> Consulter Les Etudiants</button> </form></a> 
 <a class="navbar-brand" href="Ajouter.jsp" > <button > Ajouter un Etudiant </button></a> 
 <a class="navbar-brand" href="Supprimer.jsp"> <button > Supprimer un Etudiant</button> </a>  
</ul>
</nav>
<form action="supprim" method="post">
<br>
<br>
<h3> <center> Supprimer un Etudiant</center></h3>
<center>
<div class="row"> Donner la CIN de l'Etudiant a Supprimer</div>
<div class="row"> <input type="text" name="CIN"> </div>
</center>


<br>
<br>
<div class="row"><center> <button type="submit" > Supprimer </button> <button type="reset" > Annuler </button></center> </div>
</form>
</div>

</body>
</html>