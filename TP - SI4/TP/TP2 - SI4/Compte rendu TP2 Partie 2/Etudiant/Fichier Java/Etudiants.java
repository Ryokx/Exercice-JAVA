
public class Etudiants {

		// D�claration variable //
		private String nom;
		private String prenom;
		private int note1, note2, note3, note4, note5, note6, note7, note8;
		private int moyenne1, moyenne2, moyenne3, moyenne4, moyenne5, moyenne6, moyenne7, moyenne8;
		private int mg;
		private int rep;
		

		public void info() {
			// R�cup�ration des informations de l'�l�ve
			System.out.println("Veuillez votre nom.");
			nom=Clavier.lire_String();
			
			System.out.println("Veuillez votre prenom");
			prenom=Clavier.lire_String();
			}

		
		public void recupmoy()
		{
		// Saisit des moyennes et calcul de la moyenne g�n�ral selon les coefficients.
		
		System.out.println("Veuillez saisir votre note d'�tude de cas.");
		note1=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note de pratique des techniques informatiques.");
		note2=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note de soutenance de projet.");
		note3=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note de math�matiques.");
		note4=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note expression fran�aise.");
		note5=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note �conomie-droit.");
		note6=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note d'anglais �crit.");
		note7=Clavier.lire_int();
		
		System.out.println("Veuillez saisir votre note d'anglais oral.");
		note8=Clavier.lire_int();
		
		}
		
		public void calmoy() {
		//Calcul des moyennes
		
		int coefftotal = 22;
		moyenne1 = note1*5;
		moyenne2 = note2*3;
		moyenne3 = note3*4;
		moyenne4 = note4*2;
		moyenne5 = note5*2;
		moyenne6 = note6*3;
		moyenne7 = note7*2;
		moyenne8 = note8*1;
		
	
		
		
		mg = (moyenne1 + moyenne2 + moyenne3 + moyenne4 + moyenne5 + moyenne6 + moyenne7 + moyenne8) /22;
		
		
		
		if(mg >= 10) {
			System.out.println("Vous avez �tes admis(e).F�licitation.");
	
		}
		else {
			System.out.println("Vous avez �tes recal�(e).");
		}
		
		}
		
		public void result() {
			
		System.out.println("Souhaitez vous connaitre en m�me temps que votre note votre mention ? ( 1:Oui / 2:Non )");
		rep=Clavier.lire_int();
		
		if(rep == 1) {
		
				if(mg > 12 && mg < 13.9 )  {
					System.out.println("Votre moyenne g�n�rale est de " + mg + " vous obtenez la mention assez bien.");
					
		}
				
				if(mg > 14  && mg < 15.9 )  {
					System.out.println("Votre moyenne g�n�rale est de " + mg + " vous obtenez la mention bien.");
					
		}
				if(mg > 16 && mg < 20 )  {
					System.out.println("Votre moyenne g�n�rale est de " + mg + " vous obtenez la mention tr�s bien. F�licitation");
					
		}
				else {
					System.out.print("Votre moyennne g�n�rale est de " + mg );
		}
				
				
					}
		if(rep == 2) {
			System.out.println("Vous avez choisit de ne pas connaitre votre note et votre moyen.");
		}
			System.out.println("Nom : " + nom);
			System.out.println("Prenom : " + prenom);
			System.out.println("Moyenne G�n�rale : " + mg);
		}


}
