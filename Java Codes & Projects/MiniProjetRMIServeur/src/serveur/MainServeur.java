package serveur;


	import java.rmi.Naming;
	import java.rmi.registry.LocateRegistry;

	public class MainServeur {
		public static void main(String []args)
		{
			try {
				LocateRegistry.createRegistry(1099);
			
			ClassServeur1 e=new ClassServeur1();
			Naming.rebind("MyObject", e);
			} catch (Exception e) {
				e.printStackTrace();}}}
	

