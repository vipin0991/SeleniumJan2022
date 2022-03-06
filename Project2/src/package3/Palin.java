package package3;

import java.util.Scanner;

public class Palin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = s.nextInt();
		int rev = 0; int rem = 1;
		
		while(num>0)
		{
		rem = num%10; //568 return reminder 8,
		rev = rev*10+rem; //0*10+8 = 8, 1*10+5 = 15
		num = num/10; //485, 48	 
		}		
		System.out.println("Reversed No. is : "+rev);
		
		
	}

}