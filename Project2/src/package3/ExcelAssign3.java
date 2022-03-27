package package3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssign3 {
	public void ReadDataBasedUponRange(int p, int q) throws BiffException, IOException {
		File f = new File("../Project2/src/package3/bdd.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		
		int row = ws.getRows();
		int col = ws.getColumns();
		
		if(p<-1||p>=row) {
			System.out.println("Invalid row number");
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==p || (i>p && i<=q)) {
					Cell c1 = ws.getCell(j,i);
					System.out.println(c1.getContents());
				}
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter initial row number");
		int r1 = s.nextInt();
		System.out.println("Enter initial row number");
		int r2 = s.nextInt();

		ExcelAssign3 ob = new ExcelAssign3();
		ob.ReadDataBasedUponRange(r1-1,r2-1);
	}

}
