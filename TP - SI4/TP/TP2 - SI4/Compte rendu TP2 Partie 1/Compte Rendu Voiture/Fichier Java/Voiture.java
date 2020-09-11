
public class Voiture {

	
		private double vitesse;
		private String couleur;
		private double nbkms;
		
		public Voiture()
		{
			// Vitesse et nombre de kilometres nuls
			vitesse=0;
			nbkms=0;
			// La couleur doit être renseignee par l'utilisateur
			System.out.println("Veuillez saisir la couleur de votre voiture" );
			couleur=Clavier.lire_String();
			
		}
		public void changerCouleur()
		{
			//on demande une nouvelle couleur a l'utilisateur et on change la couleur de la voiture
			System.out.println("Vous devez changer la couleur de votre voiture" );
			couleur=Clavier.lire_String();
			
		}
		public void ajouterKms()
		{
			//demande a l'utilisateur combien de kilometre(s) il a parcouru au cours du trajet
			System.out.println("Combien de km avez-vous parcouru au cours du trajet?");
			nbkms=Clavier.lire_double();
		}
		public void accelerer()
		{
			//augmente la vitesse de 10
			vitesse=vitesse+10;
		}
		public void decelerer()
		{
			//diminue la vitesse de 10
			int rep;
			System.out.println("Voulez vous ralentir de 10km/h ? (1:Oui / 0:Non)");
			rep=Clavier.lire_int();
			
			if(rep==1) {
				
			if(vitesse>=10) {
			vitesse=vitesse-10;
			}
			else {
				System.out.println("Vous ne pouvez pas avoir une vitesse négative!");
			}
			if(rep==0) {
				System.out.println("Vous avez choisi de ne pas ralentir");
			}
			}
		}
		public void tableaudebord()
		{
			//affiche nbkms, vitesse et couleur
			System.out.println("Vous roulez à "+vitesse+" km, vous avez parcouru "+nbkms+" km et la couleur de votre voiture est "+couleur);
		}
		public void stopFeuRouge()
		{
			// La voiture doit s'aretter 10s (Afficher le décompte et redemarrer à 50km/h
			System.out.println("10");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("9");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("8");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("7");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("6");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("5");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("4");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("3");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("2");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("1");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("0");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
			vitesse=50;
			System.out.println("Le feu passe au vert vous reprenez votre route à une allure de "+vitesse+" km.");
		}
}