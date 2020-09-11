import java.util.Scanner;

public class Palindrometest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner (System.in);
		String mot;
		String motinv ="";
		int rep = 0;
		
		System.out.println("Veuillez entrer un mot ?");
		mot=x.nextLine();
		
		int length = mot.length();
		
		for (int i = length - 1; i>= 0; i--) {
		motinv = motinv + mot.charAt(i);}
		
		if (mot.equals(motinv)) {
			System.out.println("Le mot est un palindrome.");
		}
		else {
			System.out.println("Le mot n'est pas un palindrome.");
		}
		
		}	
	}


