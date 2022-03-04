package package3;

public class Parent2 {
	public void pm() {
		this.pm3(3,6,1);
		System.out.println("parent default method");
	}
	public void pm1(int a) {
		this.pm2(3, 7);
		System.out.println("parent 1 parametrized method");
	}
	public void pm2(int a, int b) {
		this.pm();
		System.out.println("parent 2 parametrized method");
	}
	public void pm3(int a, int b,int c) {
		System.out.println("parent 3 parametrized method");
	}
}
