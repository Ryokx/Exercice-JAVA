public class CarteCantine {

	private int solde;
	private String detenteur;
	
	
	public CarteCantine()
	{
		//Fixer le solde a 0
		solde=0;
		//Ecrire les instructions permettant de renseigner la caracteristique "detenteur"

		System.out.println("Veuillez saisir le nom du detenteur de la carte");
		detenteur=Clavier.lire_String();
	}
	
	public void debiterCarte()
	{
		int rep;
		System.out.println("Voulez-vous réserver un repas? 1-Oui 0-Non");
		rep=Clavier.lire_int();
		
	if(rep==1) {
			
		if(solde>=1) {
		solde--;
		System.out.println("Le nouveau solde de la carte est " + solde );
		}
		else {
			System.out.println("Veuillez recharger votre carte !");
		}
	}
	if(rep==0) {
		System.out.println("Vous avez choisi de ne pas réserver!");
		}
	}
	
	public void crediterCarte()
	{
		int ajoutSolde;
		//Ecrire les instructions qui permettent d'ajouter un nombre de repas choisi par l'utilisateur au solde de la carte
		System.out.println("Veuillez ajouter le nombre de repas que vous souhaiter ajouter à votre solde");
		ajoutSolde=Clavier.lire_int();
		solde=solde+ajoutSolde;
		
	}
	
	public void afficherSolde()
	{
		//Ecrire les instructions qui permettent d'afficher le nom du detenteur et le solde restant sur la carte
		System.out.println("Le nom du détenteur est "+detenteur+"\nLe solde du compte est de "+solde);
	}	
	
}