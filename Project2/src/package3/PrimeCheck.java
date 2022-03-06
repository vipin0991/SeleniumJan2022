package package3;

import java.util.Scanner;


public class PrimeCheck {
	
	
	public void prime(int x) {
		
		int y=0;
		
		if(x>1) {
			if(x%2==0) {
				System.out.println("Number is not prime");
			}
			else
				y++;
		}
		else if(y==0) {
			System.out.println("Number is prime");
		}
		else
			System.out.println("Not Prime");
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter number");
		int x = s.nextInt();
		
		PrimeCheck p = new PrimeCheck();
		p.prime(x);
		
	}

}
