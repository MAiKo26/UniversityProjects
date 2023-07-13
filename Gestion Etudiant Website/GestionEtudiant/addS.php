<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
    
<div class="container">
<div class="row">
<div class="col-md-6 col-md-offset-3">
<?php

$mail = $_GET["mail"];
$cin = $_GET["CIN"];
$nom=$_GET["Nom"];
$prenom=$_GET["Prenom"];




if(!empty($cin) && !empty($nom) && !empty($prenom))
   {
// on se connecte à MySQL et on sélectionne la base
  include("connexion.php");
// On créé la requête
$req= "INSERT INTO `etudiant` (CIN_et,PRENOM_et,NOM_et,MAIL_et) VALUES('$cin' , '$prenom' , '$nom', '$mail')" ;
    
// on envoie la requête
$res = $db->query($req);

if ($res)
			echo "<H1>L'étudiant a été ajouté</H1>";
		else
			echo "<H1>L'étudiant existe déja</H1>";
 	



}  


?>
</div>
</div>
 </tbody>
</table></body>
</html> 