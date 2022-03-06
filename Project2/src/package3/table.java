package package3;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for which you want to write table");
		int num =s.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
	}
	
}

//8*1 = 8
//8*2 = 16
