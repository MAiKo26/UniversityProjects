package serveur;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Serveur {
    public static void main(String[] args) {
        final int port = 2020;
        try{
            ServerSocket serveur = new ServerSocket(port);
            System.out.println("Started");
            
                Socket socket = serveur.accept();
                System.out.println(socket.getPort()+"connecté");
                

                InputStream in = socket.getInputStream();
                InputStreamReader reader = new InputStreamReader(in);
                BufferedReader istream = new BufferedReader(reader);

                String line = istream.readLine();
                
                System.out.println("La Phrase du client est : "+line);

            	
                	String FirstLtr = line.substring(0,1);
            		String restLtrs = line.substring(1,line.length());
            		FirstLtr = FirstLtr.toUpperCase();
            		restLtrs = restLtrs.toLowerCase() ;
            		line= FirstLtr + restLtrs ; 


            		String X , Z ;
					char Y;
                
                
                for (int i=0;i<line.length()-1;i++) {
            	  	char A = line.charAt(i) ;
            	  	char B = line.charAt(i+1) ;
            	  	char C = '.' ;
            		char D = ' ' ;
                	
            			if ( A==C && B==D) {
            				X = line.substring(0,i+2);            				
            				Y = line.charAt(i+2);
            				Z = line.substring(i+3);
            				String L = String.valueOf(Y) ;
            				L = L.toUpperCase();
            				Z = Z.toLowerCase() ;       
            				line= X + L + Z ; 
                	
            			}}
                
                System.out.println("La Phrase du client corrigé est : "+line);


    socket.close();
System.out.println("Fin connexion!"); 


        }catch(IOException e){
            
        }
    }

}
