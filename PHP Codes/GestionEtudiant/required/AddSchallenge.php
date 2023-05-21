<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
    
<div class="container">
<div class="row">
  <div class="col-md-6 col-md-offset-3">

<form  action='addS1challenge.php' method="POST" enctype="multipart/form-data" >
  
    <div class="form-group">
    <label >CIN</label>
    <input type="text" class="form-control"  pattern="[0-9]{8}" placeholder="cin" name="CIN">
  </div>
   <div class="form-group">
    <label >Nom</label>
    <input type="text" class="form-control"  placeholder="Nom" name="Nom">
  </div>
  <div class="form-group">
    <label >Prenom</label>
    <input type="text" class="form-control" placeholder="Prenom" name="Prenom">
  </div>
  <div class="form-group">
    <label >Email</label>
    <input type="email" class="form-control"  placeholder="Email" name="mail">
  </div>
  <div class="form-group">
    <label >Classe</label>
<select class="form-control" name="classe">
	<?php

// on se connecte à MySQL et on sélectionne la base
include("connexion.php"); 
foreach ($db->query("select * from classe") as $classe ) {
	$id_classe=$classe['id_classe'];
	echo "<option value='$id_classe'> $id_classe</option>";
    
}
?>
</select>
</div>
<div class="form-group">
    <label >Photo</label>
    <input type="file" class="form-control" name="photo">
</div>  
 
                                      
<button type="submit" class="btn btn-default">envoyer</button>
<button type="reset" class="btn btn-default">annuler</button>
</form>
</div>
</div>
</div>

</body>
</html>