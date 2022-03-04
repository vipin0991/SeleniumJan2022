package package3;

public class Parent {
	
	public Parent() {
		this(1,3,9);
		System.out.println("parent default constructor");
	}
	public Parent(int a) {
		this(4,9);
		System.out.println("parent 1 parameterized constructor");
	}
	public Parent(int a, int b) {
		this();
		System.out.println("parent 2 parameterized constructor");
	}
	public Parent(int a, int b, int c) {
		System.out.println("parent 3 parameterized constructor");
	}

}
