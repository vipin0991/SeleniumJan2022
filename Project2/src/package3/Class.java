package package3;

public class Class extends Parent{
	public Class() {
		super(4);
		System.out.println("child default constructor");
	}
	public Class(int a) {
		this(4,4,7);
		System.out.println("child 1 parametrized constructor");
	}
	public Class(int a, int b) {
		this(4);
		System.out.println("child 2 parametrized constructor");
	}
	public Class(int a, int b, int c) {
		this();
		System.out.println("child 3 parametrized constructor");
	}
	public static void main(String[] args) {
		Class c = new Class(2,4);
	}
}
