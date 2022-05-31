package package3;

import java.util.Scanner;

public class MyOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string sentence");
		String str = s.nextLine();
		String[] s2 = str.split(" ");
		
		int c=0;
		for(int d=0;d<s2.length;d++) {
			String w = s2[d];
			if(w.equals("my")) {
				c++;
			}
		}
		System.out.println("Occurrence of my is :"+c);
		System.out.println("-----------------");
		
	}

}
