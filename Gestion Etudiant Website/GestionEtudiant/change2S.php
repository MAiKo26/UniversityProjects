<html>
<head>
<!-- Latest compiled and minified CSS -->
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
    
<div class="container">
<div class="row">
<div class="col-md-6 col-md-offset-3">
<?php
// on se connecte à MySQL et on sélectionne la base
 include("connexion.php");
$mail = $_GET["mail"];
$cin = $_GET["CIN"];
$nom=$_GET["Nom"];
$prenom=$_GET["Prenom"];
	
$requete=" update etudiant set  NOM_et='$nom', PRENOM_et='$prenom', MAIL_et='$mail' where CIN_et= '$cin' ";
$db->exec($requete);
header("Location:AfficheS.php");
 

?> 
</div>
</div>
</div>
</body>
</html> 