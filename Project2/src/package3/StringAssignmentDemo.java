package package3;

import java.util.Scanner;

public class StringAssignmentDemo {
	
	public void demo(String w) {
		
		String temp;
		String result = "";
		
		for(int i=0;i<w.length();i++) {
			//temp = "";
			for(int j=0;j<=i;j++) {
				result = result+w.charAt(i);
			}
			//result =  result + temp;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any String value");
		String s1 = s.next();
		
		StringAssignmentDemo ob =  new StringAssignmentDemo();
		
		ob.demo(s1);
		//string is demo
		//Output should be deemmmoooo
		/*
		 * i = 0, j = 0; temp = d, result = d
		 * i=1, j=0, temp = d+e
		 * 
		 * 
		 */
	}

}
