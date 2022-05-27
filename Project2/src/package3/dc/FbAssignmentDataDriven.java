package package3.dc;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FbAssignmentDataDriven {

	@Test(dataProvider="dp2")
	public void testcase1(String user, String pass) {
		System.out.println("Username is : "+user);
		System.out.println("Password is : "+pass);
		
	}
	
	//return Array of Object
	@DataProvider
	public Object[][] dp1(){
		Object[][] ob = new Object[3][2]; //3 row, 2 column
		ob[0][0]="user1";
		ob[0][1]="password1";
		
		ob[1][0]="user2";
		ob[1][1]="password2";
		
		ob[2][0]="user3";
		ob[2][1]="password3";
		
		return ob;
		
	}

	@DataProvider
	public Object[][] dp2() throws BiffException, IOException {
		File f= new File("../SeleniumJan2022/Input.xls");
		Workbook wk = Workbook.getWorkbook(f);
		
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
	
		Object[][] ob = new Object[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				Cell c1 = ws.getCell(j,i);
				ob[i][j] = c1.getContents();
			}
		}
		return ob;
	}
}
