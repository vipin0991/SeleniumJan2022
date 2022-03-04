package package1;

public class Massignone {
	
	public int sum(int a, int b) {
		int c;
		c = a+b;
		return c;		
	}
	
	public int sub(int a, int b) {
		int c;
		c = a-b;
		return c;		
	}
	
	public int mul(int a, int b) {
		int c;
		c = a*b;
		return c;		
	}
	public void div(int a, int b) {
		int c;
		c = a/b;
		System.out.println("Finalresult is : "+c);		
	}
	public static void main(String[] args) {
		Massignone m = new Massignone();
		int sumresult1 = m.sum(10, 2);
		int sumresult2 = m.sum(sumresult1, 2);
		int subresult = m.sub(sumresult2, 2);
		int mulresult = m.mul(subresult, 2);
		m.div(mulresult, 2);
	}

}
