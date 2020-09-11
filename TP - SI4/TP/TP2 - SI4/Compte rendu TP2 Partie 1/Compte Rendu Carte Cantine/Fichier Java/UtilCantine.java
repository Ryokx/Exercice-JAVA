public class UtilCantine
{
	public static void main(String[] args)
	{
		CarteCantine maCarte;
		maCarte = new CarteCantine();
		maCarte.crediterCarte();
		maCarte.debiterCarte();
		maCarte.afficherSolde();
		maCarte.debiterCarte();
		maCarte.crediterCarte();
		maCarte.afficherSolde();
		
	}
}