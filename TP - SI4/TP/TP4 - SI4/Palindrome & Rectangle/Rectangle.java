import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longueur;
		int largeur;
		Scanner x=new Scanner (System.in);
		
		
		
		System.out.println("Veuillez rentrer la largeur désiré ?");
		largeur = x.nextInt();
		System.out.println("Veuillez rentrer la longueur désiré ?");
		longueur = x.nextInt();
		
		
		for(int i = 0; i< largeur;i++) {
			for(int j = 0; j< longueur; j++) {
					System.out.print("*");	
			}
			System.out.println("");
		}

}
}
