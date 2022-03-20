package package3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Filehandleassign2 {
	public void readDataOfaRange(int x, int y) throws IOException {
		//File f= new File("E:/LocalRepo/Project2/src/package3/Mac.txt");
		File f= new File("../Project2/src/package3/dc/19thMarch2022.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		String s;
		
		  int i=1, j=0,k=1,m=0; for(k=1,j=1;k<=10;k++,j++) {
		  
		  if(k==x && y<9) { for(j=1;j<=y-m;j++) { System.out.println(b.readLine());
		  i++; } } else { b.readLine(); m++; } if(i>1) { break; } } if(x==0 ||
		  x>8||y<1||x>y||y>8) System.out.println("Invalid Row Numbers");
		 
		/*
		 * for(int k=1;k<x;k++) { b.readLine(); } for(int m=x;m<=y;m++) {
		 * System.out.println(b.readLine()); }
		 */
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Filehandleassign2 fa = new Filehandleassign2();		
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter First line number");
		int strLine = s.nextInt();
	    System.out.println("Enter Last line number to print from first line");
		int endLine = s.nextInt();
		fa.readDataOfaRange(strLine, endLine);
	}

}
