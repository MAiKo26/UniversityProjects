<html>
<head>
<meta charset="UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
    
<div class="container">
<div class="row">
<div class="col-md-6 col-md-offset-3">

<form  action='deleteS.php' method="GET" >
  
  <div class="form-group">
  	
    <label for="CIN">CIN</label>
    <select name="CIN" class="form-control">
<?php

// on se connecte à MySQL et on sélectionne la base
include("connexion.php"); 
foreach ($db->query("select * from etudiant") as $etudiant ) {
	$cin=$etudiant['CIN_et'];
	$nom=$etudiant['NOM_et'];
	$prenom= $etudiant['PRENOM_et'];


	echo "<option value='$cin'> $cin $prenom $nom</option>";
    
}
?>
</select>
  </div>
    <button type="submit" class="btn btn-primary">Supprimer</button>
</form>
</div>
</div>
</div>
</body>
</html>