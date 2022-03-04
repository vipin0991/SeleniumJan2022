package package3;

public class Classthis {
	
	int a;
	
	public int method(int a) {
		this.a = a;
		return a;
	}
	
	public static void main(String[] args) {
		Classthis c = new Classthis();
		
		c.method(34);
		
		System.out.println("Value of global variable "+c.a);
	}

}
