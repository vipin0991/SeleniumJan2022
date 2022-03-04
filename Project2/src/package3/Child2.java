package package3;

public class Child2 extends Parent2  {
	public void cm() {
		super.pm1(2);
		System.out.println("Child default method");
	}
	public void cm1(int a) {
		this.cm3(2, 4, 1);
		System.out.println("Child 1 parametrized method");
	}
	public void cm2(int a,int b) {
		this.cm1(2);
		System.out.println("Child 2 parametrized method");
	}
	public void cm3(int a,int b,int c) {
		this.cm();
		System.out.println("Child 3 parametrized method");
	}
	public static void main(String[] args) {
		Child2 c2 = new Child2();
		//c2.pm2(8,2);
		c2.cm2(3, 5);
		
	}
}
