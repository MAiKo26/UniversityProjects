<?php session_start(); ?>


<html>
    <head>

    <meta charset="utf-8">
    <title>M A I K O Achat et Vente en Ligne Matériel Informatique</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
   
    </head>
    
    <body>
        
    
        
        <center> <a href="PanneauAdmin.php" ><img src="img/admin.png" width="25" height="25"> Panneau Admin &nbsp; &nbsp;  | </a>    &nbsp; <a href="compte.php"><img src="img/comptelogo.png" width="25" height="25"> Mon Compte <?php error_reporting(E_ERROR | E_PARSE) ; echo ": ".$_SESSION["Login"]; ?></a> &nbsp; &nbsp;  <a href="insc.php"> | &nbsp;&nbsp; <img src="img/join.png" width="25" height="25"> S'inscrire</a> &nbsp;  <a href="conec.php"> | &nbsp;&nbsp; <img src="img/connect.png" width="25" height="25"> Se Connecter</a> &nbsp;  <a href="Dec.php"> | &nbsp;&nbsp; <img src="img/disconnect.png" width="25" height="25"> Se Déconnecter</a> </center>
        
        
        <div class="container-fluid">
            
<br>
            
             <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.php">   &nbsp;&nbsp; <img src="img/maikologo.png" width="150" height="20"></a> &nbsp;&nbsp;&nbsp;&nbsp;
      
        
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
         <a class="nav-link active" href="TelTab.php"><b>Telephone et Tablette</b></a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="OrdiPC.php"><b>Ordinateur et PC Portable</b></a>
        </li>
             <li class="nav-item">
          <a class="nav-link active" href="AccPre.php"><b>Accesoires et Prépheriques</b></a>
        </li>
             <li class="nav-item">
          <a class="nav-link active" href="FaireCommande.php"><b>Faire une Commande</b></a>
        </li>
      </ul>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <form class="d-flex">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
    </div>
  </div>
</nav>

        <br><br>

            
            <div class="container">
    <div class="row">
      <div class="col-12">
        <h1><center>Faire une Commande</center></h1>
        <table class="table">
            <form method="post" action="EnvoyerCommande.php" >
            <tr> <td> ID Produit  </td> <td> <input type='text' name="IDP"> </td>  </tr>
              
               <tr> <td></td> <td> <button type='submit' > Envoyer La Commande </button> <button type='reset'>Annuler </button> </td> </tr>
          
     </form>
        </table>
     </div>
    </div>
  </div>
    
             <br>    
            
            
        </div>
    </body>
    <footer> <p style="font-size:10px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;© 2020 M A I K O </p> <p align="center" >PAIEMENT ACCEPTÉ </p> 

   <center> <img src="img/paymentlogo.png" align="middle"></center>
    </footer>
</html>