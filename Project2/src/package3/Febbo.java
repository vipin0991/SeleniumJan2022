package package3;

import java.util.Scanner;

public class Febbo {
	
	public void febo(int a) {
		int i=0, j=1, k=0, l=1;
		System.out.println("Fibonacci series is : ");
		System.out.println(i);
		System.out.println(j);
		
		while(l<=a) {
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			l++;
			
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number to find fibonacci series to that number");
		int num = s.nextInt();
		
		Febbo f = new Febbo();
		f.febo(num);
			
		}
		
	}

