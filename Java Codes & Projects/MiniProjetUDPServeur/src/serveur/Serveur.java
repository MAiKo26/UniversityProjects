package serveur;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Serveur {
		public static void main(String[] args){
		try{ InetAddress a=InetAddress.getLocalHost();
		DatagramSocket se=new DatagramSocket();
		DatagramSocket sr=new DatagramSocket(2021);
		System.out.println("Started") ;

			while(true) {
			byte[] buffer=new byte[2];
			DatagramPacket pr=new DatagramPacket(buffer,buffer.length);
			sr.receive(pr);
			String S= new String(buffer);
			System.out.println("entier reçu :"+S);
			int n=Integer.parseInt(S);
			String be;
			int f=1 ;
			if(n>0)
			{
			
			be= Integer.toBinaryString(n);
			int l=be.length();
			byte[] b=new byte[l];
			b=be.getBytes();
			DatagramPacket pe=new DatagramPacket(b,b.length,a,2020);
			
			se.send(pe);
			se.close();
			sr.close();
			System.out.println("Ended") ;

			break ;
			}
			else
			{
			be="Veuillez entrer un nombre positif !" ;
			int l=be.length();
			byte[] b=new byte[l];
			b=be.getBytes();
			DatagramPacket pe=new DatagramPacket(b,b.length,a,2020);
			se.send(pe);

}

}
}catch(IOException e) {e.printStackTrace();}
}
}