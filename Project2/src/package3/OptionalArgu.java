package package3;

import java.util.Scanner;

public class OptionalArgu {
	
	public void method(String... a) {
		System.out.println("Default Method");
		System.out.println(a[0]);
		System.out.println(a[0]+" "+a[1]);
	}
	
	public static void main(String[] args) {
		OptionalArgu op = new OptionalArgu();
		
		op.method("My");
		//op.method("My","Name");
		//op.method("My","Name","Is");
	}

}
