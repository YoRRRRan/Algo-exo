import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Algo4 {

		public static void main(String[] args) {
			Scanner myNum = new Scanner(System.in);
			System.out.println("Please enter a few number and finish by 0");
			List<Integer> listToSort = new ArrayList<>();
			
			int x = 1;					                               //Define x to be able to enter in while
					
			while(x != 0) {
				x =  myNum.nextInt();                                  //Replace x with the input 
				listToSort.add(x);
			}
			
			Collections.sort(listToSort);                              //Automatic sort, easy mode
			System.out.println(listToSort);
	}
}