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

$mail = $_POST["mail"];
$cin = $_POST["CIN"];
$nom=$_POST["Nom"];
$prenom=$_POST["Prenom"];
$id_classe=$_POST["classe"];




if(!empty($cin) && !empty($nom) && !empty($prenom))
   {
// on se connecte à MySQL et on sélectionne la base
  include("connexion.php");
// On créé la requête
$req= "INSERT INTO `etudiant` (CIN_et,PRENOM_et,NOM_et,MAIL_et) VALUES('$cin' , '$prenom' , '$nom', '$mail')" ;
    
// on envoie la requête
$res = $db->query($req);

if ($res)
{
	echo "<H1>L'étudiant a été ajouté</H1>";
	// On créé la requête
	$req= "INSERT INTO etudiant_classe (CIN_et,id_classe) VALUES('$cin' , '$id_classe')" ;
	// on envoie la requête$res
	$res = $db->query($req);
	if ( !empty($_FILES["photo"]["tmp_name"]))
	{
		$check = getimagesize($_FILES["photo"]["tmp_name"]);
		if($check !== false) 
		{
			
			$infosfichier = pathinfo($_FILES['photo']['name']);
			//print_r ($infosfichier);
			$extension_upload = $infosfichier['extension'];
			$path="image/$cin.$extension_upload";
			move_uploaded_file($_FILES["photo"]["tmp_name"],$path);
		} 
		else {
				echo" <div class='alert alert-warning' role='alert'>
				Votre photo n'est pas été ajouté car il ne s'agit pas d'une image.</div>";
				
				}
				}
	
}
else
	echo "<H1>L'étudiant existe déja</H1>";
 	
} 

	
	
	
		
		


?>
</div>
</div>
</div>
</body>
</html> 