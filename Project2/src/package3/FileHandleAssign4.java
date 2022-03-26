package package3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleAssign4 {
	
	public void WriteDataInaRange(int p, int q) throws IOException {
		
		int i = 1;
		File f = new File("../Project2/src/package3/dc/Assign4.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner s1 = new Scanner(System.in);
		
		for(i=1;i<=q;i++) {			
			if(i==p || i>p)
			{
			System.out.println("Enter Line "+i+" data");
			String x1 = s1.nextLine();
			bw.write(x1);
			bw.newLine();
			}
			else {
				  bw.newLine();
			}	
		}
		if(q ==0) {
			System.out.println("Invalid Row Number to write data");
		}
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Row Number to write data");
		int r1 = s.nextInt();
		
		System.out.println("Enter last row number to finish write data");
		int rf = s.nextInt();
		
		FileHandleAssign4 ob = new FileHandleAssign4();
		ob.WriteDataInaRange(r1, rf);

	}

}
