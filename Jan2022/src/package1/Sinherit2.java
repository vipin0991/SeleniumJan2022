package package1;

public class Sinherit2 extends Sinherit1 {
	
	public void child1Method() {
		System.out.println("I am Child Class 1 Method");
	}
	
	public static void main(String[] args) {
		Sinherit2 s2 = new Sinherit2();
		s2.method();
		s2.a = 10;
		System.out.println(s2.a);
	}

}
