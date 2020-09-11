
public class Boxeur {

	/* Déclaration variable */
	
		String Cat;
		int Poid;
		String nom;
		String Prenom;
		
		
		
		public void ident() {
		
		System.out.println("Veuillez saisir le nom du boxeur.");
		nom=Clavier.lire_String();
		
		System.out.println("Veuillez saisir le prénom du boxeur.");
		Prenom=Clavier.lire_String();
		
		}
		
		
		
		
		public void categorie() {
		
		
		System.out.println("Veuillez saisir le poid du boxeur.");
		Poid=Clavier.lire_int();
		
		if(Poid < 50.8 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie Mouche.");
			
		}
		if(Poid < 53.5 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie Coq");
			
		}
		if(Poid < 57.2 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie Plume");
			
		}
		if(Poid < 61.2 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie Léger");
			
		}
		if(Poid < 66.7 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie Welter");
			
		}
		if(Poid < 72.6 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie  Moyen");
			
		}
		if(Poid < 88.5 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie  Mi-Lourd");
			
		}
		if(Poid >= 88.5 ) {
			System.out.println("Avec un poids de " + Poid + ", le boxeur " + nom + " " + Prenom + " combat dans la catégorie  Lourd");
			
		}
		
	}

}
