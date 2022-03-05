package package3;

import java.util.Scanner;

public class Swap {
	
	static int x,y;
	
	public static void main(String[] args) {
		
		System.out.println("Enter First Variable");
		Scanner s = new Scanner(System.in);
		
		x= s.nextInt();
		
		System.out.println("Enter second variable");
		y = s.nextInt();
		
		x= x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of first variable : "+x);
		System.out.println("Value of second variable : "+y);
		
	}

}
