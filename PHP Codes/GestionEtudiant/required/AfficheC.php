<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<div class="container">
<div class="row">
<center><h1>Liste des Classes</h1></center>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id_classe</th>
	  <th scope="col">Nom_classe</th>
	  <th scope="col">Salle_classe</th>

    </tr>
  </thead>
  <tbody>
<?php

// on se connecte à MySQL et on sélectionne la base
include("connexion.php"); 
foreach ($db->query("select * from classe") as $classe ) {
	$id=$classe['id_classe'];
	$nom=$classe['nom_classe'];
	$salle=$classe['salle_classe'];
	
	echo "
    <tr>
      <td>$id</td>
      <td>$nom</td>
      <td>$salle</td>
      

    </tr>
  
    ";
    
}


?>

 </tbody>
</table>
</div>
</div>
</div>
</body>
</html> 


