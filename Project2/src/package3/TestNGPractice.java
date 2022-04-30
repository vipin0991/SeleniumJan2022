package package3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	@BeforeMethod
	public void bmethod() {
		System.out.println("Before method");
	}
	@BeforeClass
	public void bclass() {
		System.out.println("Before Class");
	}
	@BeforeTest
	public void btest() {
		System.out.println("Before Test");
	}
	@BeforeSuite
	public void bsuite() {
		System.out.println("Before Suite");
	}
	
	@Test(priority=0)
	public void test() {
		System.out.println("==Test P0==");
	}
	@Test(dependsOnMethods="test")
	public void test2() {
		System.out.println("==Test P1==");
	}
	
	@AfterSuite
	public void asuite() {
		System.out.println("After Suite");
	}
	@AfterTest
	public void atest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void aclass() {
		System.out.println("After Class");
	}
	@AfterMethod
	public void amethod() {
		System.out.println("After Method");
	}
}
