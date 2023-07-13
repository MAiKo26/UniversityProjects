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
$cin=$_GET["CIN"] ;

if(!empty($cin))
{
// on se connecte à MySQL et on sélectionne la base
 include("connexion.php");
 
// On créé la requête
$resultat=$db->query("select * from etudiant WHERE CIN_et= '$cin'"); 

$etudiant = $resultat ->fetch();
if ($etudiant){
	
$req= "DELETE  FROM  `etudiant` WHERE `CIN_et`= '$cin'" ;
    
// on envoie la requête
$res =$db->query($req);
echo "<H1>L'étudiant a été supprimé</H1>";
}
else
	echo "<H1>L'étudiant n'existe pas </H1>";
}

 

?>
</div>
</div>

</div></body>
</html> 
