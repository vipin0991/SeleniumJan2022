package package3;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter one word String: ");
		String s1 = s.next();
		
		int j = s1.length();
				
		String s2="";
		
		for(int i=j-1;i>=0;i--) {
			s2 = s2+s1.charAt(i);
		}
		if(s1.equals(s2))
			System.out.println("String is Palindrome : " +s2);
		else
			System.out.println("Not Palindrome : " +s2);
	}

}
