package package3;

import java.util.Scanner;

public class Fact {
	
	public int fact(int a, int b) {
		int fact = 1;
		/*
		 * while(b>0) { a = a*b; b--; } return a;
		 */
		for(int i=1;i<=a;i++) {
			fact = fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int num = s.nextInt();
		int dec = num-1;
		
		Fact f = new Fact();
		int factValue = f.fact(num,dec);
		
		System.out.println("Factorial of number is "+factValue);
		
	}
	
}
