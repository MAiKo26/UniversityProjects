<?php 

            error_reporting(E_ERROR | E_PARSE) ;
              
              $ip="127.0.0.1";
              $login="root";
              $pwd="";
              $dbname="phpminiprojet";
              $dsn="mysql:host=".$ip.";dbname=".$dbname ;
              
        $db= new PDO($dsn,$login,$pwd);

            $IDP=$_POST['IDP'];
           


             $R= $db->query("DELETE FROM `produit`  WHERE ID_prod='$IDP'") ;              
    

  if ($R==true)
            {echo"<script type='text/javascript'>" ;
            echo "alert('Opération Réussi , Vous aller être redirigé vers le Panneau Admin')" ;
              echo "</script>"; }
            else{ 
            echo"<script type='text/javascript'>" ;
            echo "alert('Opération Non Réussi , Vous aller être redirigé vers le Panneau Admin')" ;
              echo "</script>"; 
            
            }  
    
echo"<SCRIPT type='text/javascript'>
window.location= 'http://localhost/Brackets/MiniProjet/PanneauAdmin.php' ;
</SCRIPT>";   
                  
 ?>