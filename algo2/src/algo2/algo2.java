package algo2;

//import d'une classe supplémentaire utilisée par mon code
import java.util.Scanner;

public class algo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total=0;
		int newScanner=0;
		
		System.out.println("entrez un nombre entre 0 et 100");
		Scanner scanNombre = new Scanner(System.in);
		newScanner = scanNombre.nextInt();
		
		
		for(int compteur=0; compteur<=newScanner ; compteur++) {
					
			total= compteur + total; 
		}
		System.out.println(total);
	}

}
