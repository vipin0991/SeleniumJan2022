package package3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssign2 {
	public void ReadDataBasedUponRowNo(int p) throws BiffException, IOException {
		File f = new File("../Project2/src/package3/bdd.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		
		int row = ws.getRows();
		int col = ws.getColumns();
		
		if(p<0||p>=row) {
			System.out.println("Invalid row number");
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==p) {
					Cell c1 = ws.getCell(j,i);
					System.out.println(c1.getContents());
				}
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row No. to fetch data");
		int r = s.nextInt();
		
		ExcelAssign2 ob= new ExcelAssign2();
		ob.ReadDataBasedUponRowNo(r-1);

	}

}
