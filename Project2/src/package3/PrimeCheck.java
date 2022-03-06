package package3;

import java.util.Scanner;


public class PrimeCheck {
	public void prime(int x) {
		
		int j = 0;
		
		if(x==0 || x==1)
			j=j+1;
		
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				j++;
				break;
			}
		}
		
		if(j==0) 
			System.out.println("****Prime****");
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
