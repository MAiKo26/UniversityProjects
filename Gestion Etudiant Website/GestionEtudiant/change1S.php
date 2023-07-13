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
}
	
else
{
	echo "<H1>L'étudiant de CIN $cin n'existe pas </H1>";
	$cin="L'étudiant de CIN $cin n'existe pas ";
	$prenom="L'étudiant de CIN $cin n'existe pas ";
	$nom="L'étudiant de CIN $cin n'existe pas ";
	$mail="L'étudiant de CIN $cin n'existe pas ";
}


?>
<form  action='change2S.php' method="GET" >
  
    <div class="form-group">
    <label >CIN</label>
    <input type="text" class="form-control"  pattern="[0-9]{8}" placeholder="cin" name="CIN" value="<?php echo $cin; ?>">
  </div>
   <div class="form-group">
    <label >Nom</label>
    <input type="text" class="form-control"  placeholder="Nom" name="Nom" value="<?php echo $nom; ?>">
  </div>
  <div class="form-group">
    <label >Prenom</label>
    <input type="text" class="form-control" placeholder="Prenom" name="Prenom" value="<?php echo $prenom; ?>">
  </div>
  <div class="form-group">
    <label >Email address</label>
    <input type="email" class="form-control"  placeholder="Email" name="mail" value="<?php echo $mail; ?>">
  </div>
 
                                      
<button type="submit" class="btn btn-default">valider</button>
<button type="reset" class="btn btn-default">annuler</button>
</form>
</div>
</div>
</div>
 </body>
</html>