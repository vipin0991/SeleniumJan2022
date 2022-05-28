package package3.dc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FacebookDataProviderAssign {
	
	ChromeDriver driver;
	
	@Test(dataProvider="dp2")
	public void testcase1(String user, String pass) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "../Project2/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(6000);
		
		//Boolean res = driver.findElement(By.xpath("")).isDisplayed();
		//boolean res= driver.findElement(By.xpath("//div[@aria-label='Your profile' and @role='button']")).isDisplayed();
		String str = driver.getTitle();
		System.out.println("@@@@@@@@@@@@@@"+str);
	
		System.out.println(driver.getCurrentUrl());
		//str.contains("Facebook")
	
		if(driver.getCurrentUrl().equals("https://www.facebook.com/?sk=welcome")){
			Thread.sleep(6000);
			driver.findElement(By.xpath("//div[@aria-label='Your profile' and @role='button']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		    Thread.sleep(2000);
		    driver.quit();

		}
		else{
			Thread.sleep(6000);
			driver.navigate().back();
			Thread.sleep(4000);
			driver.quit();
		}
		
	
	}
	
	@DataProvider
	public Object[][] dp2() throws BiffException, IOException {
		File f= new File("../Project2/Input.xls");
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
	


