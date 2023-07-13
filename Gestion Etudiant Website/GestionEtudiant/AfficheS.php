<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<div class="container">
<div class="row">
<center><h1>Liste des étudiants</h1></center>
<table class="table">
  <thead>
    <tr>
      <th scope="col">CIN</th>
	  <th scope="col">PRENOM</th>
	  <th scope="col">NOM</th>
      <th scope="col">MAIL</th>
      
       

    </tr>
  </thead>
  <tbody>
<?php



// on se connecte à MySQL
include("connexion.php"); 
foreach ($db->query("select * from etudiant") as $etudiant ) {
	$cin=$etudiant['CIN_et'];
	$mail=$etudiant['MAIL_et'];
	$nom=$etudiant['NOM_et'];
	$prenom= $etudiant['PRENOM_et'];


	echo "
    <tr>
      <td>$cin</td>
	  <td>$prenom</td>
      <td>$nom</td>
	  <td>$mail</td>
      

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


