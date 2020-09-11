
public class UtilVoiture {

	public static void main(String[] args) {
		Voiture maVoiture;
		maVoiture = new Voiture();
		
		maVoiture.tableaudebord();
		maVoiture.changerCouleur();
		maVoiture.ajouterKms();
		maVoiture.accelerer();
		maVoiture.decelerer();
		maVoiture.tableaudebord();
		maVoiture.decelerer();
		maVoiture.stopFeuRouge();
		maVoiture.tableaudebord();
	}
}