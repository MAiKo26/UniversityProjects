<?php session_start(); ?>

<html>
    <head>

    <meta charset="utf-8">
    <title>M A I K O Achat et Vente en Ligne Matériel Informatique</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

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

             <form method="post"  action="conec2.php">
        <div class="container">
    <div class="row">
      <div class="col-12">
        <h1><center>Formulaire D'inscription à M A I K O</center></h1>
        <h4>
          <center>  <table>

    <tr>       <div class="row"> <td>Pseudo</td><td> <input type="text" name="Login" required></div></tr>  
    <tr>       <div class="row"> <td>Mot de Passe</td><td> <input type="password" name="pwd" required></div></tr>  
   

            <br><br>
      <tr>  <td></td>  <td>  <center><button type="submit" > Se Connecter </button> <button type="reset" > Annuler</button></center></td></tr>  
          
             
              
            
              
              
          </table>
    </center>
        </h4>
     </div>
    </div>
  </div>
</form>
  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
  </script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
  </script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
  </script>
            
        </div></body>
    <footer> <p style="font-size:10px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;© 2020 M A I K O </p> <p align="center"> PAIEMENT ACCEPTÉ </p> 

   <center> <img src="img/paymentlogo.png" align="middle"></center>
    </footer>
</html>