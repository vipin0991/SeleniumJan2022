package package3;

public class Autoboxing {
	
//When the Java compiler automatically transforms the 
//	primitive type (int, float, double etc.) into 
	//their object equivalents or wrapper type (Integer, Float and Double); 
	//then it is called autoboxing.
	
	public static void method1(Integer num) //Integer object 
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
	    /* passed int (primitive type), it would be

	        * converted to Integer object at Runtime

	    */
		
		method1(2);
	}

}
