package JavaAssignments;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		int x;
		
		System.out.println("Enter an integer to check if it is odd or even !");
		Scanner in = new Scanner(System.in); // Why do we have to use Scanner Package?
		 x = in.nextInt();
		 
		 if (x % 2 ==0) // Why we have to use Modulus 2 == 0, If I use 1 instead of 2, I am getting same output?.
			 
			 System.out.println("This number is even.");
		 
		 else
			 System.out.println("This number is odd.");
		

	}

}
