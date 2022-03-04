package package1;

public class Consrcta1 {
	
	public Consrcta1(){
		this(1,9,7);
		System.out.println("This is default Constructor");
	}
	public Consrcta1(int a)
	{		this(4,2,7,9);
		System.out.println("This is one parametrize Constructor");
	}
	public Consrcta1(int a, int b){
		this();
		System.out.println("This is two parametrize Constructor");
	}
	public Consrcta1(int a, int b, int c){
		System.out.println("This is three parametrize Constructor");
	}
	public Consrcta1(int a, int b, int c, int d){
		this(4,9);
		System.out.println("This is four parametrize constructor");
	}
	public static void main(String[] args) {
		Consrcta1 ob = new Consrcta1(2);
	}

}
