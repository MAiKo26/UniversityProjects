package client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	public static void main(String []args)
	{
		try {
			Socket s=new Socket(InetAddress.getLocalHost(),2020);

			PrintWriter out =new PrintWriter(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("donner une chaine de caracteres");
			String X=sc.nextLine();
	
			out.println(X);
			out.flush();
						
			
			
		} catch (IOException e) {e.printStackTrace();}
}
		
}
		