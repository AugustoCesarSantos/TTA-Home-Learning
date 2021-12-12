//1. Write a menu driven program for Calculator. It must have + , - , * , / , % operations

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws InterruptedException 
	{
		double n1, n2, result;
		String answer;
		Scanner s1 = new Scanner(System.in);
		
		do {
			System.out.println("Hi there! I'm your personal JAVA Calculator.");
			System.out.println(" ");
			System.out.println("Please select your operation:");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (x)");
			System.out.println("4. Division (÷)");
			System.out.println("5. Modulus (%)");
			System.out.println("-----------------------------");
			System.out.println("Insert your choice : ");
			int ch = s1.nextInt();
			
			switch(ch) {
				case 1:
						System.out.println("-----------------------------");
						System.out.println("Addition (+)");
						System.out.println("Enter first number : ");
						n1 = s1.nextDouble();
						System.out.println("Enter second number : ");
						n2 = s1.nextDouble();
						result = n1 + n2;
						System.out.println("The result of this sum is: "+ result);
					break;
				case 2:
						System.out.println("-----------------------------");
						System.out.println("Subtraction (-)");
						System.out.println("Enter first number : ");
						n1 = s1.nextDouble();
						System.out.println("Enter second number : ");
						n2 = s1.nextDouble();
						result = n1 - n2;
						System.out.println("The result of this subtraction is: "+ result);
					break;
				case 3:
						System.out.println("-----------------------------");
						System.out.println("Multiplication (x)");
						System.out.println("Enter first number : ");
						n1 = s1.nextDouble();
						System.out.println("Enter second number : ");
						n2 = s1.nextDouble();
						result = n1 * n2;
						System.out.println("The result of this multiplication is: "+ result);
					break;
				case 4:
						System.out.println("-----------------------------");
						System.out.println("Division (÷)");
						System.out.println("Enter first number : ");
						n1 = s1.nextDouble();
						System.out.println("Enter second number : ");
						n2 = s1.nextDouble();
						result = n1 / n2;
						System.out.println("The result of this division is: "+ result);
					break;
				case 5:
						System.out.println("-----------------------------");
						System.out.println("Modulus (%)");
						System.out.println("Enter first number : ");
						n1 = s1.nextDouble();
						System.out.println("Enter second number : ");
						n2 = s1.nextDouble();
						result = n1 % n2;
						System.out.println("The result of this reminder of this division is: "+ result);
					break;
				
				default:
					System.out.println("Choice is not available.");
				}
				System.out.println("-----------------------------");
				System.out.println(" ");
				System.out.println("Do you want to continue ? (y/n) : ");
				answer = s1.next();
			}
		while(answer.equalsIgnoreCase("y"));
			if (answer.equalsIgnoreCase("n")){
					System.out.println("Ending the program...");
					Thread.sleep(1500); 
					System.out.println("Bye! Have a nice day!");
		}
						
	}

}


