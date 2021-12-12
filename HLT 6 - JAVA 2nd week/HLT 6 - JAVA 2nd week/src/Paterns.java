
public class Paterns {

public static void main(String args[]) { 

	int line=10;
	
	for (int i=0; i<=line; i++) 
	{
		for (int j=line; j>=i; j--) 
		{
			System.out.print(" ");
		}
		
		for (int k=0; k<=i; k++) 
		{
					
			System.out.print(" *");
		}
		
		System.out.println(" ");
		
	 }
  }
} 
