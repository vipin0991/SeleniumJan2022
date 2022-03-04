package package1;

public class Methodchaining {
	
	public void method() {
		this.method3(2, 6, 1);
		System.out.println("Default Method");
	}
	public void method1(int a) {
		this.method();
		System.out.println("This is one parametrized method");
	}
	public void method2(int a, int b) {
		this.method1(3);
		System.out.println("This is two parametrized method");
	}
	public void method3(int a, int b, int c) {
		System.out.println("This is three parametrized method");
	}
	public void method4(int a, int b, int c, int d) {
		this.method2(2, 9);
		System.out.println("This is four parametrized method");
	}
	public void method5(int a, int b, int c, int d, int e) {
		this.method4(2, 3, 4, 5);
		System.out.println("This is five parametrized method");
	}

    public static void main(String[] args) {
		//Methodchaining m = new Methodchaining();
		//m.method5(2, 8, 3, 6, 1);
		Classp1A c1 = new Classp1A();
		c1.method();
	}
		
	}
	

