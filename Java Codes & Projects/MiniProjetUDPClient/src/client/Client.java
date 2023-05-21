package client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;



	public class Client {
		public static void main(String[] args){
			try{ InetAddress a=InetAddress.getLocalHost();
			
			Scanner sc=new Scanner(System.in);
			DatagramSocket se=new DatagramSocket();
			DatagramSocket sr=new DatagramSocket(2020);

			while(true) {
				byte[] buffer=new byte[100];
				DatagramPacket pr=new DatagramPacket(buffer, buffer.length);
				System.out.println("Donner L'entier a convertir") ;
				int n=sc.nextInt();
				String be=Integer.toString(n);
				int l=be.length();
				byte[] b=new byte[l];
				b=be.getBytes();
				DatagramPacket pe=new DatagramPacket(b,b.length,a,2021);
				se.send(pe);
			
			sr.receive(pr);
			String S= new String(buffer);
			if(!S.contains("Veuillez entrer un nombre positif ! "))
			{
			System.out.println(n+" en binaire est : "+S);
			se.close();
			sr.close();
			break;
			}
			System.out.println(S);
			}
			}catch(IOException e) {e.printStackTrace();}
			
			}}