public class UtilDisqueDur
{
	public static void main(String args[])
	{
		DisqueDur monDisque;
		monDisque = new DisqueDur();
		monDisque.ajoutFichiers();
		monDisque.proprietes();
		monDisque.ajoutPart();
		monDisque.ajoutFichiers();
		monDisque.augmenterEspOccup();
		monDisque.proprietes();
		monDisque.espaceLibre();
		monDisque.supprFichiers();
		monDisque.ajoutPart();
		monDisque.supprPart();
		monDisque.diminuerEspOccup();
		monDisque.proprietes();
	}
}