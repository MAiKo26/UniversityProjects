

<?php 


         session_start(); 
     
            error_reporting(E_ERROR | E_PARSE) ;

              
              $ip="127.0.0.1";
              $login="root";
              $pwd="";
              $dbname="phpminiprojet";
              $dsn="mysql:host=".$ip.";dbname=".$dbname ;
              $db= new PDO($dsn,$login,$pwd);


              $CIN=$_POST["CIN"] ;
              $Login=$_POST["Login"] ;
              $pwd2=$_POST["pwd"] ;
              $Name=$_POST["Name"] ;
              $Prename=$_POST["Prename"] ;
              $Tel=$_POST["Tel"] ;
              $Sexe=$_POST["Sexe"] ;
              $Email=$_POST["Email"] ;
              $Adr=$_POST["Adr"] ;
              $Ville=$_POST["Ville"] ;
              $CP=$_POST["CP"] ;
              $Comm=$_POST["Comm"];
              $Role=$_POST["Role"] ;




        $qry="INSERT INTO `utilisateur`(`CIN_user`, `Login`, `Mot_Pass`, `Nom`, `Prénom`, `Téléphone`, `Sexe`, `Email`, `Adresse`, `Ville`, `Code_Postal`, `Commentaire`, `Role`) VALUES ('$CIN','$Login','$pwd2','$Name','$Prename','$Tel','$Sexe','$Email','$Adr','$Ville','$CP','$Comm','$Role')" ;
       $r=$db->query($qry);


          if ($r==true)
            {echo"<script type='text/javascript'>" ;
            echo "alert('Opération Réussi , Vous aller être redirigé vers la page principale') ;" ;
            echo "</script>"; }
            if($r==false){
            echo"<script type='text/javascript'>" ;
            echo "alert('Opération Non Réussi , Vous aller être redirigé vers la page principale') ;" ;
              echo "</script>"; } 




echo"<SCRIPT type='text/javascript'>
window.location= 'http://127.0.0.1/Brackets/MiniProjet/index.php' ;
</SCRIPT>";   

            
        
                  
                  
                  
               ?>