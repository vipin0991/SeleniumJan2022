package package3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleAssign1 {
	
	public void ReadData(int r) throws IOException {
		//File f = new File("E:/LocalRepo/Project2/src/package3/Mac.txt");
		File f = new File("../Project2/src/package3/dc/19thMarch20022.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		
		String s;
		int i=1,j=0;
		while((s=b.readLine())!=null){
			
			 if(i==r) { 
				 System.out.println(s); 
				 j++;
				 }
			i++;
		}
		//System.out.println(i);
		if(j==0)
			System.out.println("No data available at this line");
		
	}
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row No.");
		int Rw = s.nextInt();
				
		FileHandleAssign1 fa = new FileHandleAssign1();
		fa.ReadData(Rw);
	}

}
