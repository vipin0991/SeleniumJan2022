package package3;

public class Ovchild3 extends Ovparent3 {
	
	public void useme() {
		System.out.println("I am child class method");
	}
	public void within(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void within(int a, float b, int c) {
		int e = (int)b;
		int g = a+e+c;
		System.out.println(g);
		
	}
	
	public static void main(String[] args) {
		Ovchild3 c1 = new Ovchild3();
		c1.useme();
		c1.within(3, 6);
		c1.within(4, 2.4f, 9);
		
		Ovparent3 c2 = new Ovparent3();
		c2.useme();
		
	}

}
