package package1;

public class Massigntwo {
	public int sum(int a, int b) {
		int c=a+b;
		return c;		
	}
	public int sub(int a, int b) {
		int c = a-b;
		return c;
	}
	public int mul(int a, int b) {
		int c = a*b;
		return c;
	}
	public void div(int a , int b) {
		int c = a/b;
		System.out.println("Final result is : "+c);
	}
	public static void main(String[] args) {
		Massigntwo m = new Massigntwo();
		int mulResult = m.mul(10,2);
		int subResult = m.sub(mulResult,2);
		int mulResult2 = m.mul(subResult, 2);
		int sumResult = m.sum(mulResult2,2);
		m.div(sumResult, 2);
	}

}
