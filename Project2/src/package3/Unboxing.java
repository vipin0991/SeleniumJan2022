package package3;

public class Unboxing {
	
//automatic transformation of wrapper types (Integer, Float & Double) 
	//into their primitive equivalent (int, float, double) is known as Unboxing.
	
	public static void main(String[] args) {
		
		// creating an Integer Object
		// with value 10.
		
		Integer i = new Integer(10);
		
		// unboxing the Object
		int i1 = i;
		
		System.out.println("value of i : "+i);
		System.out.println("value of i1 : "+i1);
	}

}
