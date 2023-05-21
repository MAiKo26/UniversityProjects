<?php 

 session_start();

      //      error_reporting(E_ERROR | E_PARSE) ;
           
             /*  if ((($_SESSION["Role"])!="Admin") || (($_SESSION["Role"])!="Client"))
            {
      
                       echo"<script type='text/javascript'>" ;
                        echo "alert('Vous n êtes pas connecté pour effectué cette Opération')" ;
                        echo "</script>"; 
            
    
                echo"<SCRIPT type='text/javascript'>
                window.location= 'http://localhost/Brackets/MiniProjet/index.php' ;
                </SCRIPT>";  } */
                
            
           
           

              $ip="127.0.0.1";
              $login="root";
              $pwd="";
              $dbname="phpminiprojet";
              $dsn="mysql:host=".$ip.";dbname=".$dbname ;
              
        $db= new PDO($dsn,$login,$pwd);

            $IDP=$_POST["IDP"];
            $IDU= $_SESSION["CIN_user"] ;
            $date= date("Y/m/d") ;


    $qry="INSERT INTO `commande`(`CIN_user`, `ID_prod`, `Date_commande`) VALUES ('$IDU','$IDP','$date')" ;

    $R= $db->query($qry) ;  

       if ($R==true)
            {echo"<script type='text/javascript'>" ;
            echo "alert('Opération Réussi , Vous aller être redirigé vers le Page Principale !')" ;
              echo "</script>"; }
            else{ 
            echo"<script type='text/javascript'>" ;
            echo "alert('Opération Non Réussi , Vous aller être redirigé vers le Page Principale !')" ;
              echo "</script>"; 
            
            }  
    
echo"<SCRIPT type='text/javascript'>
window.location= 'http://localhost/Brackets/MiniProjet/index.php' ;
</SCRIPT>"; 
    
              
 ?>