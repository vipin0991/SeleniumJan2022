package package3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssign1 {	
	public void ReadDataBasedUponRowNoAndColumnNo(int p, int q) throws BiffException, IOException {
		File f = new File("../Project2/src/package3/bdd.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
	
		if(p<0 || q<0) {
			System.out.println("Invaild row and column number");
		}
					
		int r = ws.getRows();
		int c = ws.getColumns();
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				Cell c1 = ws.getCell(j, i);
				if(i==p && j==q) {
						System.out.println(c1.getContents());					
				}
			}
		} 
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row No");
		int r = s.nextInt();
		System.out.println("Enter Column No");
		int c = s.nextInt();
		
		ExcelAssign1 ob = new ExcelAssign1();
		ob.ReadDataBasedUponRowNoAndColumnNo(r-1,c-1);

	}

}
