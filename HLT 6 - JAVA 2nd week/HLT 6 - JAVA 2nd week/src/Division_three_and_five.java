// 2. Write a program to display all numbers divisible by 3 and 5

import java.util.Scanner;

public class Division_three_and_five {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Insert a number, to check all numbers divisible by 3 and 5. From 0 to the number of your choice.");
		System.out.println("Insert your choice : ");
		int n = s1.nextInt();
		
		for (int i = 0; i < n; i++) {
		      
		      if (i % 3 == 0 && i % 5 == 0)
					System.out.println(i);
		    }  
	}
}
