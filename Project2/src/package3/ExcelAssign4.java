package package3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelAssign4 {

		public void writeData(int p, int q) throws IOException, RowsExceededException, WriteException {
			File f = new File("../Project2/src/package3/bddWrite.xls");
			WritableWorkbook wk = Workbook.createWorkbook(f);
			WritableSheet ws = wk.createSheet("VP", 0);
			Scanner s1 = new Scanner(System.in);
			
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.println("Enter Row "+(i+1)+" & Column "+(j+1)+" Data");
					String w = s1.nextLine();
					
					Label l = new Label(j,i,w);
					ws.addCell(l);
				}
			}
			
			wk.write();
			wk.close();
		}
	
		public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Row count");
			int row = s.nextInt();
			System.out.println("Enter column count");
			int col = s.nextInt();
			
			ExcelAssign4 ob =  new ExcelAssign4();
			ob.writeData(row, col);
			
				
		}
}
