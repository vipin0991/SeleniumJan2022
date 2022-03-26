import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandleAssign5 {
	
	public void copy() throws IOException {
		File f = new File("../Project2/src/package3/dc/Assign3.txt");
		File f1 = new File("../Project2/src/package3/dc/Assign5.txt");
		
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f1);
		
		BufferedReader b = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String str;
		while((str=b.readLine())!=null) {
			bw.write(str+"	**Copied Data");
			bw.newLine();
		}
		
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileHandleAssign5 ob = new FileHandleAssign5();
		ob.copy();
		
	}

}
