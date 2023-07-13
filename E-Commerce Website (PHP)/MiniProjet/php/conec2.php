  <?php 
         session_start(); 
     
         //  error_reporting(E_ERROR | E_PARSE) ;

              
              $ip="127.0.0.1";
              $login="root";
              $pwd="";
              $dbname="phpminiprojet";
              $dsn="mysql:host=".$ip.";dbname=".$dbname ;
              $L=$_POST["Login"] ;
              $P=$_POST["pwd"] ;
              $qry="SELECT * FROM `utilisateur` WHERE `Login`='$L' and `Mot_Pass`='$P'" ;
        $db= new PDO($dsn,$login,$pwd);
        $R =$db->query($qry) ;
        $r=$R->fetchALL(PDO::FETCH_ASSOC) ;


        
// print_r($r);

                     foreach($r as $pr){
                  $_SESSION["CIN_user"]=$pr['CIN_user'];
                  $_SESSION["Login"]=$pr['Login'];
                  $_SESSION["Mot_Pass"]=$pr['Mot_Pass'];
                  $_SESSION["Nom"]=$pr['Nom'];
                  $_SESSION["Prénom"]=$pr['Prénom'];
                  $_SESSION["Téléphone"]=$pr['Téléphone'];
                  $_SESSION["Sexe"]=$pr['Sexe'];
                  $_SESSION["Email"]=$pr['Email'];
                  $_SESSION["Adresse"]=$pr['Adresse'];
                  $_SESSION["Ville"]=$pr['Ville'];
                  $_SESSION["Code_Postal"]=$pr['Code_Postal'];
                  $_SESSION["Commentaire"]=$pr['Commentaire'];
                  $_SESSION["Role"]=$pr['Role'] ;  }

                    

                 sleep(2);
    
                 header("Location: http://localhost/Brackets/MiniProjet/PanneauAdmin.php") ;
                 exit();
                  
                  
                  
               ?>