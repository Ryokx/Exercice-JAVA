
public class Etudiant {
	
		String nom;
		String prenom;
		double sommeNotes;
		double moy;
		double note;
		int coef;
		String[] Tmatieres = {"Etude De Cas", "Technique Informatique", "Soutenance de Projet", "Math�matique", "Fran�ais", "Droit", "Anglais Ecrit", "Anglais Oral"};
		int[] Tcoeff = {5,3,4,2,2,3,2,1};
		
		public Etudiant () 
		{
			//Initialiser les valeurs � 0
			sommeNotes=0;
			moy=0;
			coef=0;
			note=0;
			
			//Questions de base
		System.out.println("Veuillez saisir votre nom:");
		nom=Clavier.lire_String();
		System.out.println("Veuillez saisir votre pr�nom:");
		prenom=Clavier.lire_String();
		}
		public void etudeDeCas ()
		{
			
			coef=5;
			System.out.println("Veuillez saisir votre note pour �tude de cas:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void techInfo ()
		{
		
			coef=3;
			System.out.println("Veuillez saisir votre note pour pratique des techniques informatiques:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void soutenanceProjet ()
		{
			
			coef=4;
			System.out.println("Veuillez saisir votre note pour soutenance de projet:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void math ()
		{
			
			coef=2;
			System.out.println("Veuillez saisir votre note pour mah�matiques:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void expFr ()
		{
			
			coef=2;
			System.out.println("Veuillez saisir votre note pour expression fran�aise:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void ecoDroit ()
		{
			
			coef=3;
			System.out.println("Veuillez saisir votre note pour �conomie-droit:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void anglaisEcrit ()
		{
			
			coef=2;
			System.out.println("Veuillez saisir votre note pour anglais �crit:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void anglaisOral ()
		{


			coef=1;
			System.out.println("Veuillez saisir votre note pour anglais oral:");
			note=Clavier.lire_dooble();
			while(note>20 || note<0) {
					System.out.println("Veuillez saisir une note valide:");
					note=Clavier.lire_dooble();
			}
				sommeNotes=sommeNotes+(note*coef);
		}
		public void bilan ()
		{
			System.out.println("Votre nom est "+nom+" et votre pr�nom "+prenom);
			moy=sommeNotes/22;
			System.out.println("Votre moyenne est de: "+moy);
			if(moy>=10) {
				System.out.println("Vous ete admis!");
			switch((int) moy) {
			case 1: System.out.println("Vous avez compl�tement rat�!"); break;
			case 2: System.out.println("Vous avez compl�tement rat�!"); break;
			case 3: System.out.println("Vous avez compl�tement rat�!"); break;
			case 4: System.out.println("Vous avez compl�tement rat�!"); break;
			case 5: System.out.println("Vous avez compl�tement rat�!"); break;
			case 6: System.out.println("Vous avez rat�!"); break;
			case 7: System.out.println("Vous avez rat�!"); break;
			case 8: System.out.println("Vous avez rat�!"); break;
			case 9: System.out.println("Vous avez rat�!"); break;
			case 10: System.out.println("Vous avez reussi!"); break;
			case 11: System.out.println("Vous avez reussi!"); break;
			case 12: System.out.println("Assez bien"); break;
			case 13: System.out.println("Assez bien"); break;
			case 14: System.out.println("Bien"); break;
			case 15: System.out.println("Bien"); break;
			case 16: System.out.println("Tr�s bien"); break;
			case 17: System.out.println("Tr�s bien"); break;
			case 18: System.out.println("Tr�s bien"); break;
			case 19: System.out.println("Excellent!"); break;
			case 20: System.out.println("Excellent!"); break;
			default: System.out.println("La note n'est pas valider"); break;
			}
			
			}
			else {
				System.out.println("Vous ete recal�!");
			}
			
			
		}	
		
		public void test()
		{
			for(int i=0; i<Tmatieres.length;i++) {
				System.out.println(" La mati�re "+Tmatieres[i]+" est de coefficient "+Tcoeff[i]);
			}
			
			
			
		}
}
