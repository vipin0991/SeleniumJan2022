package package3;

import java.util.Scanner;

public class Looptest {
	
	public void m1(int n) {
		int rem = 0, sum=0,k=0;
		/* Prime
		 * int j=0;
		 * 
		 * if(n==0 || n==1) { j++; }
		 * 
		 * for(int i=2;i<=n/2;i++) { if(n%2==0) { j++; break; } }
		 * 
		 * if(j==0) System.out.println("prime"); else System.out.println("Non prime");
		 */
		while(n>0) {
		rem=n%10;
		//System.out.println(rem);
		sum=sum*10+rem;
		//System.out.println(sum);
		n=n/10;
		//System.out.println(n);
		//System.out.println("******");
		}
		System.out.println(sum);
		//return rem;
		
	}
	
	public static void main(String[] args) {
		
		Looptest l = new Looptest();
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		int s1 = s.nextInt();
		l.m1(s1);
		/*
		 * int p = l.m1(s1); if(p = s1) System.out.println("PAlin"); else
		 * System.out.println("Not Pali");
		 */
		
		
	}

}
