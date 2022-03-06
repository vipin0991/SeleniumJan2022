package package3;

import java.util.Scanner;

public class Palin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = s.nextInt();
		int rev = 0, rem = 1, OriNum;
		OriNum = num;
		
		while(num>0)
		{
		rem = num%10; //568 return reminder 8,
		rev = rev*10+rem; //0*10+8 = 8, 1*10+5 = 15
		num = num/10; //485, 48	 
		}		
		
		if(OriNum == rev)
		System.out.println("**Number is Palidrome**");
		else
			System.out.println("**Number is not Palindrome");
		
		
	}

}