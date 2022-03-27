package package3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelAssign5 {
	
	public void copyExcelData() throws IOException, RowsExceededException, WriteException, BiffException {
		File f = new File("../Project2/src/package3/bdd.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		
		int row = ws.getRows();
		int col = ws.getColumns();
		
		File f1 = new File("../Project2/src/package3/bddCopy.xls");
		WritableWorkbook wk1 = Workbook.createWorkbook(f1);
		WritableSheet ws1 = wk1.createSheet("VP", 0);

		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//System.out.println(i);
				Cell c1 = ws.getCell(j,i);
				//System.out.println(c1.getContents());
				Label l = new Label(j,i,c1.getContents());
				ws1.addCell(l);
			}
		}
		
		wk1.write();
		wk1.close();
	}

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException, BiffException {		
		ExcelAssign5 ob =  new ExcelAssign5();
		ob.copyExcelData();
		
	}

}
