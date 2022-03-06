package package3;

import java.util.Scanner;

public class Arm {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = s.nextInt();
		int rem, arm=0, originalNum;
		originalNum = num;
		
		while(num>0){
			rem = num%10;
			arm = arm+rem*rem*rem;
			num = num/10;			
		}
		if(arm == originalNum)
			System.out.println("**Prime Number**");
		else 
			System.out.println("**Sorry, Not a prime Number**");
		}

}
