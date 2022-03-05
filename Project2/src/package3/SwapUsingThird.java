package package3;

import java.util.Scanner;

public class SwapUsingThird {
	
	static int a, b;
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		a = s.nextInt();
		
		System.out.println("Enter second number");
		b= s.nextInt();
		
		int c= a+b;//5
		a= c-a;  //2
		b=c-a;//3
		
		System.out.println("Value of first number : "+a);
		System.out.println("Value of second number : "+b);
		
		
		/*
		 * System.out.println("Enter third variable"); x= s.nextInt();
		 * 
		 * System.out.println("Enter fourth variable"); y =
		 * 
		 * a = a+b; //5 b = a-b; //3 a= a-b;
		 * System.out.println("Value of first number : "+a);
		 * System.out.println("Value of second number : "+b);
		 */
		 
		
		
	}

}
