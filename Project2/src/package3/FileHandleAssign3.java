package package3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleAssign3 {
	
	public void writeData(int r) throws IOException {
		
		int i=1;
		
		File f = new File("../Project2/src/package3/dc/Assign3.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter b = new BufferedWriter(fw);
		
		Scanner s1 = new Scanner(System.in);
		for(i=1;i<=r;i++){
			 System.out.println("Enter Line "+i+" data:");
			 String x1 = s1.nextLine();
			 b.write(x1);
			 b.newLine();
		}
			
		b.close();
		
		if(r<1) {
			System.out.println("Invalid Line Number");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of line to write in file");
		int noOfLine = s.nextInt();
		FileHandleAssign3 ob = new FileHandleAssign3();
		ob.writeData(noOfLine);
		
		
	}


}
