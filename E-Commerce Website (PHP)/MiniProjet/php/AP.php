<?php 
      //      error_reporting(E_ERROR | E_PARSE) ;
           

              $ip="127.0.0.1";
              $login="root";
              $pwd="";
              $dbname="phpminiprojet";
              $dsn="mysql:host=".$ip.";dbname=".$dbname ;
              
        $db= new PDO($dsn,$login,$pwd);

            $IDP=$_POST['IDP'];
            $DES=$_POST['DES'];
            $PRX=(int)$_POST['PRX'];
            $QTE=(int)$_POST['QTE'];
            $CAT=$_POST['CAT'];
            $MRQ=$_POST['MRQ'];
            $FOR=$_POST['FOR'];

    $qry="INSERT INTO `produit`(`ID_prod`, `Désignation`, `Prix`, `Quantité`, `Catégorie`, `Marque`, `Fournisseur`) VALUES ('$IDP','$DES',$PRX,$QTE,'$CAT','$MRQ','$MRQ','$FOR')" ;
    $R= $db->query($qry) ;  

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