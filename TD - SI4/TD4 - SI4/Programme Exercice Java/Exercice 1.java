import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Déclaration variable 
		int nbTable, rep;
		int nbMulti = 10;
		int i = 0;
		
		Scanner x=new Scanner(System.in);
		// Demande de saisit et récupération d'un numéro au choix 
		System.out.println("Veuillez saisir un numéro de table.");
		nbTable=x.nextInt();
		
		
		for (i=0; nbMulti>=i; i++){
			rep=nbTable*i;
			System.out.println(+nbTable+" X "+i+" = "+rep);
		}
		
			System.out.println("\nAu revoir !");
		
		
		
		
		
		
	}

}
