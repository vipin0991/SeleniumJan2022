package package3;

import java.util.Scanner;

public class Scan {
	
	public int sum(int x, int y) {
		int sum = x+y;
		return sum;
	}
	public int sub(int x, int y) {
		int sub = x-y;
		return sub;
	}
	public int multi(int x, int y) {
		int multi = x*y;
		return multi;
	}
	public void div(float x, float y) {
		float div = x/y;
		System.out.println("Final value is "+div);
	}
	
	public static void main(String[] args) {
		Scan l = new Scan();
		Scanner s = new Scanner(System.in);
		
		/*
		 * //Scanner s1 = new Scanner(System.in);
		 * System.out.println("Enter first integer value"); int x1 = s.nextInt();
		 * //System.out.println("Value of x1 : "+x1);
		 * 
		 * System.out.println("Enter second integer value"); int x2 = s.nextInt();
		 * //System.out.println("value of x2 : "+x2);
		 * 
		 * System.out.println("Enter third integer value"); int x3=s.nextInt();
		 * //System.out.println("value of x3 : "+x3);
		 * 
		 * System.out.println("Enter fourth integer value"); int x4 = s.nextInt();
		 * //System.out.println("value of x4 : "+x4);
		 * 
		 * System.out.println("Enter fifth integer value"); int x5 = s.nextInt();
		 * //System.out.println("value of x5 : "+x5 );
		 * 
		 * System.out.println("Enter sixth integer value"); int x6 = s.nextInt();
		 * //System.out.println("value of x6 : "+x6);
		 * 
		 * 
		 * 
		 * int sumResult1 = l.sum(x1, x2); int subResult1 = l.sub(sumResult1, x3); int
		 * sumResult2 = l.sum(subResult1, x4); int multResult = l.multi(sumResult2, x5);
		 * l.div(multResult, x6);
		 */
		
		String s1 = s.nextLine();
		System.out.println(s1);
		
		
	}

}
