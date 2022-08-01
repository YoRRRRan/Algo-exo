package algo3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class algo3 {

	public static void main(String[] args) {
		int[] numbers = new int[20];

		Scanner sc = new Scanner(System.in);

		// Utilise le args tableau s'il est rempli
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				numbers[i] = Integer.parseInt(args[i]);
			}
		} else {
			//args est vide donc il faut les saisir à la main
			System.out.println("Enter 20 numbers");
			for (int i = 0; i < 20; i++) {
				numbers[i] = sc.nextInt();
			}
		}

		int highest = 0;
		//boucle pour trouver le numéro le plus haut
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > highest)
				highest = numbers[i];
		}

		System.out.println(String.format("%d is the highest number in list", highest));
		sc.close();
		
	
	}

}