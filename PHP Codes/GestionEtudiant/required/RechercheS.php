<html>
<head>
<!-- Latest compiled and minified CSS -->
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
    
<div class="container">
<div class="row">
<center><h1>Résultat de la recherche</h1></center>
<table class="table">
  <thead>
    <tr>
      <th scope="col">CIN</th>
	  <th scope="col">PRENOM</th>
	  <th scope="col">NOM</th>
      <th scope="col">MAIL</th>
	  <th scope="col">PHOTO</th>
      
       

    </tr>
  </thead>
  <tbody>


<?php

$cin=$_GET["CIN"];

// on se connecte à MySQL et on sélectionne la base
 include("connexion.php");
// On créé la requête

		
$resultat=$db->query("select * from etudiant WHERE CIN_et= '$cin'"); 

	$etudiant = $resultat ->fetch();
	if ($etudiant){
	$cin=$etudiant['CIN_et'];
	$mail=$etudiant['MAIL_et'];
	$nom=$etudiant['NOM_et'];
	$prenom= $etudiant['PRENOM_et'];
	$path="";
	
	$dossier = opendir("image/"); // Ouvre le dossier courant
	$trouve=false;
	while(($f = readdir($dossier))&&!$trouve){
		
		if (strpos($f, $cin) !== false){
			$path="image/$f";
			$trouve=true;	
		}
				
		}
	closedir($dossier); // On n'a plus besoin du dossier
	
	
			
	echo "
    <tr>
      <td>$cin</td>
	  <td>$prenom</td>
      <td>$nom</td>
	  <td>$mail</td>
	   <td><img src='$path'></td>
      

    </tr>
    ";
}
	
else
{
	echo "<H3>L'étudiant de CIN $cin n'existe pas </H3>";
	
}


?>

</tbody>
</table></div>
</div>
 </body>
</html>