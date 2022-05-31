package package3;

import java.util.Scanner;

public class NumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Numeric String");
		String s1 = s.next();
		
		String s2 = "";
		String s3 = "";
		
		for(int i=0;i<s1.length();i++){
			
			if(s1.charAt(i)=='1')
				s2=s2+s1.charAt(i);
			else
				s3=s3+s1.charAt(i);
		}
		
		String f = s2+s3;
		System.out.println(f);

	}

}
