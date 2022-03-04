package package1;

public class Multi {
	
	public int sum( int a, int b) {
		int c;
		c= a+b;
		return c;
		
	}
	
	public int sub( int a, int b) {
		int c;
		c= a-b;
		return c;
	}
	public void mul( int a, int b) {
		int c;
		c= a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		int x = m.sum(5, 2);
		int y = m.sub(12, 5);
		m.mul(x, y);
		
	}

}
