package package3;

import java.util.Scanner;

public class StringSentRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string sentence");
		String str = s.nextLine();
		String[] s2 = str.split(" ");
		
		System.out.println("-----------------");
		for(int i=s2.length-1;i>=0;i--) {
			System.out.print(s2[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----------------");
		for(int j=0;j<s2.length;j++) {
		int len = s2[j].length();
			for(int k=len-1;k>=0;k--) {
				System.out.print(s2[j].charAt(k));
			}
			System.out.print(" ");
		}
		System.out.println();
		
		System.out.println("-----------------");
		for(int x=s2.length-1;x>=0;x--) {
			int len2 = s2[x].length();
			for(int y=len2-1;y>=0;y--) {
				System.out.print(s2[x].charAt(y));
			}
			System.out.print(" ");
		}		
	}
}
