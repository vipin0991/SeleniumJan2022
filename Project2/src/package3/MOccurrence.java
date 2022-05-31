package package3;

import java.util.Scanner;

public class MOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string sentence");
		String str = s.nextLine();
		String[] s2 = str.split(" ");
		
		System.out.println();		
		System.out.println("-----------------");
		int p = 0;
		for(int m=0;m<s2.length;m++) {
			int len3 = s2[m].length();
			for(int n=0;n<len3;n++) {
				char s0 = s2[m].charAt(n);
				if(s0=='m'){
					p++;
				}
			}
		}
		System.out.println("Occurrence of m is :"+p);
		System.out.println("-----------------");
		

	}

}
