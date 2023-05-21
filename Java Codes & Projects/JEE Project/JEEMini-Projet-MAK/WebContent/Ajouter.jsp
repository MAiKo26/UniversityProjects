<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter Un Etudiant</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="WEB-INF/lib/css/bootstrap.min.css">
  
</head>
<body>
<div class="container">
<div class"row"> <h1><a href="GererEtudiant.jsp"> <center> Gérer les Etudiants</center> </a></h1>  </div>
<br>
<br>
<nav class="navbar navbar-light bg-light">
<ul>
 <a class="navbar-brand" href="Consulter.jsp" > <form method="post" action="consult"> <button type="submit"> Consulter Les Etudiants</button> </form></a> 
 <a class="navbar-brand" href="Ajouter.jsp" > <button> Ajouter un Etudiant </button></a> 
 <a class="navbar-brand" href="Supprimer.jsp"> <button> Supprimer un Etudiant</button> </a> 
</ul>
</nav>
<br>
<br>
<h3> <center> Ajouter un Etudiant</center></h3>
<form action="ajout" method="post">

<center > 
<table>

<tr> <div class="row"> <td> CIN : </td> <td> <input type="text" name="CIN"> </td> </div> </tr>
<tr><div class="row"> <td> Nom :</td> <td> <input type="text" name="N"> </td></div></tr>
<tr><div class="row"><td>  Prenom :</td> <td> <input type="text" name="P"> </td></div></tr>
<tr><div class="row"> <td> Date de Naissance :</td> <td> <input type="text" value="2000-01-01" name="DN"></td> </div></tr>
<tr><div class="row"> <td> Date D'inscription :</td> <td> <input type="text" value="2020-01-01"  name="DI"></td> </div></tr>
<tr><div class="row"> <td> Sexe : </td><td><input type="text" name="Sexe" value="Homme ou Femme"></td></div></tr>
<tr><div class="row"> <td>Telephone :</td> <td><input type="text" name="TEL"> </td></div>



 </table>
<br>
<br>

<div class="row"><td><button type="submit" > Ajouter L'Etudiant </button> <button type="reset" > Annuler</button></td></div></center>
</form>

</div>
</body>
</html>